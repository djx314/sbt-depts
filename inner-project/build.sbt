import Settings._
import djx.sbt.depts.plugins.GlobalVersion
import djx.sbt.depts.plugins.pUtils.{setting, sourcePosition}

setting.setKey(scalaVersion)(sourcePosition.fromEnclosing).value(scalaV.v212)

enablePlugins(SbtLauncherDeptsPlugin)

lazy val `depts-action`: sbt.Project = project in (`root/file` / "depts-action") enablePlugins SbtLauncherDeptsPlugin
lazy val `depts-abs`: sbt.Project =
  project in (`root/file` / "depts-abs") enablePlugins SbtLauncherDeptsPlugin dependsOn (`depts-action` % SbtLaunchDeptsConfig.name)
lazy val `depts-codegen`: sbt.Project =
  project in (`root/file` / "depts-codegen") enablePlugins SbtLauncherDeptsPlugin dependsOn `depts-abs`
lazy val `depts-output-plugins`: sbt.Project = project in `plugin/file` enablePlugins SbtLauncherDeptsPlugin dependsOn `depts-codegen`
lazy val `depts-output`: sbt.Project =
  project in `output/file` dependsOn `depts-output-plugins` aggregate `depts-output-plugins` aggregate `depts-codegen` aggregate `depts-abs`

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

/*val allfmt = taskKey[Unit]("Format all projects.")
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
}*/

addCommandAlias("preparePackaging", "; updateMVersion; genAction;")

setting.setKey(Global / onChangedBuildSource)(sourcePosition.fromEnclosing).value(ReloadOnSourceChanges)
setting.setKey(`depts-abs` / name)(sourcePosition.fromEnclosing).value("sbt-depts-abs")
setting.setKey(`depts-codegen` / name)(sourcePosition.fromEnclosing).value("sbt-depts-codegen")
setting.setKey(`depts-output` / name)(sourcePosition.fromEnclosing).value("sbt-depts-djx314")
setting.setKey(`depts-output-plugins` / name)(sourcePosition.fromEnclosing).value("sbt-depts-djx314-plugins")

addCommandAlias("bb", "; preparePackaging; reload; depts-output/publishSigned;")
addCommandAlias("bbLocal", "; preparePackaging; reload; depts-output/publishLocal;")

ThisBuild / version := {
  val srcRoot = (`depts-output-plugins` / Compile / resourceDirectory).value
  val sPath   = srcRoot.toPath
  val vModel  = GlobalVersion.versionWrap.updateFromRoot(sPath)
  vModel.versionStr
}

Global / onChangedBuildSource := ReloadOnSourceChanges
