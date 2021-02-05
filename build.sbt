name := "pfps"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.13.4"

libraryDependencies += "org.typelevel" %% "cats-core" % "2.3.1"
libraryDependencies += "io.estatico" %% "newtype" % "0.4.4"
libraryDependencies += "org.typelevel"  %% "squants"  % "1.6.0"

scalacOptions += "-Ymacro-annotations"


// scalac options come from the sbt-tpolecat plugin so need to set any here

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.1" cross CrossVersion.full)
