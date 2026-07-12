import Settings._

val buildSbtFile2: File =
  (`root/file` / ".." / "depts-project" / "scala-version-project" / "scala_212-project" / "build.sbt").getCanonicalFile
val buildSbtFile3: File =
  (`root/file` / ".." / "depts-project" / "scala-version-project" / "scala_213-project" / "build.sbt").getCanonicalFile
val buildSbtFile4: File =
  (`root/file` / ".." / "depts-project" / "scala-version-project" / "scala_3-project" / "build.sbt").getCanonicalFile
val buildSbtFile5: File =
  (`root/file` / ".." / "depts-project" / "scala-version-project" / "java_version-project" / "build.sbt").getCanonicalFile
val buildPropertyFile: File =
  (`root/file` / ".." / "depts-project" / "scala-version-project" / "single-sbt-project" / "build.sbt").getCanonicalFile

val pluginsSbtFile1: File = (`root/file` / ".." / "depts-project" / "project" / "plugin.sbt").getCanonicalFile

val writFile1: File =
  (`root/file` / "depts-codegen" / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "codegen" / "LibraryDeptsInstance.scala").getCanonicalFile
val writFile2: File =
  (`root/file` / "depts-codegen" / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "codegen" / "LibraryPluginDeptsInstance.scala").getCanonicalFile
val writFile3: File =
  (`root/file` / "depts-codegen" / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "codegen" / "SbtVersionInfo.scala").getCanonicalFile

val libVersionFile = `output/file` / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "output" / "Djx314DeptsPluginImpl.scala"

val `scalfmt/file`      = `root/file` / ".." / "depts-project" / ".scalafmt.conf"
val scalafmtCodegenFile = `output/file` / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "output" / "impl" / "ScalafmtRewrite.scala"
val pluginsFile         = `plugin/file` / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "plugins" / "impl" / "PluginsColImpl.scala"

val parameter1: Seq[String] = Seq(
  "djx.sbt.depts.abs.CodegenAction",
  buildSbtFile2.toString,
  buildSbtFile3.toString,
  buildSbtFile4.toString,
  buildSbtFile5.toString,
  writFile1.toString
)

val parameter2: Seq[String] = Seq("djx.sbt.depts.abs.CodegenActionPlugin", pluginsSbtFile1.toString, writFile2.toString)

val parameter3: Seq[String] = Seq(
  " djx.sbt.depts.abs.CodegenSbtAction",
  buildPropertyFile.toString,
  writFile3.toString
)

val parameter4 = Seq(
  "djx.sbt.depts.codegen.CodegenRunner",
  libVersionFile.getCanonicalFile.toString,
  `scalfmt/file`.getCanonicalFile.toString,
  scalafmtCodegenFile.getCanonicalFile.toString,
  pluginsFile.getCanonicalFile.toString
)

val commadList = Seq(
  s"depts-abs/runMain ${parameter1.mkString(" ", " ", " ")}",
  s"depts-abs/runMain ${parameter2.mkString(" ", " ", " ")}",
  s"depts-abs/runMain ${parameter3.mkString(" ", " ", " ")}",
  s"depts-codegen/runMain ${parameter4.mkString(" ", " ", " ")}"
)
addCommandAlias("CodegenAction", commadList.mkString(";", ";", ";"))
