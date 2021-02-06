package io.vaan.pfps.algebra
import io.vaan.pfps.domain.{Brand, BrandName}

trait Brands[F[_]] {
  def findAll: F[List[Brand]]
  def create(name: BrandName): F[Unit]
}
