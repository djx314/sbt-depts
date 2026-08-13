import djx.sbt.depts.plugins.GlobalVersion
import Settings._

val deptOrganization = "net.scalax.djx314"

organization      := deptOrganization
scalaVersion      := scalaV.v3
moduleName        := name.value
scalafmtOnCompile := true
name              := "sbt-depts-root"

lazy val `depts-abs`: sbt.Project = project in (`root/file` / "depts-abs")
`depts-abs` / organization      := deptOrganization
`depts-abs` / scalaVersion      := scalaV.v3
`depts-abs` / moduleName        := (`depts-abs` / name).value
`depts-abs` / scalafmtOnCompile := true
`depts-abs` / publishTo         := localStaging.value
`depts-abs` / name              := "sbt-depts-abs"

lazy val `depts-codegen`: sbt.Project = (project in (`root/file` / "depts-codegen")).dependsOn(`depts-abs`)
`depts-codegen` / organization      := deptOrganization
`depts-codegen` / scalaVersion      := scalaV.v3
`depts-codegen` / moduleName        := (`depts-codegen` / name).value
`depts-codegen` / scalafmtOnCompile := true
`depts-codegen` / publishTo         := localStaging.value
`depts-codegen` / name              := "sbt-depts-codegen"

lazy val `depts-output-plugins`: sbt.Project = (project in `plugin/file`).dependsOn(`depts-codegen`)
`depts-output-plugins` / organization      := deptOrganization
`depts-output-plugins` / scalaVersion      := scalaV.v3
`depts-output-plugins` / moduleName        := (`depts-output-plugins` / name).value
`depts-output-plugins` / scalafmtOnCompile := true
`depts-output-plugins` / publishTo         := localStaging.value
`depts-output-plugins` / name              := "sbt-depts-djx314-plugins"

lazy val `depts-output`: sbt.Project =
  (project in `output/file`)
    .enablePlugins(SbtPlugin)
    .dependsOn(`depts-output-plugins`)
    .aggregate(`depts-output-plugins`)
    .aggregate(`depts-codegen`)
    .aggregate(`depts-abs`)
`depts-output` / organization      := deptOrganization
`depts-output` / scalaVersion      := scalaV.v3
`depts-output` / moduleName        := (`depts-output` / name).value
`depts-output` / scalafmtOnCompile := true
`depts-output` / publishTo         := localStaging.value
`depts-output` / name              := "sbt-depts-djx314"

updateMVersion := {
  import java.nio.file.{Files, Paths}
  import java.nio.charset.StandardCharsets
  import java.io.File

  val srcRoot: File      = (`depts-output-plugins` / Compile / resourceDirectory).value
  val versionStr: String = version.value

  val srcRoot2: File = srcRoot / "djx" / "sbt" / "depts" / "plugins" / "sbt-depts-version"
  java.nio.file.Files.writeString(srcRoot2.toPath, versionStr, StandardCharsets.UTF_8)
}

addCommandAlias("aa", "; updateMVersion ; CodegenAction;")

addCommandAlias("bb", "; clean; depts-output/publishSigned; sonaBundle;")
addCommandAlias("bbLocal", "; depts-output/publishLocal;")
