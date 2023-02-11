scalaVersion := "2.13.10"

val rootPath = file(".").getCanonicalFile
val proPath  = rootPath / "scala-version-project"

val scala211 = project in proPath / "scala_211-project"
val scala212 = project in proPath / "scala_212-project"
val scala213 = project in proPath / "scala_213-project"
val scala3   = project in proPath / "scala_3-project"

Global / onChangedBuildSource := ReloadOnSourceChanges
