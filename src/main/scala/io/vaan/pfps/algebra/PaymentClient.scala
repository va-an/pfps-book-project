package io.vaan.pfps.algebra

import io.vaan.pfps.domain.{Payment, PaymentId}

trait PaymentClient[F[_]] {
  def process(payment: Payment): F[PaymentId]
}
