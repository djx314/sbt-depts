import Settings._

scalaVersion := scalaV.v3

scalafmtOnCompile := true

Compile / compile := ((Compile / compile) dependsOn (Compile / scalafmtSbt)).value

libraryDependencies ++= libScalax.`typesafe-config`.value

val buildSbtFile1 = (rootFile / ".." / "scala-version-project" / "scala_211-project" / "build.sbt").getCanonicalFile
val buildSbtFile2 = (rootFile / ".." / "scala-version-project" / "scala_212-project" / "build.sbt").getCanonicalFile
val buildSbtFile3 = (rootFile / ".." / "scala-version-project" / "scala_213-project" / "build.sbt").getCanonicalFile
val buildSbtFile4 = (rootFile / ".." / "scala-version-project" / "scala_3-project" / "build.sbt").getCanonicalFile

val writFile1 =
  (rootFile / "depts-codegen" / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "codegen" / "BuildSbtFile.scala").getCanonicalFile

genActionImpl := {
  (Compile / runMain).inputTaskValue
    .partialInput(" djx.sbt.depts.abs.CodegenAction")
    .partialInput(s""" ${buildSbtFile1.toString}""")
    .partialInput(s""" ${buildSbtFile2.toString}""")
    .partialInput(s""" ${buildSbtFile3.toString}""")
    .partialInput(s""" ${buildSbtFile4.toString}""")
    .partialInput(s""" ${writFile1.toString}""")
    .evaluated
}
