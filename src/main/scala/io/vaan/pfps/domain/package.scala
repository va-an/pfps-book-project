package io.vaan.pfps
import io.estatico.newtype.macros.newtype

import java.util.UUID

package object domain {
  // Brand
  @newtype case class BrandId(value: UUID)
  @newtype case class BrandName(value: String)

  // Cart
  @newtype case class Quantity(value: Int)
  @newtype case class Cart(items: Map[ItemId, Quantity])
  @newtype case class CartId(value: UUID)

  // Category
  @newtype case class CategoryId(value: UUID)
  @newtype case class CategoryName(value: String)

  // User
  @newtype case class UserId(value: UUID)
  @newtype case class UserName(value: String)
  @newtype case class Password(value: String)
  @newtype case class JwtToken(value: String)

  // Item
  @newtype case class ItemId(value: UUID)
  @newtype case class ItemName(value: String)
  @newtype case class ItemDescription(value: String)

  // Order
  @newtype case class OrderId(value: UUID)
  @newtype case class PaymentId(value: UUID)
}
