import Dependencies._

ThisBuild / scalaVersion := "2.13.4"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "pfps-book-project"
  )
  .aggregate(core)

lazy val core = (project in file("modules/core"))
  .settings(
    name := "core",
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies ++= Seq(
      compilerPlugin(Libraries.kindProjector cross CrossVersion.full),
      Libraries.cats,
      Libraries.catsRetry,
      Libraries.newtype,
      Libraries.squants
    )
  )
