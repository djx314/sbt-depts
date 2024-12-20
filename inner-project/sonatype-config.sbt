import Settings._

ThisBuild / organizationName := "Scala Workers"

ThisBuild / organizationHomepage := Some(url("https://github.com/scala-workers"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/djx314/sbt-depts"),
    "scm:git@github.com:djx314/sbt-depts.git"
  )
)

val dev1 = Developer(
  id = "Mars Liu",
  name = "Liu Xin",
  email = "mars.liu@outlook.com",
  url = url("https://marchliu.github.io/")
)

val dev2 = Developer(
  id = "djx314",
  name = "djx314",
  email = "djx314@sina.cn",
  url = url("https://github.com/djx314")
)

ThisBuild / developers := List(dev1, dev2)

ThisBuild / description := "Scala depts for djx314's repo."

ThisBuild / licenses := List("MIT License" -> new URL("https://github.com/djx314/sbt-depts/blob/main/LICENSE"))

ThisBuild / homepage := Some(url("https://github.com/djx314/sbt-depts"))

ThisBuild / pomIncludeRepository := { _ => false }

// ThisBuild / sonatypeCredentialHost := "central.sonatype.com"
// ThisBuild / sonatypeRepository     := "https://central.sonatype.com/api/v1/publisher/upload"

import xerial.sbt.Sonatype.sonatypeCentralHost
ThisBuild / sonatypeCredentialHost := sonatypeCentralHost

/*ThisBuild / publishTo := {
  /*val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")*/
  Some("releases" at "https://central.sonatype.com/api/v1/publisher/upload")
}*/

ThisBuild / publishMavenStyle := true

ThisBuild / versionScheme := Some("early-semver")
