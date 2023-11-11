import Settings._
import djx.sbt.depts.plugins.pUtils.{setting, sourcePosition}

setting.setKey(scalaVersion)(sourcePosition.fromEnclosing).value(scalaV.v212)
setting.setKey(scalafmtOnCompile)(sourcePosition.fromEnclosing).value(false)

Compile / compile := ((Compile / compile) dependsOn (Compile / scalafmtSbt)).value

val libVersionFile = `output/file` / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "output" / "Djx314DeptsPluginImpl.scala"

val `scalfmt/file`      = `root/file` / ".." / ".scalafmt.conf"
val scalafmtCodegenFile = `output/file` / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "output" / "impl" / "ScalafmtRewrite.scala"
val pluginsFile         = `plugin/file` / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "plugins" / "impl" / "PluginsColImpl.scala"

genActionImpl := (Compile / runMain).inputTaskValue
  .partialInput(" djx.sbt.depts.codegen.CodegenRunner")
  .partialInput(s" ${libVersionFile.getCanonicalFile.toString}")
  .partialInput(s" ${`scalfmt/file`.getCanonicalFile.toString}")
  .partialInput(s" ${scalafmtCodegenFile.getCanonicalFile.toString}")
  .partialInput(s" ${pluginsFile.getCanonicalFile.toString}")
  .evaluated

Compile / unmanagedSourceDirectories := {
  val v1          = (Compile / unmanagedSourceDirectories).value
  val codegenFile = sourceDirectory.value / "main" / "codegen"
  codegenFile +: v1
}
