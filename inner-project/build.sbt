scalaVersion := "2.13.10"

val root = file(".").getCanonicalFile

lazy val `depts-abs`     = project in root / "depts-abs"
lazy val `depts-codegen` = (project in root / "depts-codegen").dependsOn(`depts-abs`)
lazy val `depts-output`  = (project in root / "depts-output").dependsOn(`depts-codegen`)
