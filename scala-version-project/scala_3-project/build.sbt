VarContext.setScalaVersion := "3"
scalaVersion               := "3.5.0"

VarContext.changeDeptVar           := "circe"
libraryDependencies += "io.circe" %%% "circe-core"    % "0.14.10"
libraryDependencies += "io.circe" %%% "circe-generic" % "0.14.10"
libraryDependencies += "io.circe" %%% "circe-parser"  % "0.14.10"

VarContext.changeDeptVar                := "scalatest"
libraryDependencies += "org.scalactic" %%% "scalactic"          % "3.2.19"
libraryDependencies += "org.scalatest" %%% "scalatest"          % "3.2.19"
libraryDependencies += "org.scalatest" %%% "scalatest-core"     % "3.2.19"
libraryDependencies += "org.scalatest" %%% "scalatest-funsuite" % "3.2.19"

VarContext.changeDeptVar                := "cats-effect"
libraryDependencies += "org.typelevel" %%% "cats-effect" % "3.5.7"

VarContext.changeDeptVar                := "cats-core"
libraryDependencies += "org.typelevel" %%% "cats-core" % "2.13.0"

VarContext.changeDeptVar               := "h2"
libraryDependencies += "com.h2database" % "h2" % "2.3.232"

VarContext.changeDeptVar              := "doobie"
libraryDependencies += "org.tpolecat" %% "doobie-core"      % "1.0.0-RC6"
libraryDependencies += "org.tpolecat" %% "doobie-hikari"    % "1.0.0-RC6"
libraryDependencies += "org.tpolecat" %% "doobie-postgres"  % "1.0.0-RC6"
libraryDependencies += "org.tpolecat" %% "doobie-scalatest" % "1.0.0-RC6"

VarContext.changeDeptVar              := "doobie-h2"
libraryDependencies += "org.tpolecat" %% "doobie-h2" % "1.0.0-RC6"

VarContext.changeDeptVar          := "zio2"
libraryDependencies += "dev.zio" %%% "zio"          % "2.1.14"
libraryDependencies += "dev.zio" %%% "zio-streams"  % "2.1.14"
libraryDependencies += "dev.zio" %%% "zio-test"     % "2.1.14"
libraryDependencies += "dev.zio" %%% "zio-test-sbt" % "2.1.14"

VarContext.changeDeptVar             := "typesafe-config"
libraryDependencies += "com.typesafe" % "config" % "1.4.3"

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
libraryDependencies += "dev.zio" %%% "zio-config"            % "4.0.3"
libraryDependencies += "dev.zio" %%% "zio-config-magnolia"   % "4.0.3"
libraryDependencies += "dev.zio" %%% "zio-config-refined"    % "4.0.3"
libraryDependencies += "dev.zio" %%% "zio-config-typesafe"   % "4.0.3"
libraryDependencies += "dev.zio" %%% "zio-config-yaml"       % "4.0.3"
libraryDependencies += "dev.zio" %%% "zio-config-derivation" % "4.0.3"

VarContext.changeDeptVar          := "slf4j-simple"
libraryDependencies += "org.slf4j" % "slf4j-simple" % "2.0.16"

VarContext.changeDeptVar                   := "commons-io"
libraryDependencies += "org.apache.commons" % "commons-io" % "1.3.2"

VarContext.changeDeptVar                           := "macwire"
libraryDependencies += "com.softwaremill.macwire" %%% "macros" % "2.6.5"

VarContext.changeDeptVar                   := "commons-lang3"
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.17.0"

VarContext.changeDeptVar            := "commons-lang3-bridge"
libraryDependencies += "net.scalax" %% "commons-lang3-bridge" % "0.1.0"

VarContext.changeDeptVar                    := "simple-adt"
libraryDependencies += "net.scalax.simple" %%% "simple-adt" % "0.0.2-M21"

VarContext.changeDeptVar               := "sbt-librarymanagement-core"
libraryDependencies += "org.scala-sbt" %% "librarymanagement-core" % "2.0.0-alpha16"

VarContext.changeDeptVar             := "javacv-platform"
libraryDependencies += "org.bytedeco" % "javacv-platform" % "1.5.11"

VarContext.changeDeptVar                := "cats-effect-cps"
libraryDependencies += "org.typelevel" %%% "cats-effect-cps" % "0.4.0"

VarContext.changeDeptVar          := "zio-json"
libraryDependencies += "dev.zio" %%% "zio-json" % "0.7.10"

VarContext.changeDeptVar                := "shapeless"
libraryDependencies += "org.typelevel" %%% "shapeless3-deriving" % "3.4.3"
libraryDependencies += "org.typelevel" %%% "shapeless3-typeable" % "3.4.3"

VarContext.changeDeptVar                := "shapeless3-test"
libraryDependencies += "org.typelevel" %%% "shapeless3-test" % "3.4.3"

