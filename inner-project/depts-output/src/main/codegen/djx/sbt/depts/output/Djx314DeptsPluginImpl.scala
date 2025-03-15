package djx.sbt.depts.output

import _root_.sbt._
import _root_.sbt.Keys._
import _root_.scala.collection.compat._
import _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

trait BuildKeys extends impl.BuildKeysAbs {

  val scalaV: ScalaV = ScalaV(`v212` = """2.12.20""", `v213` = """2.13.16""", `v3` = """3.5.0""")

  object libScalax {
    val `javet-node-android`          = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-node-android""")
    val `javet-node-linux-arm64`      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-node-linux-arm64""")
    val `typesafe-config`             = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for typesafe-config""")
    val `http4s-Release-ember-server` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-Release-ember-server""")
    val `http4s-Release-ember-client` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-Release-ember-client""")
    val `postgresql-jdbc`             = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for postgresql-jdbc""")
    val `scalatest`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scalatest""")
    val `javet-node-macos-arm64`      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-node-macos-arm64""")
    val `javet-node-windows-x86_64-i18n` =
      settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-node-windows-x86_64-i18n""")
    val `javet-node-linux-x86_64-i18n` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-node-linux-x86_64-i18n""")
    val `zio-logging`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-logging""")
    val `scallop`                      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scallop""")
    val `javet-node-linux-x86_64`      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-node-linux-x86_64""")
    val `slf4j-nop`                    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for slf4j-nop""")
    val `distage`                      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for distage""")
    val `fs2`                          = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for fs2""")
    val `kind-projector`               = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for kind-projector""")
    val `simple-adt`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for simple-adt""")
    val `jmh-generator-annprocess`     = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for jmh-generator-annprocess""")
    val `commons-math3`                = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-math3""")
    val `sbt-launch`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for sbt-launch""")
    val `cats-effect`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for cats-effect""")
    val `javet-v8-windows-x86_64`      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-v8-windows-x86_64""")
    val `slick`                        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for slick""")
    val `jintellitype`                 = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for jintellitype""")
    val `scala-collection-compat`      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scala-collection-compat""")
    val `commons-lang3-bridge`         = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-lang3-bridge""")
    val `javet-v8-linux-arm64-i18n`    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-v8-linux-arm64-i18n""")
    val `http4s-twirl`                 = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-twirl""")
    val `scala-reflect`                = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scala-reflect""")
    val `commons-lang3`                = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-lang3""")
    val `doobie`                       = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for doobie""")
    val `zio-config`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-config""")
    val `pekko-actor`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for pekko-actor""")
    val `zio-nio`                      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-nio""")
    val `slf4j-simple`                 = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for slf4j-simple""")
    val `javet`                        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet""")
    val `zio-json`                     = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-json""")
    val `simple-adt-bridge-support`    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for simple-adt-bridge-support""")
    val `better-monadic-for`           = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for better-monadic-for""")
    val `circe-extras`                 = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for circe-extras""")
    val `play-circe`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for play-circe""")
    val `pekko-all`                    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for pekko-all""")
    val `scala-java8-compat`           = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scala-java8-compat""")
    val `mysql-connector-java`         = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for mysql-connector-java""")
    val `javet-v8-android`             = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-v8-android""")
    val `zhttp`                        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zhttp""")
    val `javet-v8-windows-x86_64-i18n` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-v8-windows-x86_64-i18n""")
    val `h2`                           = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for h2""")
    val `javet-node-macos-x86_64`      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-node-macos-x86_64""")
    val `zio2`                         = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio2""")
    val `logback-classic`              = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for logback-classic""")
    val `javet-node-android-i18n`      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-node-android-i18n""")
    val `http4s-Release`               = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-Release""")
    val `javet-v8-macos-arm64-i18n`    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-v8-macos-arm64-i18n""")
    val `commons-compress`             = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-compress""")
    val `javet-v8-macos-arm64`         = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-v8-macos-arm64""")
    val `javet-v8-linux-x86_64-i18n`   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-v8-linux-x86_64-i18n""")
    val `scala-logging`                = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scala-logging""")
    val `sbt-librarymanagement-core`   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for sbt-librarymanagement-core""")
    val `breeze`                       = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for breeze""")
    val `shapeless3-test`              = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for shapeless3-test""")
    val `javet-v8-linux-x86_64`        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-v8-linux-x86_64""")
    val `circe`                        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for circe""")
    val `cats-effect-cps`              = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for cats-effect-cps""")
    val `sbt-main`                     = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for sbt-main""")
    val `slickless`                    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for slickless""")
    val `doobie-h2`                    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for doobie-h2""")
    val `javet-v8-macos-x86_64-i18n`   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-v8-macos-x86_64-i18n""")
    val `javacv-platform`              = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javacv-platform""")
    val `javet-v8-linux-arm64`         = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-v8-linux-arm64""")
    val `commons-io`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-io""")
    val `shapeless`                    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for shapeless""")
    val `macwire`                      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for macwire""")
    val `play-json`                    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for play-json""")
    val `javet-v8-macos-x86_64`        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-v8-macos-x86_64""")
    val `javet-node-windows-x86_64`    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-node-windows-x86_64""")
    val `javet-node-macos-x86_64-i18n` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-node-macos-x86_64-i18n""")
    val `zio-interop-reactivestreams`  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-interop-reactivestreams""")
    val `javet-node-linux-arm64-i18n`  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-node-linux-arm64-i18n""")
    val `spire`                        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for spire""")
    val `jnativehook`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for jnativehook""")
    val `javet-v8-android-i18n`        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-v8-android-i18n""")
    val `javet-node-macos-arm64-i18n`  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javet-node-macos-arm64-i18n""")
    val `cats-core`                    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for cats-core""")
    val `scala-parser-combinators`     = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scala-parser-combinators""")
    val `coursier`                     = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for coursier""")
    val `jsoup`                        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for jsoup""")
  }
}

