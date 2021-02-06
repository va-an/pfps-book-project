package io.vaan.pfps.algebra

import io.vaan.pfps.domain.{UserName, Password, UserId, User}

trait Users[F[_]] {
  def find(
    username: UserName,
    password: Password
  ): F[Option[User]]

  def create(
    username: UserName,
    password: Password
  ): F[UserId]
}
