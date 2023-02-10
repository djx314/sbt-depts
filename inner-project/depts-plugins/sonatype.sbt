import Settings._

enablePlugins(Sonatype)

organizationName := "Scala Workers"

organization := "net.scalax.djx314"

version := {
  val MVersion = versionFileString.value
  s"0.0.1-M$MVersion"
}

organizationHomepage := Some(url("https://github.com/scala-workers"))

scmInfo := Some(
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

developers := List(dev1, dev2)

description := "Scala depts for djx314's repo."

licenses := List("MIT License" -> new URL("https://github.com/djx314/sbt-depts/blob/main/LICENSE"))

homepage := Some(url("https://github.com/djx314/sbt-depts"))

pomIncludeRepository := { _ => false }

sonatypeCredentialHost := "s01.oss.sonatype.org"

publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

versionScheme := Some("early-semver")
