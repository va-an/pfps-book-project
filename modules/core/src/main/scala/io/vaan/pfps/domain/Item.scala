package io.vaan.pfps.domain

import squants.market.Money

case class Item (
  uuid: ItemId,
  name: ItemName,
  description: ItemDescription,
  price: Money,
  brand: Brand,
  category: Category
)

case class CreateItem(
  name: ItemName,
  description: ItemDescription,
  price: Money,
  brandId: BrandId,
  categoryId: CategoryId
)

case class UpdateItem(
  id: ItemId,
  price: Money
)
