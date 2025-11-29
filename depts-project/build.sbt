scalaVersion := "2.13.18"

val `root/file`            = file(".").getCanonicalFile
val `version-project/file` = `root/file` / "scala-version-project"

val scala212Project: Project    = project in `version-project/file` / "scala_212-project"
val scala213Project: Project    = project in `version-project/file` / "scala_213-project"
val scala3Project: Project      = project in `version-project/file` / "scala_3-project"
val javaVersionProject: Project = project in `version-project/file` / "java_version-project"
val singleSbtProject: Project   = project in `version-project/file` / "single-sbt-project"

Global / onChangedBuildSource := ReloadOnSourceChanges
