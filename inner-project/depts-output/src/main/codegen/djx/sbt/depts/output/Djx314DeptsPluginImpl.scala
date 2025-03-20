package djx.sbt.depts.output

import _root_.sbt._
import _root_.sbt.Keys._
import _root_.scala.collection.compat._
import _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

trait BuildKeys {
  object libScalax {
    val `commons-lang3`: SettingKey[Seq[sbt.ModuleID]]         = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: commons-lang3""")
    val `javet-v8-android-i18n`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-android-i18n""")
    val `javet-v8-android`: SettingKey[Seq[sbt.ModuleID]]      = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-android""")
    val `javet-v8-windows-x86_64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-windows-x86_64-i18n""")
    val `javet-v8-macos-x86_64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-macos-x86_64-i18n""")
    val `javet-v8-macos-arm64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-macos-arm64-i18n""")
    val `javet-v8-linux-x86_64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-linux-x86_64-i18n""")
    val `javet-v8-linux-arm64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-linux-arm64-i18n""")
    val `javet-node-android-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-android-i18n""")
    val `javet-node-android`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-android""")
    val `javet-node-windows-x86_64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-windows-x86_64-i18n""")
    val `javet-node-macos-x86_64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-macos-x86_64-i18n""")
    val `javet-node-macos-arm64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-macos-arm64-i18n""")
    val `javet-node-linux-x86_64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-linux-x86_64-i18n""")
    val `javet-node-linux-arm64-i18n`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-linux-arm64-i18n""")
    val `shapeless3-test`: SettingKey[Seq[sbt.ModuleID]]  = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: shapeless3-test""")
    val `sbt-main`: SettingKey[Seq[sbt.ModuleID]]         = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: sbt-main""")
    val `scala-reflect`: SettingKey[Seq[sbt.ModuleID]]    = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scala-reflect""")
    val `play-json`: SettingKey[Seq[sbt.ModuleID]]        = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: play-json""")
    val `commons-compress`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: commons-compress""")
    val `jsoup`: SettingKey[Seq[sbt.ModuleID]]            = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: jsoup""")
    val `coursier`: SettingKey[Seq[sbt.ModuleID]]         = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: coursier""")
    val `sbt-launch`: SettingKey[Seq[sbt.ModuleID]]       = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: sbt-launch""")
    val `simple-adt-bridge-support`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: simple-adt-bridge-support""")
    val `slickless`: SettingKey[Seq[sbt.ModuleID]]     = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: slickless""")
    val `breeze`: SettingKey[Seq[sbt.ModuleID]]        = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: breeze""")
    val `commons-math3`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: commons-math3""")
    val `spire`: SettingKey[Seq[sbt.ModuleID]]         = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: spire""")
    val `scallop`: SettingKey[Seq[sbt.ModuleID]]       = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scallop""")
    val `zio-nio`: SettingKey[Seq[sbt.ModuleID]]       = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zio-nio""")
    val `jmh-generator-annprocess`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: jmh-generator-annprocess""")
    val `scala-logging`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scala-logging""")
    val `slf4j-nop`: SettingKey[Seq[sbt.ModuleID]]     = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: slf4j-nop""")
    val `scala-parser-combinators`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scala-parser-combinators""")
    val `scala-java8-compat`: SettingKey[Seq[sbt.ModuleID]]   = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scala-java8-compat""")
    val `postgresql-jdbc`: SettingKey[Seq[sbt.ModuleID]]      = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: postgresql-jdbc""")
    val `mysql-connector-java`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: mysql-connector-java""")
    val `zhttp`: SettingKey[Seq[sbt.ModuleID]]                = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zhttp""")
    val `zio-logging`: SettingKey[Seq[sbt.ModuleID]]          = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zio-logging""")
    val `zio-interop-reactivestreams`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zio-interop-reactivestreams""")
    val `pekko-actor`: SettingKey[Seq[sbt.ModuleID]]  = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: pekko-actor""")
    val `pekko-all`: SettingKey[Seq[sbt.ModuleID]]    = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: pekko-all""")
    val `jnativehook`: SettingKey[Seq[sbt.ModuleID]]  = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: jnativehook""")
    val `jintellitype`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: jintellitype""")
    val `javet-v8-windows-x86_64`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-windows-x86_64""")
    val `javet-v8-macos-x86_64`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-macos-x86_64""")
    val `javet-v8-macos-arm64`: SettingKey[Seq[sbt.ModuleID]]  = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-macos-arm64""")
    val `javet-v8-linux-x86_64`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-linux-x86_64""")
    val `javet-v8-linux-arm64`: SettingKey[Seq[sbt.ModuleID]]  = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-v8-linux-arm64""")
    val `javet-node-windows-x86_64`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-windows-x86_64""")
    val `javet-node-macos-x86_64`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-macos-x86_64""")
    val `javet-node-macos-arm64`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-macos-arm64""")
    val `javet-node-linux-x86_64`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-linux-x86_64""")
    val `javet-node-linux-arm64`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet-node-linux-arm64""")
    val `javet`: SettingKey[Seq[sbt.ModuleID]]           = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javet""")
    val `logback-classic`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: logback-classic""")
    val `slick`: SettingKey[Seq[sbt.ModuleID]]           = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: slick""")
    val `play-circe`: SettingKey[Seq[sbt.ModuleID]]      = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: play-circe""")
    val `distage`: SettingKey[Seq[sbt.ModuleID]]         = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: distage""")
    val `fs2`: SettingKey[Seq[sbt.ModuleID]]             = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: fs2""")
    val `shapeless`: SettingKey[Seq[sbt.ModuleID]]       = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: shapeless""")
    val `zio-json`: SettingKey[Seq[sbt.ModuleID]]        = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zio-json""")
    val `cats-effect-cps`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: cats-effect-cps""")
    val `javacv-platform`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: javacv-platform""")
    val `sbt-librarymanagement-core`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: sbt-librarymanagement-core""")
    val `simple-adt`: SettingKey[Seq[sbt.ModuleID]]           = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: simple-adt""")
    val `commons-lang3-bridge`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: commons-lang3-bridge""")
    val `macwire`: SettingKey[Seq[sbt.ModuleID]]              = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: macwire""")
    val `commons-io`: SettingKey[Seq[sbt.ModuleID]]           = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: commons-io""")
    val `slf4j-simple`: SettingKey[Seq[sbt.ModuleID]]         = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: slf4j-simple""")
    val `zio-config`: SettingKey[Seq[sbt.ModuleID]]           = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zio-config""")
    val `http4s-twirl`: SettingKey[Seq[sbt.ModuleID]]         = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: http4s-twirl""")
    val `http4s-Release-ember-client`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: http4s-Release-ember-client""")
    val `http4s-Release-ember-server`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: http4s-Release-ember-server""")
    val `http4s-Release`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: http4s-Release""")
    val `scala-collection-compat`: SettingKey[Seq[sbt.ModuleID]] =
      sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scala-collection-compat""")
    val `typesafe-config`: SettingKey[Seq[sbt.ModuleID]]    = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: typesafe-config""")
    val `zio2`: SettingKey[Seq[sbt.ModuleID]]               = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: zio2""")
    val `doobie-h2`: SettingKey[Seq[sbt.ModuleID]]          = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: doobie-h2""")
    val `doobie`: SettingKey[Seq[sbt.ModuleID]]             = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: doobie""")
    val `h2`: SettingKey[Seq[sbt.ModuleID]]                 = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: h2""")
    val `cats-core`: SettingKey[Seq[sbt.ModuleID]]          = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: cats-core""")
    val `cats-effect`: SettingKey[Seq[sbt.ModuleID]]        = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: cats-effect""")
    val `scalatest`: SettingKey[Seq[sbt.ModuleID]]          = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: scalatest""")
    val `circe-extras`: SettingKey[Seq[sbt.ModuleID]]       = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: circe-extras""")
    val `circe`: SettingKey[Seq[sbt.ModuleID]]              = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: circe""")
    val `better-monadic-for`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: better-monadic-for""")
    val `kind-projector`: SettingKey[Seq[sbt.ModuleID]]     = sbt.settingKey[Seq[sbt.ModuleID]]("""sbt library: kind-projector""")
  }
}

trait Djx314DeptsImpl {

  val buildKeys: BuildKeys
  import buildKeys._

  def libraryList: List[SettingKey[Seq[sbt.ModuleID]]] = List(
    libScalax.`commons-lang3`,
    libScalax.`javet-v8-android-i18n`,
    libScalax.`javet-v8-android`,
    libScalax.`javet-v8-windows-x86_64-i18n`,
    libScalax.`javet-v8-macos-x86_64-i18n`,
    libScalax.`javet-v8-macos-arm64-i18n`,
    libScalax.`javet-v8-linux-x86_64-i18n`,
    libScalax.`javet-v8-linux-arm64-i18n`,
    libScalax.`javet-node-android-i18n`,
    libScalax.`javet-node-android`,
    libScalax.`javet-node-windows-x86_64-i18n`,
    libScalax.`javet-node-macos-x86_64-i18n`,
    libScalax.`javet-node-macos-arm64-i18n`,
    libScalax.`javet-node-linux-x86_64-i18n`,
    libScalax.`javet-node-linux-arm64-i18n`,
    libScalax.`shapeless3-test`,
    libScalax.`sbt-main`,
    libScalax.`scala-reflect`,
    libScalax.`play-json`,
    libScalax.`commons-compress`,
    libScalax.`jsoup`,
    libScalax.`coursier`,
    libScalax.`sbt-launch`,
    libScalax.`simple-adt-bridge-support`,
    libScalax.`slickless`,
    libScalax.`breeze`,
    libScalax.`commons-math3`,
    libScalax.`spire`,
    libScalax.`scallop`,
    libScalax.`zio-nio`,
    libScalax.`jmh-generator-annprocess`,
    libScalax.`scala-logging`,
    libScalax.`slf4j-nop`,
    libScalax.`scala-parser-combinators`,
    libScalax.`scala-java8-compat`,
    libScalax.`postgresql-jdbc`,
    libScalax.`mysql-connector-java`,
    libScalax.`zhttp`,
    libScalax.`zio-logging`,
    libScalax.`zio-interop-reactivestreams`,
    libScalax.`pekko-actor`,
    libScalax.`pekko-all`,
    libScalax.`jnativehook`,
    libScalax.`jintellitype`,
    libScalax.`javet-v8-windows-x86_64`,
    libScalax.`javet-v8-macos-x86_64`,
    libScalax.`javet-v8-macos-arm64`,
    libScalax.`javet-v8-linux-x86_64`,
    libScalax.`javet-v8-linux-arm64`,
    libScalax.`javet-node-windows-x86_64`,
    libScalax.`javet-node-macos-x86_64`,
    libScalax.`javet-node-macos-arm64`,
    libScalax.`javet-node-linux-x86_64`,
    libScalax.`javet-node-linux-arm64`,
    libScalax.`javet`,
    libScalax.`logback-classic`,
    libScalax.`slick`,
    libScalax.`play-circe`,
    libScalax.`distage`,
    libScalax.`fs2`,
    libScalax.`shapeless`,
    libScalax.`zio-json`,
    libScalax.`cats-effect-cps`,
    libScalax.`javacv-platform`,
    libScalax.`sbt-librarymanagement-core`,
    libScalax.`simple-adt`,
    libScalax.`commons-lang3-bridge`,
    libScalax.`macwire`,
    libScalax.`commons-io`,
    libScalax.`slf4j-simple`,
    libScalax.`zio-config`,
    libScalax.`http4s-twirl`,
    libScalax.`http4s-Release-ember-client`,
    libScalax.`http4s-Release-ember-server`,
    libScalax.`http4s-Release`,
    libScalax.`scala-collection-compat`,
    libScalax.`typesafe-config`,
    libScalax.`zio2`,
    libScalax.`doobie-h2`,
    libScalax.`doobie`,
    libScalax.`h2`,
    libScalax.`cats-core`,
    libScalax.`cats-effect`,
    libScalax.`scalatest`,
    libScalax.`circe-extras`,
    libScalax.`circe`,
    libScalax.`better-monadic-for`,
    libScalax.`kind-projector`
  )

}
