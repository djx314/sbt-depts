import Settings._
import djx.sbt.depts.plugins.pUtils.{setting, sourcePosition}

libraryDependencies ++= libScalax.`typesafe-config`.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`simple-adt`.value
libraryDependencies ++= libScalax.`sbt-librarymanagement-core`.value

val buildSbtFile2: File     = (`root/file` / ".." / "scala-version-project" / "scala_212-project" / "build.sbt").getCanonicalFile
val buildSbtFile3: File     = (`root/file` / ".." / "scala-version-project" / "scala_213-project" / "build.sbt").getCanonicalFile
val buildSbtFile4: File     = (`root/file` / ".." / "scala-version-project" / "scala_3-project" / "build.sbt").getCanonicalFile
val buildSbtFile5: File     = (`root/file` / ".." / "scala-version-project" / "java_version-project" / "build.sbt").getCanonicalFile
val buildPropertyFile: File = (`root/file` / ".." / "scala-version-project" / "single-sbt-project" / "build.sbt").getCanonicalFile

val pluginsSbtFile1: File = (`root/file` / ".." / "project" / "plugin.sbt").getCanonicalFile

val writFile1: File =
  (`root/file` / "depts-codegen" / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "codegen" / "LibraryDeptsInstance.scala").getCanonicalFile
val writFile2: File =
  (`root/file` / "depts-codegen" / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "codegen" / "LibraryPluginDeptsInstance.scala").getCanonicalFile
val writFile3: File =
  (`root/file` / "depts-codegen" / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "codegen" / "SbtVersionInfo.scala").getCanonicalFile

genActionImpl := {
  (Compile / runMain).inputTaskValue
    .partialInput(" djx.sbt.depts.abs.CodegenAction")
    .partialInput(s""" ${buildSbtFile2.toString}""")
    .partialInput(s""" ${buildSbtFile3.toString}""")
    .partialInput(s""" ${buildSbtFile4.toString}""")
    .partialInput(s""" ${buildSbtFile5.toString}""")
    .partialInput(s""" ${writFile1.toString}""")
    .evaluated

  (Compile / runMain).inputTaskValue
    .partialInput(" djx.sbt.depts.abs.CodegenActionPlugin")
    .partialInput(s""" ${pluginsSbtFile1.toString}""")
    .partialInput(s""" ${writFile2.toString}""")
    .evaluated

  (Compile / runMain).inputTaskValue
    .partialInput(" djx.sbt.depts.abs.CodegenSbtAction")
    .partialInput(s""" ${buildPropertyFile.toString}""")
    .partialInput(s""" ${writFile3.toString}""")
    .evaluated
}
