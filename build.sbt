scalaVersion := "2.13.16"

val `root/file`            = file(".").getCanonicalFile
val `version-project/file` = `root/file` / "scala-version-project"

val scala212Project    = project in `version-project/file` / "scala_212-project"
val scala213Project    = project in `version-project/file` / "scala_213-project"
val scala3Project      = project in `version-project/file` / "scala_3-project"
val javaVersionProject = project in `version-project/file` / "java_version-project"

Global / onChangedBuildSource := ReloadOnSourceChanges
