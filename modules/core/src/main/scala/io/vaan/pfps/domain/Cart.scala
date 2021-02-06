package io.vaan.pfps.domain

import squants.market.Money

case class CartItem(
  item: Item,
  quantity: Quantity
)

case class CartTotal(
  items: List[CartItem],
  total: Money
)