VarContext.changeDeptVar         := "fs2"
libraryDependencies += "co.fs2" %%% "fs2-core"             % "3.11.0"
libraryDependencies += "co.fs2" %%% "fs2-io"               % "3.11.0"
libraryDependencies += "co.fs2"  %% "fs2-reactive-streams" % "3.11.0"
libraryDependencies += "co.fs2" %%% "fs2-scodec"           % "3.11.0"

VarContext.changeDeptVar                := "distage"
libraryDependencies += "io.7mind.izumi" %% "distage-core" % "1.2.16"

VarContext.changeDeptVar                    := "slick"
libraryDependencies += "com.typesafe.slick" %% "slick"          % "3.5.2"
libraryDependencies += "com.typesafe.slick" %% "slick-hikaricp" % "3.5.2"
libraryDependencies += "com.typesafe.slick" %% "slick-codegen"  % "3.5.2"

VarContext.changeDeptVar               := "logback-classic"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.5.16"

VarContext.changeDeptVar                  := "javet"
libraryDependencies += "com.caoccao.javet" % "javet"                          % "4.1.1"
VarContext.changeDeptVar                  := "javet-node-linux-arm64"
libraryDependencies += "com.caoccao.javet" % "javet-node-linux-arm64"         % "4.1.1"
VarContext.changeDeptVar                  := "javet-node-linux-arm64-i18n"
libraryDependencies += "com.caoccao.javet" % "javet-node-linux-arm64-i18n"    % "4.1.1"
VarContext.changeDeptVar                  := "javet-node-linux-x86_64"
libraryDependencies += "com.caoccao.javet" % "javet-node-linux-x86_64"        % "4.1.1"
VarContext.changeDeptVar                  := "javet-node-linux-x86_64-i18n"
libraryDependencies += "com.caoccao.javet" % "javet-node-linux-x86_64-i18n"   % "4.1.1"
VarContext.changeDeptVar                  := "javet-node-macos-arm64"
libraryDependencies += "com.caoccao.javet" % "javet-node-macos-arm64"         % "4.1.1"
VarContext.changeDeptVar                  := "javet-node-macos-arm64-i18n"
libraryDependencies += "com.caoccao.javet" % "javet-node-macos-arm64-i18n"    % "4.1.1"
VarContext.changeDeptVar                  := "javet-node-macos-x86_64"
libraryDependencies += "com.caoccao.javet" % "javet-node-macos-x86_64"        % "4.1.1"
VarContext.changeDeptVar                  := "javet-node-macos-x86_64-i18n"
libraryDependencies += "com.caoccao.javet" % "javet-node-macos-x86_64-i18n"   % "4.1.1"
VarContext.changeDeptVar                  := "javet-node-windows-x86_64"
libraryDependencies += "com.caoccao.javet" % "javet-node-windows-x86_64"      % "4.1.1"
VarContext.changeDeptVar                  := "javet-node-windows-x86_64-i18n"
libraryDependencies += "com.caoccao.javet" % "javet-node-windows-x86_64-i18n" % "4.1.1"
VarContext.changeDeptVar                  := "javet-node-android"
libraryDependencies += "com.caoccao.javet" % "javet-node-android"             % "4.1.1"
VarContext.changeDeptVar                  := "javet-node-android-i18n"
libraryDependencies += "com.caoccao.javet" % "javet-node-android-i18n"        % "4.1.1"
VarContext.changeDeptVar                  := "javet-v8-linux-arm64"
libraryDependencies += "com.caoccao.javet" % "javet-v8-linux-arm64"           % "4.1.1"
VarContext.changeDeptVar                  := "javet-v8-linux-arm64-i18n"
libraryDependencies += "com.caoccao.javet" % "javet-v8-linux-arm64-i18n"      % "4.1.1"
VarContext.changeDeptVar                  := "javet-v8-linux-x86_64"
libraryDependencies += "com.caoccao.javet" % "javet-v8-linux-x86_64"          % "4.1.1"
VarContext.changeDeptVar                  := "javet-v8-linux-x86_64-i18n"
libraryDependencies += "com.caoccao.javet" % "javet-v8-linux-x86_64-i18n"     % "4.1.1"
VarContext.changeDeptVar                  := "javet-v8-macos-arm64"
libraryDependencies += "com.caoccao.javet" % "javet-v8-macos-arm64"           % "4.1.1"
VarContext.changeDeptVar                  := "javet-v8-macos-arm64-i18n"
libraryDependencies += "com.caoccao.javet" % "javet-v8-macos-arm64-i18n"      % "4.1.1"
VarContext.changeDeptVar                  := "javet-v8-macos-x86_64"
libraryDependencies += "com.caoccao.javet" % "javet-v8-macos-x86_64"          % "4.1.1"
VarContext.changeDeptVar                  := "javet-v8-macos-x86_64-i18n"
libraryDependencies += "com.caoccao.javet" % "javet-v8-macos-x86_64-i18n"     % "4.1.1"
VarContext.changeDeptVar                  := "javet-v8-windows-x86_64"
libraryDependencies += "com.caoccao.javet" % "javet-v8-windows-x86_64"        % "4.1.1"
VarContext.changeDeptVar                  := "javet-v8-windows-x86_64-i18n"
libraryDependencies += "com.caoccao.javet" % "javet-v8-windows-x86_64-i18n"   % "4.1.1"
VarContext.changeDeptVar                  := "javet-v8-android"
libraryDependencies += "com.caoccao.javet" % "javet-v8-android"               % "4.1.1"
VarContext.changeDeptVar                  := "javet-v8-android-i18n"
libraryDependencies += "com.caoccao.javet" % "javet-v8-android-i18n"          % "4.1.1"

