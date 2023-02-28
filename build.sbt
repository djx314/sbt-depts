scalaVersion := "2.13.10"

val `root/file`            = file(".").getCanonicalFile
val `version-project/file` = `root/file` / "scala-version-project"

val scala211 = project in `version-project/file` / "scala_211-project"
val scala212 = project in `version-project/file` / "scala_212-project"
val scala213 = project in `version-project/file` / "scala_213-project"
val scala3   = project in `version-project/file` / "scala_3-project"

Global / onChangedBuildSource := ReloadOnSourceChanges
