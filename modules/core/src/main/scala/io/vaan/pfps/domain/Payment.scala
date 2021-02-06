package io.vaan.pfps.domain
import squants.market.Money

case class Payment (
  id: UserId,
  total: Money,
  card: Card
)