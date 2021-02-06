package io.vaan.pfps.algebra

import io.vaan.pfps.domain.{Category, CategoryName}

trait Categories[F[_]] {
  def findAll: F[List[Category]]
  def create(name: CategoryName): F[Unit]
}
