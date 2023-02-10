VarContext.setScalaVersion := "2.13"
scalaVersion               := "2.13.10"

VarContext.changeDeptVar         := "kind-projector"
addCompilerPlugin("org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full)

VarContext.changeDeptVar           := "circe"
libraryDependencies += "io.circe" %%% "circe-core"    % "0.14.3"
libraryDependencies += "io.circe" %%% "circe-generic" % "0.14.3"
libraryDependencies += "io.circe" %%% "circe-parser"  % "0.14.3"

VarContext.changeDeptVar          := "zio2"
libraryDependencies += "dev.zio" %%% "zio"          % "2.0.5"
libraryDependencies += "dev.zio" %%% "zio-streams"  % "2.0.5"
libraryDependencies += "dev.zio" %%% "zio-test"     % "2.0.5"
libraryDependencies += "dev.zio" %%% "zio-test-sbt" % "2.0.5"

VarContext.changeDeptVar             := "typesafe-config"
libraryDependencies += "com.typesafe" % "config" % "1.4.1"

VarContext.changeDeptVar                         := "scala-collection-compat"
libraryDependencies += "org.scala-lang.modules" %%% "scala-collection-compat" % "2.8.1"

VarContext.changeDeptVar             := "http4s-Release"
libraryDependencies += "org.http4s" %%% "http4s-dsl"          % "0.23.17"
libraryDependencies += "org.http4s" %%% "http4s-ember-server" % "0.23.17"
libraryDependencies += "org.http4s" %%% "http4s-ember-client" % "0.23.17"
libraryDependencies += "org.http4s" %%% "http4s-circe"        % "0.23.17"

VarContext.changeDeptVar          := "zio-config"
libraryDependencies += "dev.zio" %%% "zio-config"          % "3.0.7"
libraryDependencies += "dev.zio" %%% "zio-config-magnolia" % "3.0.7"
libraryDependencies += "dev.zio" %%% "zio-config-refined"  % "3.0.7"
libraryDependencies += "dev.zio" %%% "zio-config-typesafe" % "3.0.7"
libraryDependencies += "dev.zio" %%% "zio-config-yaml"     % "3.0.7"
libraryDependencies += "dev.zio" %%% "zio-config-gen"      % "3.0.7"

VarContext.changeDeptVar          := "slf4j-simple"
libraryDependencies += "org.slf4j" % "slf4j-simple" % "2.0.6"

VarContext.changeDeptVar                           := "binding.scala"
libraryDependencies += "com.yang-bo"              %%% "html"    % "2.0.0+28-a2b9d520"
libraryDependencies += "com.thoughtworks.binding" %%% "binding" % "12.1.0+110-53fd3428"

VarContext.changeDeptVar                   := "commons-io"
libraryDependencies += "org.apache.commons" % "commons-io" % "1.3.2"

VarContext.changeDeptVar                           := "macwire"
libraryDependencies += "com.softwaremill.macwire" %%% "macros" % "2.5.8"
