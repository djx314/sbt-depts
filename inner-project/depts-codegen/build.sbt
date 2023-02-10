import Settings._

scalaVersion := scalaV.v3

scalafmtOnCompile := true

Compile / compile := ((Compile / compile) dependsOn (Compile / scalafmtSbt)).value

val propsPath      = rootFile / ".." / "project" / "build.properties"
val sbtVersionFile = outputFile / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "output" / "SbtVersionSetting.scala"
val libVersionFile = outputFile / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "output" / "Djx314DeptsPluginImpl.scala"

val `scalfmt/file`      = rootFile / ".." / ".scalafmt.conf"
val scalafmtCodegenFile = outputFile / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "output" / "impl" / "ScalafmtRewrite.scala"
val pluginsFile         = pluginFile / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "plugins" / "impl" / "PluginsColImpl.scala"

genActionImpl := (Compile / runMain).inputTaskValue
  .partialInput(" djx.sbt.depts.codegen.CodegenRunner")
  .partialInput(s" ${propsPath.getCanonicalFile.toString}")
  .partialInput(s" ${sbtVersionFile.getCanonicalFile.toString}")
  .partialInput(s" ${libVersionFile.getCanonicalFile.toString}")
  .partialInput(s" ${`scalfmt/file`.getCanonicalFile.toString}")
  .partialInput(s" ${scalafmtCodegenFile.getCanonicalFile.toString}")
  .partialInput(s" ${pluginsFile.getCanonicalFile.toString}")
  .evaluated

Compile / unmanagedSourceDirectories := {
  val v1          = (Compile / unmanagedSourceDirectories).value
  val codegenFile = sourceDirectory.value / "main" / "codegen"
  println(codegenFile.getCanonicalFile)
  codegenFile +: v1
}
