package djx.sbt.depts.output

import _root_.sbt._
import _root_.sbt.Keys._
import _root_.scala.collection.compat._
import _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

trait BuildKeys {
  object libScalax {
    val `mysql-connector-java`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: mysql-connector-java""")
    val `javet-node-macos-x86_64`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-macos-x86_64""")
    val `spire`: SettingKey[Seq[sbt.ModuleID]]                 = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: spire""")
    val `zio-config`: SettingKey[Seq[sbt.ModuleID]]            = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zio-config""")
    val `zio2`: SettingKey[Seq[sbt.ModuleID]]                  = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zio2""")
    val `scala-java8-compat`: SettingKey[Seq[sbt.ModuleID]]    = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scala-java8-compat""")
    val `commons-lang3`: SettingKey[Seq[sbt.ModuleID]]         = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: commons-lang3""")
    val `scallop`: SettingKey[Seq[sbt.ModuleID]]               = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scallop""")
    val `javet-v8-linux-arm64`: SettingKey[Seq[sbt.ModuleID]]  = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-linux-arm64""")
    val `javet-node-android`: SettingKey[Seq[sbt.ModuleID]]    = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-android""")
    val `shapeless3-test`: SettingKey[Seq[sbt.ModuleID]]       = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: shapeless3-test""")
    val `doobie-h2`: SettingKey[Seq[sbt.ModuleID]]             = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: doobie-h2""")
    val `breeze`: SettingKey[Seq[sbt.ModuleID]]                = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: breeze""")
    val `simple-adt`: SettingKey[Seq[sbt.ModuleID]]            = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: simple-adt""")
    val `javet-v8-android-i18n`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-android-i18n""")
    val `javet-v8-linux-arm64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-linux-arm64-i18n""")
    val `scala-reflect`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scala-reflect""")
    val `javet-v8-windows-x86_64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-windows-x86_64-i18n""")
    val `simple-adt-bridge-support`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: simple-adt-bridge-support""")
    val `http4s-Release-ember-server`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: http4s-Release-ember-server""")
    val `cats-core`: SettingKey[Seq[sbt.ModuleID]]      = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: cats-core""")
    val `play-circe`: SettingKey[Seq[sbt.ModuleID]]     = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: play-circe""")
    val `kind-projector`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: kind-projector""")
    val `commons-math3`: SettingKey[Seq[sbt.ModuleID]]  = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: commons-math3""")
    val `javet-node-linux-x86_64`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-linux-x86_64""")
    val `javacv-platform`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javacv-platform""")
    val `logback-classic`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: logback-classic""")
    val `cats-effect-cps`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: cats-effect-cps""")
    val `zio-interop-reactivestreams`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zio-interop-reactivestreams""")
    val `javet-v8-android`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-android""")
    val `javet-v8-macos-x86_64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-macos-x86_64-i18n""")
    val `jmh-generator-annprocess`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: jmh-generator-annprocess""")
    val `javet-node-linux-x86_64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-linux-x86_64-i18n""")
    val `javet-node-macos-x86_64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-macos-x86_64-i18n""")
    val `http4s-Release`: SettingKey[Seq[sbt.ModuleID]]        = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: http4s-Release""")
    val `slick`: SettingKey[Seq[sbt.ModuleID]]                 = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: slick""")
    val `better-monadic-for`: SettingKey[Seq[sbt.ModuleID]]    = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: better-monadic-for""")
    val `typesafe-config`: SettingKey[Seq[sbt.ModuleID]]       = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: typesafe-config""")
    val `javet-v8-macos-x86_64`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-macos-x86_64""")
    val `javet-v8-macos-arm64`: SettingKey[Seq[sbt.ModuleID]]  = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-macos-arm64""")
    val `commons-lang3-bridge`: SettingKey[Seq[sbt.ModuleID]]  = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: commons-lang3-bridge""")
    val `commons-compress`: SettingKey[Seq[sbt.ModuleID]]      = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: commons-compress""")
    val `slf4j-nop`: SettingKey[Seq[sbt.ModuleID]]             = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: slf4j-nop""")
    val `javet-node-linux-arm64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-linux-arm64-i18n""")
    val `play-json`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: play-json""")
    val `coursier`: SettingKey[Seq[sbt.ModuleID]]  = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: coursier""")
    val `h2`: SettingKey[Seq[sbt.ModuleID]]        = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: h2""")
    val `fs2`: SettingKey[Seq[sbt.ModuleID]]       = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: fs2""")
    val `javet-node-linux-arm64`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-linux-arm64""")
    val `javet-v8-macos-arm64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-macos-arm64-i18n""")
    val `sbt-launch`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: sbt-launch""")
    val `javet-node-macos-arm64`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-macos-arm64""")
    val `http4s-Release-ember-client`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: http4s-Release-ember-client""")
    val `doobie`: SettingKey[Seq[sbt.ModuleID]]      = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: doobie""")
    val `shapeless`: SettingKey[Seq[sbt.ModuleID]]   = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: shapeless""")
    val `zio-logging`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zio-logging""")
    val `macwire`: SettingKey[Seq[sbt.ModuleID]]     = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: macwire""")
    val `javet-node-windows-x86_64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-windows-x86_64-i18n""")
    val `javet-node-windows-x86_64`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-windows-x86_64""")
    val `pekko-actor`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: pekko-actor""")
    val `sbt-librarymanagement-core`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: sbt-librarymanagement-core""")
    val `postgresql-jdbc`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: postgresql-jdbc""")
    val `scala-collection-compat`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scala-collection-compat""")
    val `cats-effect`: SettingKey[Seq[sbt.ModuleID]]   = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: cats-effect""")
    val `scala-logging`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scala-logging""")
    val `circe`: SettingKey[Seq[sbt.ModuleID]]         = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: circe""")
    val `javet`: SettingKey[Seq[sbt.ModuleID]]         = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet""")
    val `slickless`: SettingKey[Seq[sbt.ModuleID]]     = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: slickless""")
    val `javet-v8-windows-x86_64`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-windows-x86_64""")
    val `http4s-twirl`: SettingKey[Seq[sbt.ModuleID]]          = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: http4s-twirl""")
    val `sbt-main`: SettingKey[Seq[sbt.ModuleID]]              = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: sbt-main""")
    val `zio-json`: SettingKey[Seq[sbt.ModuleID]]              = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zio-json""")
    val `zhttp`: SettingKey[Seq[sbt.ModuleID]]                 = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zhttp""")
    val `zio-nio`: SettingKey[Seq[sbt.ModuleID]]               = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zio-nio""")
    val `distage`: SettingKey[Seq[sbt.ModuleID]]               = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: distage""")
    val `scalatest`: SettingKey[Seq[sbt.ModuleID]]             = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scalatest""")
    val `jintellitype`: SettingKey[Seq[sbt.ModuleID]]          = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: jintellitype""")
    val `jsoup`: SettingKey[Seq[sbt.ModuleID]]                 = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: jsoup""")
    val `jnativehook`: SettingKey[Seq[sbt.ModuleID]]           = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: jnativehook""")
    val `javet-v8-linux-x86_64`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-linux-x86_64""")
    val `slf4j-simple`: SettingKey[Seq[sbt.ModuleID]]          = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: slf4j-simple""")
    val `javet-node-macos-arm64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-macos-arm64-i18n""")
    val `javet-v8-linux-x86_64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-linux-x86_64-i18n""")
    val `pekko-all`: SettingKey[Seq[sbt.ModuleID]]  = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: pekko-all""")
    val `commons-io`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: commons-io""")
    val `javet-node-android-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-android-i18n""")
    val `circe-extras`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: circe-extras""")
    val `scala-parser-combinators`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scala-parser-combinators""")
  }
}

trait Djx314DeptsImpl {

  val buildKeys: BuildKeys
  import buildKeys._

  def libraryMap: Map[String, SettingKey[Seq[sbt.ModuleID]]] = Map(
    ("""mysql-connector-java""", libScalax.`mysql-connector-java`),
    ("""javet-node-macos-x86_64""", libScalax.`javet-node-macos-x86_64`),
    ("""spire""", libScalax.`spire`),
    ("""zio-config""", libScalax.`zio-config`),
    ("""zio2""", libScalax.`zio2`),
    ("""scala-java8-compat""", libScalax.`scala-java8-compat`),
    ("""commons-lang3""", libScalax.`commons-lang3`),
    ("""scallop""", libScalax.`scallop`),
    ("""javet-v8-linux-arm64""", libScalax.`javet-v8-linux-arm64`),
    ("""javet-node-android""", libScalax.`javet-node-android`),
    ("""shapeless3-test""", libScalax.`shapeless3-test`),
    ("""doobie-h2""", libScalax.`doobie-h2`),
    ("""breeze""", libScalax.`breeze`),
    ("""simple-adt""", libScalax.`simple-adt`),
    ("""javet-v8-android-i18n""", libScalax.`javet-v8-android-i18n`),
    ("""javet-v8-linux-arm64-i18n""", libScalax.`javet-v8-linux-arm64-i18n`),
    ("""scala-reflect""", libScalax.`scala-reflect`),
    ("""javet-v8-windows-x86_64-i18n""", libScalax.`javet-v8-windows-x86_64-i18n`),
    ("""simple-adt-bridge-support""", libScalax.`simple-adt-bridge-support`),
    ("""http4s-Release-ember-server""", libScalax.`http4s-Release-ember-server`),
    ("""cats-core""", libScalax.`cats-core`),
    ("""play-circe""", libScalax.`play-circe`),
    ("""kind-projector""", libScalax.`kind-projector`),
    ("""commons-math3""", libScalax.`commons-math3`),
    ("""javet-node-linux-x86_64""", libScalax.`javet-node-linux-x86_64`),
    ("""javacv-platform""", libScalax.`javacv-platform`),
    ("""logback-classic""", libScalax.`logback-classic`),
    ("""cats-effect-cps""", libScalax.`cats-effect-cps`),
    ("""zio-interop-reactivestreams""", libScalax.`zio-interop-reactivestreams`),
    ("""javet-v8-android""", libScalax.`javet-v8-android`),
    ("""javet-v8-macos-x86_64-i18n""", libScalax.`javet-v8-macos-x86_64-i18n`),
    ("""jmh-generator-annprocess""", libScalax.`jmh-generator-annprocess`),
    ("""javet-node-linux-x86_64-i18n""", libScalax.`javet-node-linux-x86_64-i18n`),
    ("""javet-node-macos-x86_64-i18n""", libScalax.`javet-node-macos-x86_64-i18n`),
    ("""http4s-Release""", libScalax.`http4s-Release`),
    ("""slick""", libScalax.`slick`),
    ("""better-monadic-for""", libScalax.`better-monadic-for`),
    ("""typesafe-config""", libScalax.`typesafe-config`),
    ("""javet-v8-macos-x86_64""", libScalax.`javet-v8-macos-x86_64`),
    ("""javet-v8-macos-arm64""", libScalax.`javet-v8-macos-arm64`),
    ("""commons-lang3-bridge""", libScalax.`commons-lang3-bridge`),
    ("""commons-compress""", libScalax.`commons-compress`),
    ("""slf4j-nop""", libScalax.`slf4j-nop`),
    ("""javet-node-linux-arm64-i18n""", libScalax.`javet-node-linux-arm64-i18n`),
    ("""play-json""", libScalax.`play-json`),
    ("""coursier""", libScalax.`coursier`),
    ("""h2""", libScalax.`h2`),
    ("""fs2""", libScalax.`fs2`),
    ("""javet-node-linux-arm64""", libScalax.`javet-node-linux-arm64`),
    ("""javet-v8-macos-arm64-i18n""", libScalax.`javet-v8-macos-arm64-i18n`),
    ("""sbt-launch""", libScalax.`sbt-launch`),
    ("""javet-node-macos-arm64""", libScalax.`javet-node-macos-arm64`),
    ("""http4s-Release-ember-client""", libScalax.`http4s-Release-ember-client`),
    ("""doobie""", libScalax.`doobie`),
    ("""shapeless""", libScalax.`shapeless`),
    ("""zio-logging""", libScalax.`zio-logging`),
    ("""macwire""", libScalax.`macwire`),
    ("""javet-node-windows-x86_64-i18n""", libScalax.`javet-node-windows-x86_64-i18n`),
    ("""javet-node-windows-x86_64""", libScalax.`javet-node-windows-x86_64`),
    ("""pekko-actor""", libScalax.`pekko-actor`),
    ("""sbt-librarymanagement-core""", libScalax.`sbt-librarymanagement-core`),
    ("""postgresql-jdbc""", libScalax.`postgresql-jdbc`),
    ("""scala-collection-compat""", libScalax.`scala-collection-compat`),
    ("""cats-effect""", libScalax.`cats-effect`),
    ("""scala-logging""", libScalax.`scala-logging`),
    ("""circe""", libScalax.`circe`),
    ("""javet""", libScalax.`javet`),
    ("""slickless""", libScalax.`slickless`),
    ("""javet-v8-windows-x86_64""", libScalax.`javet-v8-windows-x86_64`),
    ("""http4s-twirl""", libScalax.`http4s-twirl`),
    ("""sbt-main""", libScalax.`sbt-main`),
    ("""zio-json""", libScalax.`zio-json`),
    ("""zhttp""", libScalax.`zhttp`),
    ("""zio-nio""", libScalax.`zio-nio`),
    ("""distage""", libScalax.`distage`),
    ("""scalatest""", libScalax.`scalatest`),
    ("""jintellitype""", libScalax.`jintellitype`),
    ("""jsoup""", libScalax.`jsoup`),
    ("""jnativehook""", libScalax.`jnativehook`),
    ("""javet-v8-linux-x86_64""", libScalax.`javet-v8-linux-x86_64`),
    ("""slf4j-simple""", libScalax.`slf4j-simple`),
    ("""javet-node-macos-arm64-i18n""", libScalax.`javet-node-macos-arm64-i18n`),
    ("""javet-v8-linux-x86_64-i18n""", libScalax.`javet-v8-linux-x86_64-i18n`),
    ("""pekko-all""", libScalax.`pekko-all`),
    ("""commons-io""", libScalax.`commons-io`),
    ("""javet-node-android-i18n""", libScalax.`javet-node-android-i18n`),
    ("""circe-extras""", libScalax.`circe-extras`),
    ("""scala-parser-combinators""", libScalax.`scala-parser-combinators`)
  )

}
