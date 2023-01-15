import Settings._

scalaVersion := "2.13.10"

scalafmtOnCompile := true

Compile / compile := ((Compile / compile) dependsOn (Compile / scalafmtSbt)).value

libraryDependencies += "com.typesafe" % "config" % "1.4.1"

val buildSbtFile = (rootFile / ".." / "build.sbt").getCanonicalFile
val writFile1 =
  (rootFile / "depts-codegen" / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "codegen" / "BuildSbtFile.scala").getCanonicalFile

genActionImpl := (Compile / runMain).inputTaskValue
  .partialInput(" djx.sbt.depts.abs.CodegenAction")
  .partialInput(s" ${buildSbtFile.toString}")
  .partialInput(s" ${writFile1.toString}")
  .evaluated
