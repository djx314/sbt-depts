import Settings._
import djx.sbt.depts.plugins.GlobalVersion
import djx.sbt.depts.plugins.pUtils.{setting, sourcePosition}

setting.setConst(scalaVersion)(scalaV.v212)(sourcePosition.fromEnclosing)

lazy val `depts-abs`: sbt.Project            = project in `root/file` / "depts-abs"
lazy val `depts-codegen`: sbt.Project        = project in (`root/file` / "depts-codegen") dependsOn `depts-abs`
lazy val `depts-output-plugins`: sbt.Project = project in `plugin/file` dependsOn `depts-codegen`
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

setting.setConst(Global / onChangedBuildSource)(ReloadOnSourceChanges)(sourcePosition.fromEnclosing)
setting.setConst(`depts-abs` / name)("sbt-depts-abs")(sourcePosition.fromEnclosing)
setting.setConst(`depts-codegen` / name)("sbt-depts-codegen")(sourcePosition.fromEnclosing)
setting.setConst(`depts-output` / name)("sbt-depts-djx314")(sourcePosition.fromEnclosing)
setting.setConst(`depts-output-plugins` / name)("sbt-depts-djx314-plugins")(sourcePosition.fromEnclosing)

addCommandAlias("bb", "; preparePackaging; reload; depts-output/publishSigned;")
addCommandAlias("bbLocal", "; preparePackaging; reload; depts-output/publishLocal;")

ThisBuild / version := {
  val srcRoot = (`depts-output-plugins` / Compile / resourceDirectory).value
  val sPath   = srcRoot.toPath
  val vModel  = GlobalVersion.versionWrap.updateFromRoot(sPath)
  vModel.versionStr
}
