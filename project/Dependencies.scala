import sbt._

object Dependencies {
  object Versions {
    val cats          = "2.2.0"
    val catsEffect    = "2.2.0"
    val catsMeowMtl   = "0.4.1"
    val catsRetry     = "2.0.0"
    val circe         = "0.13.0"
    val ciris         = "1.2.1"
    val javaxCrypto   = "1.0.1"
    val fs2           = "2.4.6"
    val http4s        = "0.21.13"
    val http4sJwtAuth = "0.0.5"
    val log4cats      = "1.1.1"
    val newtype       = "0.4.3"
    val refined       = "0.9.19"
    val redis4cats    = "0.10.3"
    val skunk         = "0.0.21"
    val squants       = "1.7.0"

    val betterMonadicFor = "0.3.1"
    val kindProjector    = "0.11.3"
    val logback          = "1.2.3"

    val scalaCheck    = "1.15.2"
    val scalaTest     = "3.2.3"
    val scalaTestPlus = "3.2.2.0"
  }

  object Libraries {
    val cats        = "org.typelevel"     %% "cats-core"      % Versions.cats
    val newtype     = "io.estatico"       %% "newtype"        % Versions.newtype
    val squants     = "org.typelevel"     %% "squants"        % Versions.squants
    val catsRetry   = "com.github.cb372"  %% "cats-retry"     % Versions.catsRetry

    // compiler plugins
    val kindProjector    = "org.typelevel" % "kind-projector"      % Versions.kindProjector
  }
}
