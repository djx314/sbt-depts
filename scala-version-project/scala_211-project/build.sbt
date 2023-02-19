VarContext.setScalaVersion := "2.11"
scalaVersion               := "2.11.12"

VarContext.changeDeptVar         := "kind-projector"
addCompilerPlugin("org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full)

VarContext.changeDeptVar           := "circe"
libraryDependencies += "io.circe" %%% "circe-core"    % "0.11.2"
libraryDependencies += "io.circe" %%% "circe-generic" % "0.11.2"
libraryDependencies += "io.circe" %%% "circe-parser"  % "0.11.2"

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
libraryDependencies += "dev.zio" %%% "zio"          % "2.0.9"
libraryDependencies += "dev.zio" %%% "zio-streams"  % "2.0.9"
libraryDependencies += "dev.zio" %%% "zio-test"     % "2.0.9"
libraryDependencies += "dev.zio" %%% "zio-test-sbt" % "2.0.9"

VarContext.changeDeptVar             := "typesafe-config"
libraryDependencies += "com.typesafe" % "config" % "1.4.2"

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
libraryDependencies += "com.thoughtworks.binding" %%% "binding" % "12.1.0+110-53fd3428"

VarContext.changeDeptVar                   := "commons-io"
libraryDependencies += "org.apache.commons" % "commons-io" % "1.3.2"

VarContext.changeDeptVar                           := "macwire"
libraryDependencies += "com.softwaremill.macwire" %%% "macros" % "2.5.8"

VarContext.changeDeptVar                   := "commons-lang3"
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.12.0"

VarContext.changeDeptVar                    := "simple-adt"
libraryDependencies += "net.scalax.simple" %%% "simple-adt" % "0.0.1-M6"
