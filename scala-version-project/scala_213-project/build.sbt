VarContext.setScalaVersion := "2.13"
scalaVersion               := "2.13.10"

VarContext.changeDeptVar         := "kind-projector"
addCompilerPlugin("org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full)

VarContext.changeDeptVar           := "circe"
libraryDependencies += "io.circe" %%% "circe-core"    % "0.14.3"
libraryDependencies += "io.circe" %%% "circe-generic" % "0.14.3"
libraryDependencies += "io.circe" %%% "circe-parser"  % "0.14.3"

VarContext.changeDeptVar               := "scalatest"
libraryDependencies += "org.scalactic" %% "scalactic"      % "3.2.15"
libraryDependencies += "org.scalatest" %% "scalatest"      % "3.2.15"
libraryDependencies += "org.scalatest" %% "scalatest-core" % "3.2.15"

VarContext.changeDeptVar                := "cats-effect"
libraryDependencies += "org.typelevel" %%% "cats-effect" % "3.4.2"

VarContext.changeDeptVar                := "cats"
libraryDependencies += "org.typelevel" %%% "cats-core" % "2.9.0"

VarContext.changeDeptVar               := "h2"
libraryDependencies += "com.h2database" % "h2" % "2.1.214"

VarContext.changeDeptVar              := "doobie"
libraryDependencies += "org.tpolecat" %% "doobie-core"      % "1.0.0-RC2"
libraryDependencies += "org.tpolecat" %% "doobie-hikari"    % "1.0.0-RC2"
libraryDependencies += "org.tpolecat" %% "doobie-postgres"  % "1.0.0-RC2"
libraryDependencies += "org.tpolecat" %% "doobie-scalatest" % "1.0.0-RC2"

VarContext.changeDeptVar              := "doobie-h2"
libraryDependencies += "org.tpolecat" %% "doobie-h2" % "1.0.0-RC2"

VarContext.changeDeptVar          := "zio2"
libraryDependencies += "dev.zio" %%% "zio"          % "2.0.8"
libraryDependencies += "dev.zio" %%% "zio-streams"  % "2.0.8"
libraryDependencies += "dev.zio" %%% "zio-test"     % "2.0.8"
libraryDependencies += "dev.zio" %%% "zio-test-sbt" % "2.0.8"

VarContext.changeDeptVar             := "typesafe-config"
libraryDependencies += "com.typesafe" % "config" % "1.4.1"

VarContext.changeDeptVar                         := "scala-collection-compat"
libraryDependencies += "org.scala-lang.modules" %%% "scala-collection-compat" % "2.8.1"

VarContext.changeDeptVar             := "http4s-Release"
libraryDependencies += "org.http4s" %%% "http4s-dsl"          % "0.23.17"
libraryDependencies += "org.http4s" %%% "http4s-ember-server" % "0.23.17"
libraryDependencies += "org.http4s" %%% "http4s-ember-client" % "0.23.17"
libraryDependencies += "org.http4s" %%% "http4s-circe"        % "0.23.17"

VarContext.changeDeptVar            := "http4s-twirl"
libraryDependencies += "org.http4s" %% "http4s-twirl" % "0.23.17"

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
