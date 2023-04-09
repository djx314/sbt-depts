import Settings._

scalaVersion := scalaV.v212

scalafmtOnCompile := true

Compile / compile := ((Compile / compile) dependsOn (Compile / scalafmtSbt)).value

libraryDependencies ++= libScalax.`typesafe-config`.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value

val buildSbtFile1   = (`root/file` / ".." / "scala-version-project" / "scala_211-project" / "build.sbt").getCanonicalFile
val buildSbtFile2   = (`root/file` / ".." / "scala-version-project" / "scala_212-project" / "build.sbt").getCanonicalFile
val buildSbtFile3   = (`root/file` / ".." / "scala-version-project" / "scala_213-project" / "build.sbt").getCanonicalFile
val buildSbtFile4   = (`root/file` / ".." / "scala-version-project" / "scala_3-project" / "build.sbt").getCanonicalFile
val pluginsSbtFile1 = (`root/file` / ".." / "project" / "plugin.sbt").getCanonicalFile

val writFile1 =
  (`root/file` / "depts-codegen" / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "codegen" / "LibraryDeptsInstance.scala").getCanonicalFile
val writFile2 =
  (`root/file` / "depts-codegen" / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "codegen" / "LibraryPluginDeptsInstance.scala").getCanonicalFile

genActionImpl := {
  (Compile / runMain).inputTaskValue
    .partialInput(" djx.sbt.depts.abs.CodegenAction")
    .partialInput(s""" ${buildSbtFile1.toString}""")
    .partialInput(s""" ${buildSbtFile2.toString}""")
    .partialInput(s""" ${buildSbtFile3.toString}""")
    .partialInput(s""" ${buildSbtFile4.toString}""")
    .partialInput(s""" ${writFile1.toString}""")
    .evaluated

  (Compile / runMain).inputTaskValue
    .partialInput(" djx.sbt.depts.abs.CodegenActionPlugin")
    .partialInput(s""" ${pluginsSbtFile1.toString}""")
    .partialInput(s""" ${writFile2.toString}""")
    .evaluated
}

libraryDependencies ++= libScalax.`sbt-librarymanagement-core`.value
