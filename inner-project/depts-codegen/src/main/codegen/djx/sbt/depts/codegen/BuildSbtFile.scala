
package djx.sbt.depts
package codegen

object LibraryDeptsInstance extends _root_.djx.sbt.depts.abs.LibraryDepts {

  scalaVersion := "2.13.10"

crossScalaVersions := Seq("2.11.12", "2.12.17", "2.13.10", "3.2.1")

VarContext.changeDeptVar          := "zio"
libraryDependencies += "dev.zio" %%% "zio"          % "2.0.5"
libraryDependencies += "dev.zio" %%% "zio-streams"  % "2.0.5"
libraryDependencies += "dev.zio" %%% "zio-test"     % "2.0.5"
libraryDependencies += "dev.zio" %%% "zio-test-sbt" % "2.0.5"

VarContext.changeDeptVar           := "circe"
libraryDependencies += "io.circe" %%% "circe-core"    % "0.14.3"
libraryDependencies += "io.circe" %%% "circe-generic" % "0.14.3"
libraryDependencies += "io.circe" %%% "circe-parser"  % "0.14.3"

VarContext.changeDeptVar             := "typesafe-config"
libraryDependencies += "com.typesafe" % "config" % "1.4.1"

VarContext.changeDeptVar                         := "scala-collection-compat"
libraryDependencies += "org.scala-lang.modules" %%% "scala-collection-compat" % "2.8.1"

VarContext.changeDeptVar             := "http4s-Release"
libraryDependencies += "org.http4s" %%% "http4s-dsl"          % "0.23.17"
libraryDependencies += "org.http4s" %%% "http4s-ember-server" % "0.23.17"
libraryDependencies += "org.http4s" %%% "http4s-ember-client" % "0.23.17"
libraryDependencies += "org.http4s" %%% "http4s-circe"        % "0.23.17"


}

