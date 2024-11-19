import Settings._
import djx.sbt.depts.plugins.GlobalVersion
import djx.sbt.depts.plugins.pUtils.{setting, sourcePosition}

val deptOrganization = "net.scalax.djx314"

organization      := deptOrganization
name              := "sbt-depts-root"
scalaVersion      := scalaV.v212
moduleName        := name.value
scalafmtOnCompile := true

val `depts-action`: sbt.Project = project in (`root/file` / "depts-action")
`depts-action` / organization      := deptOrganization
`depts-action` / name              := "depts-action"
`depts-action` / scalaVersion      := scalaV.v212
`depts-action` / moduleName        := (`depts-action` / name).value
`depts-action` / scalafmtOnCompile := true
`depts-action` / publishTo         := (`depts-action` / sonatypePublishToBundle).value

val `depts-abs`: sbt.Project = project in (`root/file` / "depts-abs")
`depts-abs` / organization      := deptOrganization
`depts-abs` / name              := "sbt-depts-abs"
`depts-abs` / scalaVersion      := scalaV.v212
`depts-abs` / moduleName        := (`depts-abs` / name).value
`depts-abs` / scalafmtOnCompile := true
`depts-abs` / publishTo         := (`depts-abs` / sonatypePublishToBundle).value

val `depts-codegen`: sbt.Project = project in (`root/file` / "depts-codegen") dependsOn `depts-abs`
`depts-codegen` / organization      := deptOrganization
`depts-codegen` / name              := "sbt-depts-codegen"
`depts-codegen` / scalaVersion      := scalaV.v212
`depts-codegen` / moduleName        := (`depts-codegen` / name).value
`depts-codegen` / scalafmtOnCompile := true
`depts-codegen` / publishTo         := (`depts-codegen` / sonatypePublishToBundle).value

val `depts-output-plugins`: sbt.Project = project in `plugin/file` dependsOn `depts-codegen`
`depts-output-plugins` / organization      := deptOrganization
`depts-output-plugins` / name              := "sbt-depts-djx314-plugins"
`depts-output-plugins` / scalaVersion      := scalaV.v212
`depts-output-plugins` / moduleName        := (`depts-output-plugins` / name).value
`depts-output-plugins` / scalafmtOnCompile := true
`depts-output-plugins` / publishTo         := (`depts-output-plugins` / sonatypePublishToBundle).value

val `depts-output`: sbt.Project =
  project in `output/file` dependsOn `depts-output-plugins` aggregate `depts-output-plugins` aggregate `depts-codegen` aggregate `depts-abs`
`depts-output` / organization      := deptOrganization
`depts-output` / name              := "sbt-depts-djx314"
`depts-output` / scalaVersion      := scalaV.v212
`depts-output` / moduleName        := (`depts-output` / name).value
`depts-output` / scalafmtOnCompile := true
`depts-output` / publishTo         := (`depts-output` / sonatypePublishToBundle).value

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

addCommandAlias("preparePackaging", "; updateMVersion; genAction;")

Global / onChangedBuildSource := ReloadOnSourceChanges

addCommandAlias("bb", "; preparePackaging; reload; depts-output/publishSigned;")
addCommandAlias("bbLocal", "; preparePackaging; reload; depts-output/publishLocal;")

ThisBuild / version := {
  val srcRoot = (`depts-output-plugins` / Compile / resourceDirectory).value
  val sPath   = srcRoot.toPath
  val vModel  = GlobalVersion.versionWrap.updateFromRoot(sPath)
  vModel.versionStr
}

Global / onChangedBuildSource := ReloadOnSourceChanges
