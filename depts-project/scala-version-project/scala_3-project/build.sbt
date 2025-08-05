scalaVersion := "3.7.1"

VarContext.changeDeptVar           := "circe"
libraryDependencies += "io.circe" %%% "circe-core"    % "0.14.14"
libraryDependencies += "io.circe" %%% "circe-generic" % "0.14.14"
libraryDependencies += "io.circe" %%% "circe-parser"  % "0.14.14"

VarContext.changeDeptVar                := "scalatest"
libraryDependencies += "org.scalactic" %%% "scalactic"          % "3.2.19"
libraryDependencies += "org.scalatest" %%% "scalatest"          % "3.2.19"
libraryDependencies += "org.scalatest" %%% "scalatest-core"     % "3.2.19"
libraryDependencies += "org.scalatest" %%% "scalatest-funsuite" % "3.2.19"

VarContext.changeDeptVar                := "cats-effect"
libraryDependencies += "org.typelevel" %%% "cats-effect" % "3.6.3"

VarContext.changeDeptVar                := "cats-core"
libraryDependencies += "org.typelevel" %%% "cats-core" % "2.13.0"

VarContext.changeDeptVar              := "doobie"
libraryDependencies += "org.tpolecat" %% "doobie-core"      % "1.0.0-RC10"
libraryDependencies += "org.tpolecat" %% "doobie-hikari"    % "1.0.0-RC10"
libraryDependencies += "org.tpolecat" %% "doobie-postgres"  % "1.0.0-RC10"
libraryDependencies += "org.tpolecat" %% "doobie-scalatest" % "1.0.0-RC10"

VarContext.changeDeptVar              := "doobie-h2"
libraryDependencies += "org.tpolecat" %% "doobie-h2" % "1.0.0-RC10"

VarContext.changeDeptVar          := "zio2"
libraryDependencies += "dev.zio" %%% "zio"          % "2.1.20"
libraryDependencies += "dev.zio" %%% "zio-streams"  % "2.1.20"
libraryDependencies += "dev.zio" %%% "zio-test"     % "2.1.20"
libraryDependencies += "dev.zio" %%% "zio-test-sbt" % "2.1.20"

VarContext.changeDeptVar                         := "scala-collection-compat"
libraryDependencies += "org.scala-lang.modules" %%% "scala-collection-compat" % "2.13.0"

VarContext.changeDeptVar             := "http4s-Release"
libraryDependencies += "org.http4s" %%% "http4s-dsl"   % "0.23.30"
libraryDependencies += "org.http4s" %%% "http4s-circe" % "0.23.30"

VarContext.changeDeptVar             := "http4s-Release-ember-server"
libraryDependencies += "org.http4s" %%% "http4s-ember-server" % "0.23.30"

VarContext.changeDeptVar             := "http4s-Release-ember-client"
libraryDependencies += "org.http4s" %%% "http4s-ember-client" % "0.23.30"

VarContext.changeDeptVar            := "http4s-twirl"
libraryDependencies += "org.http4s" %% "http4s-twirl" % "0.24.0-M1"

VarContext.changeDeptVar          := "zio-config"
libraryDependencies += "dev.zio" %%% "zio-config"            % "4.0.4"
libraryDependencies += "dev.zio" %%% "zio-config-magnolia"   % "4.0.4"
libraryDependencies += "dev.zio" %%% "zio-config-refined"    % "4.0.4"
libraryDependencies += "dev.zio" %%% "zio-config-typesafe"   % "4.0.4"
libraryDependencies += "dev.zio" %%% "zio-config-yaml"       % "4.0.4"
libraryDependencies += "dev.zio" %%% "zio-config-derivation" % "4.0.4"

VarContext.changeDeptVar                           := "macwire"
libraryDependencies += "com.softwaremill.macwire" %%% "macros" % "2.6.6"

VarContext.changeDeptVar            := "commons-lang3-bridge"
libraryDependencies += "net.scalax" %% "commons-lang3-bridge" % "0.1.0"

VarContext.changeDeptVar                    := "simple-adt"
libraryDependencies += "net.scalax.simple" %%% "simple-adt" % "0.0.2-M21"

VarContext.changeDeptVar               := "sbt-librarymanagement-core"
libraryDependencies += "org.scala-sbt" %% "librarymanagement-core" % "2.0.0-alpha16"

VarContext.changeDeptVar                := "cats-effect-cps"
libraryDependencies += "org.typelevel" %%% "cats-effect-cps" % "0.5.0"

VarContext.changeDeptVar          := "zio-json"
libraryDependencies += "dev.zio" %%% "zio-json" % "0.7.44"

