import Settings._
import djx.sbt.depts.plugins.GlobalVersion
import djx.sbt.depts.plugins.djxPluginUtils.{settingKeyObj => oSettingKey, sourcePosition}

oSettingKey.setConst(scalaVersion)(() => scalaV.v212)(sourcePosition.fromEnclosing)

val `depts-abs`            = project in `root/file` / "depts-abs"
val `depts-codegen`        = project in (`root/file` / "depts-codegen") dependsOn `depts-abs`
val `depts-output-plugins` = project in `plugin/file`
val `depts-output`         = project in `output/file` dependsOn `depts-output-plugins` aggregate `depts-output-plugins`

updateMVersion := {
  val srcRoot = (`depts-output-plugins` / Compile / resourceDirectory).value
  val sPath   = srcRoot.toPath
  val newV    = GlobalVersion.versionWrap.updateFromRoot(sPath)
  val newV1   = newV.copy(MIndex = newV.MIndex + 1)
  newV1.writeWithRoot(sPath)
}

genAction := {
  (`depts-abs` / genActionImpl).inputTaskValue.evaluated
  (`depts-codegen` / genActionImpl).inputTaskValue.evaluated
}

val allfmt = taskKey[Unit]("Format all projects.")
allfmt := {
  (Compile / scalafmtSbt).value
  (`depts-abs` / Compile / scalafmtSbt).value
  (`depts-codegen` / Compile / scalafmtSbt).value
  (`depts-output-plugins` / Compile / scalafmtSbt).value
  (`depts-output` / Compile / scalafmtSbt).value

  (Compile / scalafmt).value
  (`depts-abs` / Compile / scalafmt).value
  (`depts-codegen` / Compile / scalafmt).value
  (`depts-output-plugins` / Compile / scalafmt).value
  (`depts-output` / Compile / scalafmt).value
}

addCommandAlias("preparePackaging", "; updateMVersion; genAction; allfmt;")

oSettingKey.setConst(Global / onChangedBuildSource)(() => ReloadOnSourceChanges)(sourcePosition.fromEnclosing)
oSettingKey.setConst(`depts-output` / name)(() => "sbt-depts-djx314")(sourcePosition.fromEnclosing)
oSettingKey.setConst(`depts-output-plugins` / name)(() => "sbt-depts-djx314-plugins")(sourcePosition.fromEnclosing)

addCommandAlias("bb", "; preparePackaging; reload; depts-output/publishSigned;")
addCommandAlias("bbLocal", "; preparePackaging; reload; depts-output/publishLocal;")

ThisBuild / version := {
  val srcRoot = (`depts-output-plugins` / Compile / resourceDirectory).value
  val sPath   = srcRoot.toPath
  val vModel  = GlobalVersion.versionWrap.updateFromRoot(sPath)
  vModel.versionStr
}
