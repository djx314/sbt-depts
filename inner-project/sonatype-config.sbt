ThisBuild / organizationName := "Scala Workers"

ThisBuild / organizationHomepage := Some(uri("https://github.com/scala-workers"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    uri("https://github.com/djx314/sbt-depts"),
    "scm:git@github.com:djx314/sbt-depts.git"
  )
)

val dev1 = Developer(
  id = "Mars Liu",
  name = "Liu Xin",
  email = "mars.liu@outlook.com",
  url = uri("https://marchliu.github.io/")
)

val dev2 = Developer(
  id = "djx314",
  name = "djx314",
  email = "djx314@sina.cn",
  url = uri("https://github.com/djx314")
)

ThisBuild / developers := List(dev1, dev2)

ThisBuild / description := "Scala depts for djx314's repo."

ThisBuild / licenses := List("MIT License" -> uri("https://github.com/djx314/sbt-depts/blob/main/LICENSE"))

ThisBuild / homepage := Some(uri("https://github.com/djx314/sbt-depts"))

ThisBuild / pomIncludeRepository := { _ => false }

ThisBuild / publishMavenStyle := true

ThisBuild / versionScheme := Some("early-semver")
