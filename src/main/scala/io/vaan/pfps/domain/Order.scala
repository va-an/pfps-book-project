package io.vaan.pfps.domain

import squants.market.Money

case class Order (
  id: OrderId,
  pid: PaymentId,
  items: Map[ItemId, Quantity],
  total: Money
)
