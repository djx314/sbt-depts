import Settings._

scalaVersion := scalaV.v213

scalafmtOnCompile := true

Compile / compile := ((Compile / compile) dependsOn (Compile / scalafmtSbt)).value

libraryDependencies ++= lib.`typesafe-config`.value

val buildSbtFile = (rootFile / ".." / "build.sbt").getCanonicalFile
val writFile1 =
  (rootFile / "depts-codegen" / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "codegen" / "BuildSbtFile.scala").getCanonicalFile

genActionImpl := (Compile / runMain).inputTaskValue
  .partialInput(" djx.sbt.depts.abs.CodegenAction")
  .partialInput(s" ${buildSbtFile.toString}")
  .partialInput(s" ${writFile1.toString}")
  .evaluated