VarContext.changeDeptVar              := "jintellitype"
libraryDependencies += "com.melloware" % "jintellitype" % "1.4.1"

VarContext.changeDeptVar                 := "jnativehook"
libraryDependencies += "com.github.kwhat" % "jnativehook" % "2.2.2"

VarContext.changeDeptVar                  := "pekko-all"
libraryDependencies += "org.apache.pekko" %% "pekko-actor-typed"           % "1.1.3"
libraryDependencies += "org.apache.pekko" %% "pekko-stream-typed"          % "1.1.3"
libraryDependencies += "org.apache.pekko" %% "pekko-http"                  % "1.1.0"
libraryDependencies += "org.apache.pekko" %% "pekko-http-spray-json"       % "1.1.0"
libraryDependencies += "org.apache.pekko" %% "pekko-serialization-jackson" % "1.1.3"
libraryDependencies += "org.apache.pekko" %% "pekko-slf4j"                 % "1.1.3"

VarContext.changeDeptVar                  := "pekko-actor"
libraryDependencies += "org.apache.pekko" %% "pekko-actor" % "1.1.3"

VarContext.changeDeptVar         := "zio-interop-reactivestreams"
libraryDependencies += "dev.zio" %% "zio-interop-reactivestreams" % "2.0.2"

VarContext.changeDeptVar         := "zio-logging"
libraryDependencies += "dev.zio" %% "zio-logging" % "2.4.0"

VarContext.changeDeptVar        := "zhttp"
libraryDependencies += "io.d11" %% "zhttp" % "2.0.0-RC11"

VarContext.changeDeptVar          := "mysql-connector-java"
libraryDependencies += "com.mysql" % "mysql-connector-j" % "9.2.0"

VarContext.changeDeptVar               := "postgresql-jdbc"
libraryDependencies += "org.postgresql" % "postgresql" % "42.7.5"

VarContext.changeDeptVar                        := "scala-java8-compat"
libraryDependencies += "org.scala-lang.modules" %% "scala-java8-compat" % "1.0.2"

VarContext.changeDeptVar                        := "scala-parser-combinators"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0"

VarContext.changeDeptVar          := "slf4j-nop"
libraryDependencies += "org.slf4j" % "slf4j-nop" % "2.0.16"

VarContext.changeDeptVar                            := "scala-logging"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"

VarContext.changeDeptVar                := "jmh-generator-annprocess"
libraryDependencies += "org.openjdk.jmh" % "jmh-generator-annprocess" % "1.37"

VarContext.changeDeptVar         := "zio-nio"
libraryDependencies += "dev.zio" %% "zio-nio" % "2.0.2"

VarContext.changeDeptVar             := "scallop"
libraryDependencies += "org.rogach" %%% "scallop" % "5.2.0"

VarContext.changeDeptVar                := "spire"
libraryDependencies += "org.typelevel" %%% "spire" % "0.18.0"

VarContext.changeDeptVar                   := "commons-math3"
libraryDependencies += "org.apache.commons" % "commons-math3" % "3.6.1"

VarContext.changeDeptVar               := "breeze"
libraryDependencies += "org.scalanlp" %%% "breeze" % "2.1.0"

VarContext.changeDeptVar                      := "slickless"
libraryDependencies += "net.scalax.slickless" %% "slickless" % "0.3.8-M1"

VarContext.changeDeptVar                    := "simple-adt-bridge-support"
libraryDependencies += "net.scalax.simple" %%% "simple-adt-bridge-support" % "0.0.2-temp-v12"

VarContext.changeDeptVar              := "sbt-launch"
libraryDependencies += "org.scala-sbt" % "sbt-launch" % "1.10.7"

/*VarContext.changeDeptVar                 := "coursier"
libraryDependencies += "io.get-coursier" %% "coursier-core"  % "2.1.24"
libraryDependencies += "io.get-coursier" %% "coursier-cache" % "2.1.24"
libraryDependencies += "io.get-coursier" %% "coursier"       % "2.1.24"*/

VarContext.changeDeptVar          := "jsoup"
libraryDependencies += "org.jsoup" % "jsoup" % "1.18.3"