VarContext.changeDeptVar                := "shapeless"
libraryDependencies += "org.typelevel" %%% "shapeless3-deriving" % "3.5.0"
libraryDependencies += "org.typelevel" %%% "shapeless3-typeable" % "3.5.0"

VarContext.changeDeptVar                := "shapeless3-test"
libraryDependencies += "org.typelevel" %%% "shapeless3-test" % "3.5.0"

VarContext.changeDeptVar         := "fs2"
libraryDependencies += "co.fs2" %%% "fs2-core"             % "3.12.0"
libraryDependencies += "co.fs2" %%% "fs2-io"               % "3.12.0"
libraryDependencies += "co.fs2"  %% "fs2-reactive-streams" % "3.12.0"
libraryDependencies += "co.fs2" %%% "fs2-scodec"           % "3.12.0"

VarContext.changeDeptVar                := "distage"
libraryDependencies += "io.7mind.izumi" %% "distage-core" % "1.2.19"

VarContext.changeDeptVar                    := "slick"
libraryDependencies += "com.typesafe.slick" %% "slick"          % "3.6.1"
libraryDependencies += "com.typesafe.slick" %% "slick-hikaricp" % "3.6.1"
libraryDependencies += "com.typesafe.slick" %% "slick-codegen"  % "3.6.1"

VarContext.changeDeptVar                  := "pekko-all"
libraryDependencies += "org.apache.pekko" %% "pekko-actor-typed"           % "1.1.5"
libraryDependencies += "org.apache.pekko" %% "pekko-stream-typed"          % "1.1.5"
libraryDependencies += "org.apache.pekko" %% "pekko-http"                  % "1.2.0"
libraryDependencies += "org.apache.pekko" %% "pekko-http-spray-json"       % "1.2.0"
libraryDependencies += "org.apache.pekko" %% "pekko-serialization-jackson" % "1.1.5"
libraryDependencies += "org.apache.pekko" %% "pekko-slf4j"                 % "1.1.5"

VarContext.changeDeptVar                  := "pekko-actor"
libraryDependencies += "org.apache.pekko" %% "pekko-actor" % "1.1.5"

VarContext.changeDeptVar         := "zio-interop-reactivestreams"
libraryDependencies += "dev.zio" %% "zio-interop-reactivestreams" % "2.0.2"

VarContext.changeDeptVar         := "zio-logging"
libraryDependencies += "dev.zio" %% "zio-logging" % "2.5.1"

VarContext.changeDeptVar        := "zhttp"
libraryDependencies += "io.d11" %% "zhttp" % "2.0.0-RC11"

VarContext.changeDeptVar                        := "scala-java8-compat"
libraryDependencies += "org.scala-lang.modules" %% "scala-java8-compat" % "1.0.2"

VarContext.changeDeptVar                        := "scala-parser-combinators"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0"

VarContext.changeDeptVar                            := "scala-logging"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"

VarContext.changeDeptVar         := "zio-nio"
libraryDependencies += "dev.zio" %% "zio-nio" % "2.0.2"

VarContext.changeDeptVar             := "scallop"
libraryDependencies += "org.rogach" %%% "scallop" % "5.2.0"

VarContext.changeDeptVar                := "spire"
libraryDependencies += "org.typelevel" %%% "spire" % "0.18.0"

VarContext.changeDeptVar               := "breeze"
libraryDependencies += "org.scalanlp" %%% "breeze" % "2.1.0"

VarContext.changeDeptVar                      := "slickless"
libraryDependencies += "net.scalax.slickless" %% "slickless" % "0.3.8-M2"

VarContext.changeDeptVar                    := "simple-adt-bridge-support"
libraryDependencies += "net.scalax.simple" %%% "simple-adt-bridge-support" % "0.0.2-temp-v12"

/*VarContext.changeDeptVar                 := "coursier"
libraryDependencies += "io.get-coursier" %% "coursier-core"  % "2.1.24"
libraryDependencies += "io.get-coursier" %% "coursier-cache" % "2.1.24"
libraryDependencies += "io.get-coursier" %% "coursier"       % "2.1.24"*/

VarContext.changeDeptVar                   := "play-json"
libraryDependencies += "org.playframework" %% "play-json" % "3.1.0-M3"

VarContext.changeDeptVar               := "sbt-main"
libraryDependencies += "org.scala-sbt" %% "main" % "2.0.0-M5"

VarContext.changeDeptVar              := "os-lib"
libraryDependencies += "com.lihaoyi" %%% "os-lib" % "0.11.5"

VarContext.changeDeptVar               := "sbt-scripted-plugin"
libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % "2.0.0-alpha10"