trait Djx314DeptsImpl {

  val buildKeys: BuildKeys
  import buildKeys._

  def settingsForDept: Seq[Setting[_]] = Seq(
    innerSetting.setKey(libScalax.`javet-node-android`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-node-linux-arm64`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`typesafe-config`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`http4s-Release-ember-server`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`http4s-Release-ember-client`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`postgresql-jdbc`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`scalatest`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-node-macos-arm64`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-node-windows-x86_64-i18n`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-node-linux-x86_64-i18n`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`zio-logging`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`scallop`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-node-linux-x86_64`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`slf4j-nop`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`distage`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`fs2`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`kind-projector`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`simple-adt`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`jmh-generator-annprocess`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`commons-math3`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`sbt-launch`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`cats-effect`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-v8-windows-x86_64`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`slick`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`jintellitype`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`scala-collection-compat`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`commons-lang3-bridge`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-v8-linux-arm64-i18n`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`http4s-twirl`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`scala-reflect`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`commons-lang3`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`doobie`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`zio-config`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`pekko-actor`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`zio-nio`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`slf4j-simple`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`zio-json`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`simple-adt-bridge-support`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`better-monadic-for`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`circe-extras`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`play-circe`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`pekko-all`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`scala-java8-compat`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`mysql-connector-java`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-v8-android`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`zhttp`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-v8-windows-x86_64-i18n`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`h2`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-node-macos-x86_64`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`zio2`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`logback-classic`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-node-android-i18n`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`http4s-Release`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-v8-macos-arm64-i18n`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`commons-compress`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-v8-macos-arm64`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-v8-linux-x86_64-i18n`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`scala-logging`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`sbt-librarymanagement-core`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`breeze`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`shapeless3-test`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-v8-linux-x86_64`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`circe`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`cats-effect-cps`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`sbt-main`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`slickless`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`doobie-h2`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-v8-macos-x86_64-i18n`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javacv-platform`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-v8-linux-arm64`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`commons-io`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`shapeless`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`macwire`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`play-json`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-v8-macos-x86_64`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-node-windows-x86_64`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-node-macos-x86_64-i18n`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`zio-interop-reactivestreams`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-node-linux-arm64-i18n`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`spire`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`jnativehook`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-v8-android-i18n`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javet-node-macos-arm64-i18n`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`cats-core`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`scala-parser-combinators`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`coursier`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`jsoup`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.addLibrarySetting(libScalax.`slf4j-nop`)(djxIsScala3)(contextLibraryCollection.apply(("slf4j-nop", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect`)(djxIsScala212)(contextLibraryCollection.apply(("cats-effect", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala213)(contextLibraryCollection.apply(("doobie", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-linux-x86_64`)(djxIsScala213)(
      contextLibraryCollection.apply(("javet-node-linux-x86_64", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`slf4j-nop`)(djxIsScala212)(contextLibraryCollection.apply(("slf4j-nop", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-linux-x86_64`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-v8-linux-x86_64", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`breeze`)(djxIsScala3)(contextLibraryCollection.apply(("breeze", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala213)(contextLibraryCollection.apply(("scalatest", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`postgresql-jdbc`)(djxIsScala213)(contextLibraryCollection.apply(("postgresql-jdbc", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-compress`)(djxIsScala3)(contextLibraryCollection.apply(("commons-compress", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala213)(contextLibraryCollection.apply(("fs2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`postgresql-jdbc`)(djxIsScala212)(contextLibraryCollection.apply(("postgresql-jdbc", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe-extras`)(djxIsScala213)(contextLibraryCollection.apply(("circe-extras", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-windows-x86_64`)(djxIsScala213)(
      contextLibraryCollection.apply(("javet-v8-windows-x86_64", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`zhttp`)(djxIsScala212)(contextLibraryCollection.apply(("zhttp", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-json`)(djxIsScala213)(contextLibraryCollection.apply(("zio-json", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-macos-x86_64`)(djxIsScala212)(
      contextLibraryCollection.apply(("javet-node-macos-x86_64", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`scala-logging`)(djxIsScala213)(contextLibraryCollection.apply(("scala-logging", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie-h2`)(djxIsScala213)(contextLibraryCollection.apply(("doobie-h2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-macos-x86_64`)(djxIsScala213)(
      contextLibraryCollection.apply(("javet-v8-macos-x86_64", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`sbt-launch`)(djxIsScala213)(contextLibraryCollection.apply(("sbt-launch", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`spire`)(djxIsScala213)(contextLibraryCollection.apply(("spire", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala213)(contextLibraryCollection.apply(("circe", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-librarymanagement-core`)(djxIsScala212)(
      contextLibraryCollection.apply(("sbt-librarymanagement-core", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`mysql-connector-java`)(djxIsScala212)(
      contextLibraryCollection.apply(("mysql-connector-java", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`play-json`)(djxIsScala212)(contextLibraryCollection.apply(("play-json", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-interop-reactivestreams`)(djxIsScala213)(
      contextLibraryCollection.apply(("zio-interop-reactivestreams", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`jmh-generator-annprocess`)(djxIsScala213)(
      contextLibraryCollection.apply(("jmh-generator-annprocess", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala212)(contextLibraryCollection.apply(("http4s-Release", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-main`)(djxIsScala3)(contextLibraryCollection.apply(("sbt-main", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-macos-x86_64`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-node-macos-x86_64", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`play-circe`)(djxIsScala212)(contextLibraryCollection.apply(("play-circe", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-windows-x86_64`)(djxIsScala212)(
      contextLibraryCollection.apply(("javet-v8-windows-x86_64", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`jintellitype`)(djxIsScala212)(contextLibraryCollection.apply(("jintellitype", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`simple-adt`)(djxIsScala212)(contextLibraryCollection.apply(("simple-adt", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-launch`)(djxIsScala212)(contextLibraryCollection.apply(("sbt-launch", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie-h2`)(djxIsScala212)(contextLibraryCollection.apply(("doobie-h2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`jintellitype`)(djxIsScala3)(contextLibraryCollection.apply(("jintellitype", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-linux-arm64-i18n`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-node-linux-arm64-i18n", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3-bridge`)(djxIsScala3)(
      contextLibraryCollection.apply(("commons-lang3-bridge", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`zio-nio`)(djxIsScala212)(contextLibraryCollection.apply(("zio-nio", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`jnativehook`)(djxIsScala3)(contextLibraryCollection.apply(("jnativehook", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless`)(djxIsScala213)(contextLibraryCollection.apply(("shapeless", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-windows-x86_64`)(djxIsScala212)(
      contextLibraryCollection.apply(("javet-node-windows-x86_64", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet`)(djxIsScala212)(contextLibraryCollection.apply(("javet", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless3-test`)(djxIsScala3)(contextLibraryCollection.apply(("shapeless3-test", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`simple-adt-bridge-support`)(djxIsScala213)(
      contextLibraryCollection.apply(("simple-adt-bridge-support", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`cats-core`)(djxIsScala3)(contextLibraryCollection.apply(("cats-core", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-parser-combinators`)(djxIsScala3)(
      contextLibraryCollection.apply(("scala-parser-combinators", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`slick`)(djxIsScala213)(contextLibraryCollection.apply(("slick", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-windows-x86_64`)(djxIsScala213)(
      contextLibraryCollection.apply(("javet-node-windows-x86_64", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`scala-reflect`)(djxIsScala213)(contextLibraryCollection.apply(("scala-reflect", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-macos-arm64-i18n`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-node-macos-arm64-i18n", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala3)(contextLibraryCollection.apply(("circe", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3-bridge`)(djxIsScala212)(
      contextLibraryCollection.apply(("commons-lang3-bridge", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-twirl`)(djxIsScala213)(contextLibraryCollection.apply(("http4s-twirl", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala212)(contextLibraryCollection.apply(("scalatest", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala212)(contextLibraryCollection.apply(("doobie", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-json`)(djxIsScala212)(contextLibraryCollection.apply(("zio-json", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`jsoup`)(djxIsScala3)(contextLibraryCollection.apply(("jsoup", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`pekko-actor`)(djxIsScala213)(contextLibraryCollection.apply(("pekko-actor", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-collection-compat`)(djxIsScala3)(
      contextLibraryCollection.apply(("scala-collection-compat", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`scala-java8-compat`)(djxIsScala213)(
      contextLibraryCollection.apply(("scala-java8-compat", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-linux-arm64`)(djxIsScala212)(
      contextLibraryCollection.apply(("javet-v8-linux-arm64", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`postgresql-jdbc`)(djxIsScala3)(contextLibraryCollection.apply(("postgresql-jdbc", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`kind-projector`)(djxIsScala213)(contextLibraryCollection.apply(("kind-projector", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-macos-arm64-i18n`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-v8-macos-arm64-i18n", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`scala-parser-combinators`)(djxIsScala212)(
      contextLibraryCollection.apply(("scala-parser-combinators", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`jnativehook`)(djxIsScala213)(contextLibraryCollection.apply(("jnativehook", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slickless`)(djxIsScala212)(contextLibraryCollection.apply(("slickless", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-server`)(djxIsScala212)(
      contextLibraryCollection.apply(("http4s-Release-ember-server", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala3)(contextLibraryCollection.apply(("zio-config", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`typesafe-config`)(djxIsScala213)(contextLibraryCollection.apply(("typesafe-config", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`better-monadic-for`)(djxIsScala212)(
      contextLibraryCollection.apply(("better-monadic-for", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`cats-effect-cps`)(djxIsScala3)(contextLibraryCollection.apply(("cats-effect-cps", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-main`)(djxIsScala212)(contextLibraryCollection.apply(("sbt-main", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`mysql-connector-java`)(djxIsScala3)(
      contextLibraryCollection.apply(("mysql-connector-java", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-server`)(djxIsScala3)(
      contextLibraryCollection.apply(("http4s-Release-ember-server", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`commons-io`)(djxIsScala213)(contextLibraryCollection.apply(("commons-io", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-macos-x86_64`)(djxIsScala212)(
      contextLibraryCollection.apply(("javet-v8-macos-x86_64", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`sbt-launch`)(djxIsScala3)(contextLibraryCollection.apply(("sbt-launch", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe-extras`)(djxIsScala212)(contextLibraryCollection.apply(("circe-extras", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-macos-arm64`)(djxIsScala212)(
      contextLibraryCollection.apply(("javet-v8-macos-arm64", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`zio-logging`)(djxIsScala3)(contextLibraryCollection.apply(("zio-logging", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-twirl`)(djxIsScala3)(contextLibraryCollection.apply(("http4s-twirl", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-client`)(djxIsScala3)(
      contextLibraryCollection.apply(("http4s-Release-ember-client", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala213)(contextLibraryCollection.apply(("zio-config", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-macos-x86_64-i18n`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-v8-macos-x86_64-i18n", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet`)(djxIsScala213)(contextLibraryCollection.apply(("javet", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`pekko-all`)(djxIsScala212)(contextLibraryCollection.apply(("pekko-all", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect`)(djxIsScala3)(contextLibraryCollection.apply(("cats-effect", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-linux-x86_64`)(djxIsScala212)(
      contextLibraryCollection.apply(("javet-v8-linux-x86_64", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`zio-interop-reactivestreams`)(djxIsScala212)(
      contextLibraryCollection.apply(("zio-interop-reactivestreams", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`simple-adt`)(djxIsScala3)(contextLibraryCollection.apply(("simple-adt", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`spire`)(djxIsScala212)(contextLibraryCollection.apply(("spire", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-librarymanagement-core`)(djxIsScala213)(
      contextLibraryCollection.apply(("sbt-librarymanagement-core", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`pekko-actor`)(djxIsScala212)(contextLibraryCollection.apply(("pekko-actor", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-client`)(djxIsScala212)(
      contextLibraryCollection.apply(("http4s-Release-ember-client", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`h2`)(djxIsScala212)(contextLibraryCollection.apply(("h2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-librarymanagement-core`)(djxIsScala3)(
      contextLibraryCollection.apply(("sbt-librarymanagement-core", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`jintellitype`)(djxIsScala213)(contextLibraryCollection.apply(("jintellitype", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala3)(contextLibraryCollection.apply(("zio2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-twirl`)(djxIsScala212)(contextLibraryCollection.apply(("http4s-twirl", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`pekko-all`)(djxIsScala213)(contextLibraryCollection.apply(("pekko-all", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-core`)(djxIsScala212)(contextLibraryCollection.apply(("cats-core", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`simple-adt-bridge-support`)(djxIsScala3)(
      contextLibraryCollection.apply(("simple-adt-bridge-support", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`play-circe`)(djxIsScala213)(contextLibraryCollection.apply(("play-circe", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect-cps`)(djxIsScala212)(contextLibraryCollection.apply(("cats-effect-cps", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-macos-arm64`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-node-macos-arm64", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-android-i18n`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-v8-android-i18n", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala212)(contextLibraryCollection.apply(("zio2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-macos-arm64`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-v8-macos-arm64", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`scala-reflect`)(djxIsScala212)(contextLibraryCollection.apply(("scala-reflect", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-java8-compat`)(djxIsScala212)(
      contextLibraryCollection.apply(("scala-java8-compat", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet-node-windows-x86_64`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-node-windows-x86_64", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javacv-platform`)(djxIsScala212)(contextLibraryCollection.apply(("javacv-platform", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`typesafe-config`)(djxIsScala3)(contextLibraryCollection.apply(("typesafe-config", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`jnativehook`)(djxIsScala212)(contextLibraryCollection.apply(("jnativehook", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet`)(djxIsScala3)(contextLibraryCollection.apply(("javet", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless`)(djxIsScala3)(contextLibraryCollection.apply(("shapeless", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-linux-arm64`)(djxIsScala212)(
      contextLibraryCollection.apply(("javet-node-linux-arm64", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet-node-macos-arm64`)(djxIsScala213)(
      contextLibraryCollection.apply(("javet-node-macos-arm64", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`scallop`)(djxIsScala212)(contextLibraryCollection.apply(("scallop", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-android-i18n`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-node-android-i18n", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala212)(contextLibraryCollection.apply(("fs2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless`)(djxIsScala212)(contextLibraryCollection.apply(("shapeless", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`breeze`)(djxIsScala212)(contextLibraryCollection.apply(("breeze", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`macwire`)(djxIsScala212)(contextLibraryCollection.apply(("macwire", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala3)(contextLibraryCollection.apply(("http4s-Release", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-io`)(djxIsScala3)(contextLibraryCollection.apply(("commons-io", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-linux-x86_64`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-node-linux-x86_64", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`macwire`)(djxIsScala213)(contextLibraryCollection.apply(("macwire", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-linux-arm64-i18n`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-v8-linux-arm64-i18n", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`zio-interop-reactivestreams`)(djxIsScala3)(
      contextLibraryCollection.apply(("zio-interop-reactivestreams", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`doobie-h2`)(djxIsScala3)(contextLibraryCollection.apply(("doobie-h2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-java8-compat`)(djxIsScala3)(
      contextLibraryCollection.apply(("scala-java8-compat", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`coursier`)(djxIsScala213)(contextLibraryCollection.apply(("coursier", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-nio`)(djxIsScala3)(contextLibraryCollection.apply(("zio-nio", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala212)(contextLibraryCollection.apply(("circe", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3`)(djxIsScala3)(contextLibraryCollection.apply(("commons-lang3", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`spire`)(djxIsScala3)(contextLibraryCollection.apply(("spire", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-linux-arm64`)(djxIsScala213)(
      contextLibraryCollection.apply(("javet-v8-linux-arm64", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`pekko-actor`)(djxIsScala3)(contextLibraryCollection.apply(("pekko-actor", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`kind-projector`)(djxIsScala212)(contextLibraryCollection.apply(("kind-projector", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-linux-arm64`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-node-linux-arm64", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`zio-nio`)(djxIsScala213)(contextLibraryCollection.apply(("zio-nio", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`jsoup`)(djxIsScala212)(contextLibraryCollection.apply(("jsoup", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`typesafe-config`)(djxIsScala212)(contextLibraryCollection.apply(("typesafe-config", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`simple-adt-bridge-support`)(djxIsScala212)(
      contextLibraryCollection.apply(("simple-adt-bridge-support", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-linux-x86_64-i18n`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-v8-linux-x86_64-i18n", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3-bridge`)(djxIsScala213)(
      contextLibraryCollection.apply(("commons-lang3-bridge", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`distage`)(djxIsScala212)(contextLibraryCollection.apply(("distage", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slickless`)(djxIsScala3)(contextLibraryCollection.apply(("slickless", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala212)(contextLibraryCollection.apply(("zio-config", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-linux-arm64`)(djxIsScala213)(
      contextLibraryCollection.apply(("javet-node-linux-arm64", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`commons-compress`)(djxIsScala212)(
      contextLibraryCollection.apply(("commons-compress", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`cats-effect`)(djxIsScala213)(contextLibraryCollection.apply(("cats-effect", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`breeze`)(djxIsScala213)(contextLibraryCollection.apply(("breeze", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala213)(contextLibraryCollection.apply(("zio2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slick`)(djxIsScala212)(contextLibraryCollection.apply(("slick", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slf4j-nop`)(djxIsScala213)(contextLibraryCollection.apply(("slf4j-nop", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`mysql-connector-java`)(djxIsScala213)(
      contextLibraryCollection.apply(("mysql-connector-java", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`zhttp`)(djxIsScala213)(contextLibraryCollection.apply(("zhttp", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scallop`)(djxIsScala213)(contextLibraryCollection.apply(("scallop", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slf4j-simple`)(djxIsScala3)(contextLibraryCollection.apply(("slf4j-simple", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-linux-x86_64`)(djxIsScala212)(
      contextLibraryCollection.apply(("javet-node-linux-x86_64", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`coursier`)(djxIsScala212)(contextLibraryCollection.apply(("coursier", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`distage`)(djxIsScala3)(contextLibraryCollection.apply(("distage", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3`)(djxIsScala212)(contextLibraryCollection.apply(("commons-lang3", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zhttp`)(djxIsScala3)(contextLibraryCollection.apply(("zhttp", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`pekko-all`)(djxIsScala3)(contextLibraryCollection.apply(("pekko-all", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala3)(contextLibraryCollection.apply(("scalatest", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-android`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-node-android", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`scala-logging`)(djxIsScala212)(contextLibraryCollection.apply(("scala-logging", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`h2`)(djxIsScala213)(contextLibraryCollection.apply(("h2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-macos-x86_64`)(djxIsScala213)(
      contextLibraryCollection.apply(("javet-node-macos-x86_64", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-macos-arm64`)(djxIsScala213)(
      contextLibraryCollection.apply(("javet-v8-macos-arm64", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`macwire`)(djxIsScala3)(contextLibraryCollection.apply(("macwire", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-json`)(djxIsScala3)(contextLibraryCollection.apply(("zio-json", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`logback-classic`)(djxIsScala212)(contextLibraryCollection.apply(("logback-classic", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`h2`)(djxIsScala3)(contextLibraryCollection.apply(("h2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-windows-x86_64-i18n`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-node-windows-x86_64-i18n", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-linux-x86_64`)(djxIsScala213)(
      contextLibraryCollection.apply(("javet-v8-linux-x86_64", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-client`)(djxIsScala213)(
      contextLibraryCollection.apply(("http4s-Release-ember-client", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet-node-macos-arm64`)(djxIsScala212)(
      contextLibraryCollection.apply(("javet-node-macos-arm64", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`scala-collection-compat`)(djxIsScala213)(
      contextLibraryCollection.apply(("scala-collection-compat", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`slf4j-simple`)(djxIsScala213)(contextLibraryCollection.apply(("slf4j-simple", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3`)(djxIsScala213)(contextLibraryCollection.apply(("commons-lang3", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`play-json`)(djxIsScala3)(contextLibraryCollection.apply(("play-json", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala3)(contextLibraryCollection.apply(("fs2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-node-linux-x86_64-i18n`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-node-linux-x86_64-i18n", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet-node-macos-x86_64-i18n`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-node-macos-x86_64-i18n", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`simple-adt`)(djxIsScala213)(contextLibraryCollection.apply(("simple-adt", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-windows-x86_64`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-v8-windows-x86_64", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`play-json`)(djxIsScala213)(contextLibraryCollection.apply(("play-json", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-math3`)(djxIsScala213)(contextLibraryCollection.apply(("commons-math3", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javacv-platform`)(djxIsScala3)(contextLibraryCollection.apply(("javacv-platform", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-linux-arm64`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-v8-linux-arm64", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`jmh-generator-annprocess`)(djxIsScala212)(
      contextLibraryCollection.apply(("jmh-generator-annprocess", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`slick`)(djxIsScala3)(contextLibraryCollection.apply(("slick", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-logging`)(djxIsScala212)(contextLibraryCollection.apply(("zio-logging", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`jmh-generator-annprocess`)(djxIsScala3)(
      contextLibraryCollection.apply(("jmh-generator-annprocess", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala3)(contextLibraryCollection.apply(("doobie", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-compress`)(djxIsScala213)(
      contextLibraryCollection.apply(("commons-compress", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`zio-logging`)(djxIsScala213)(contextLibraryCollection.apply(("zio-logging", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`logback-classic`)(djxIsScala213)(contextLibraryCollection.apply(("logback-classic", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`logback-classic`)(djxIsScala3)(contextLibraryCollection.apply(("logback-classic", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javacv-platform`)(djxIsScala213)(contextLibraryCollection.apply(("javacv-platform", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-math3`)(djxIsScala212)(contextLibraryCollection.apply(("commons-math3", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`distage`)(djxIsScala213)(contextLibraryCollection.apply(("distage", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`jsoup`)(djxIsScala213)(contextLibraryCollection.apply(("jsoup", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-math3`)(djxIsScala3)(contextLibraryCollection.apply(("commons-math3", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slickless`)(djxIsScala213)(contextLibraryCollection.apply(("slickless", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-collection-compat`)(djxIsScala212)(
      contextLibraryCollection.apply(("scala-collection-compat", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala213)(contextLibraryCollection.apply(("http4s-Release", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-io`)(djxIsScala212)(contextLibraryCollection.apply(("commons-io", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-server`)(djxIsScala213)(
      contextLibraryCollection.apply(("http4s-Release-ember-server", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-android`)(djxIsScala3)(contextLibraryCollection.apply(("javet-v8-android", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-windows-x86_64-i18n`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-v8-windows-x86_64-i18n", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javet-v8-macos-x86_64`)(djxIsScala3)(
      contextLibraryCollection.apply(("javet-v8-macos-x86_64", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`cats-core`)(djxIsScala213)(contextLibraryCollection.apply(("cats-core", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slf4j-simple`)(djxIsScala212)(contextLibraryCollection.apply(("slf4j-simple", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-logging`)(djxIsScala3)(contextLibraryCollection.apply(("scala-logging", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-parser-combinators`)(djxIsScala213)(
      contextLibraryCollection.apply(("scala-parser-combinators", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`scallop`)(djxIsScala3)(contextLibraryCollection.apply(("scallop", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect-cps`)(djxIsScala213)(contextLibraryCollection.apply(("cats-effect-cps", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`better-monadic-for`)(djxIsScala213)(
      contextLibraryCollection.apply(("better-monadic-for", "2.13"))
    )(sourcePosition.fromEnclosing())
  )

}
