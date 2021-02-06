package io.vaan.pfps.program

import cats.Monad
import cats.implicits._
import io.vaan.pfps.algebra.{Orders, PaymentClient, ShoppingCart}
import io.vaan.pfps.domain.{Card, OrderId, Payment, UserId}

final class CheckoutProgram[F[_]: Monad](
  paymentClient: PaymentClient[F],
  shoppingCart: ShoppingCart[F],
  orders: Orders[F]
) {
  def checkout(userId: UserId, card: Card): F[OrderId] =
    for {
      cart <- shoppingCart.get(userId)

      paymentId <- paymentClient.process(
        Payment(userId, cart.total, card)
      )

      orderId <- orders.create(userId, paymentId, cart.items, cart.total)
      _ <- shoppingCart.delete(userId) // TODO: attempt
    } yield orderId
}
