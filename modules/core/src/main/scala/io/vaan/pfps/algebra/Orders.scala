package io.vaan.pfps.algebra

import io.vaan.pfps.domain.{UserId, OrderId, Order, PaymentId, CartItem}
import squants.market.Money

trait Orders[F[_]] {
  def get(
    userId: UserId,
    orderId: OrderId
  ): F[Option[Order]]

  def findBy(userId: UserId): F[List[Order]]

  def create(
    userId: UserId,
    paymentId: PaymentId,
    items: List[CartItem],
    total: Money
  ): F[OrderId]
}


