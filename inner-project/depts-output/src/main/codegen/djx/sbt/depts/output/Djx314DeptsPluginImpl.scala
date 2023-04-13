package djx.sbt.depts.output

import _root_.sbt._
import _root_.sbt.Keys._
import _root_.scala.collection.compat._
import _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

trait BuildKeys extends impl.BuildKeysAbs {

  val scalaV: ScalaV = ScalaV(`v211` = """2.11.12""", `v212` = """2.12.17""", `v213` = """2.13.10""", `v3` = """3.2.2""")

  object libScalax {
    val `typesafe-config`             = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for typesafe-config""")
    val `http4s-Release-ember-server` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-Release-ember-server""")
    val `http4s-Release-ember-client` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-Release-ember-client""")
    val `scalatest`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scalatest""")
    val `scala-sbt`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scala-sbt""")
    val `fs2`                         = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for fs2""")
    val `kind-projector`              = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for kind-projector""")
    val `simple-adt`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for simple-adt""")
    val `cats-effect`                 = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for cats-effect""")
    val `scala-collection-compat`     = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scala-collection-compat""")
    val `commons-lang3-bridge`        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-lang3-bridge""")
    val `http4s-twirl`                = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-twirl""")
    val `commons-lang3`               = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-lang3""")
    val `doobie`                      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for doobie""")
    val `zio-config`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-config""")
    val `slf4j-simple`                = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for slf4j-simple""")
    val `zio-json`                    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-json""")
    val `h2`                          = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for h2""")
    val `zio2`                        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio2""")
    val `http4s-Release`              = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-Release""")
    val `sbt-librarymanagement-core`  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for sbt-librarymanagement-core""")
    val `shapeless3-test`             = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for shapeless3-test""")
    val `circe`                       = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for circe""")
    val `cats-effect-cps`             = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for cats-effect-cps""")
    val `doobie-h2`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for doobie-h2""")
    val `javacv-platform`             = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javacv-platform""")
    val `commons-io`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-io""")
    val `shapeless`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for shapeless""")
    val `macwire`                     = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for macwire""")
    val `cats`                        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for cats""")
  }
}

trait Djx314DeptsImpl {

  val buildKeys: BuildKeys
  import buildKeys._

  def settingsForDept: Seq[Setting[_]] = Seq(
    libScalax.`typesafe-config`             := libScalax.`typesafe-config`.?.value.to(List).flatten,
    libScalax.`http4s-Release-ember-server` := libScalax.`http4s-Release-ember-server`.?.value.to(List).flatten,
    libScalax.`http4s-Release-ember-client` := libScalax.`http4s-Release-ember-client`.?.value.to(List).flatten,
    libScalax.`scalatest`                   := libScalax.`scalatest`.?.value.to(List).flatten,
    libScalax.`scala-sbt`                   := libScalax.`scala-sbt`.?.value.to(List).flatten,
    libScalax.`fs2`                         := libScalax.`fs2`.?.value.to(List).flatten,
    libScalax.`kind-projector`              := libScalax.`kind-projector`.?.value.to(List).flatten,
    libScalax.`simple-adt`                  := libScalax.`simple-adt`.?.value.to(List).flatten,
    libScalax.`cats-effect`                 := libScalax.`cats-effect`.?.value.to(List).flatten,
    libScalax.`scala-collection-compat`     := libScalax.`scala-collection-compat`.?.value.to(List).flatten,
    libScalax.`commons-lang3-bridge`        := libScalax.`commons-lang3-bridge`.?.value.to(List).flatten,
    libScalax.`http4s-twirl`                := libScalax.`http4s-twirl`.?.value.to(List).flatten,
    libScalax.`commons-lang3`               := libScalax.`commons-lang3`.?.value.to(List).flatten,
    libScalax.`doobie`                      := libScalax.`doobie`.?.value.to(List).flatten,
    libScalax.`zio-config`                  := libScalax.`zio-config`.?.value.to(List).flatten,
    libScalax.`slf4j-simple`                := libScalax.`slf4j-simple`.?.value.to(List).flatten,
    libScalax.`zio-json`                    := libScalax.`zio-json`.?.value.to(List).flatten,
    libScalax.`h2`                          := libScalax.`h2`.?.value.to(List).flatten,
    libScalax.`zio2`                        := libScalax.`zio2`.?.value.to(List).flatten,
    libScalax.`http4s-Release`              := libScalax.`http4s-Release`.?.value.to(List).flatten,
    libScalax.`sbt-librarymanagement-core`  := libScalax.`sbt-librarymanagement-core`.?.value.to(List).flatten,
    libScalax.`shapeless3-test`             := libScalax.`shapeless3-test`.?.value.to(List).flatten,
    libScalax.`circe`                       := libScalax.`circe`.?.value.to(List).flatten,
    libScalax.`cats-effect-cps`             := libScalax.`cats-effect-cps`.?.value.to(List).flatten,
    libScalax.`doobie-h2`                   := libScalax.`doobie-h2`.?.value.to(List).flatten,
    libScalax.`javacv-platform`             := libScalax.`javacv-platform`.?.value.to(List).flatten,
    libScalax.`commons-io`                  := libScalax.`commons-io`.?.value.to(List).flatten,
    libScalax.`shapeless`                   := libScalax.`shapeless`.?.value.to(List).flatten,
    libScalax.`macwire`                     := libScalax.`macwire`.?.value.to(List).flatten,
    libScalax.`cats`                        := libScalax.`cats`.?.value.to(List).flatten,
    libScalax.`kind-projector` ++= {
      djx.sbt.depts.plugins.pUtils.setting
        .javaLibrary(djxIsScala211)("""org.typelevel""", """kind-projector""", """0.13.2""")
        .value
        .map(s => s cross CrossVersion.full)
    },
    libScalax.`circe` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""io.circe""", """circe-core""", """0.11.2""").value
    },
    libScalax.`circe` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""io.circe""", """circe-generic""", """0.11.2""").value
    },
    libScalax.`circe` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""io.circe""", """circe-parser""", """0.11.2""").value
    },
    libScalax.`scalatest` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala211)("""org.scalactic""", """scalactic""", """3.2.15""").value
    },
    libScalax.`scalatest` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala211)("""org.scalatest""", """scalatest""", """3.2.15""").value
    },
    libScalax.`scalatest` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala211)("""org.scalatest""", """scalatest-core""", """3.2.15""").value
    },
    libScalax.`cats-effect` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""org.typelevel""", """cats-effect""", """2.0.0""").value
    },
    libScalax.`cats` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""org.typelevel""", """cats-core""", """2.0.0""").value
    },
    libScalax.`cats` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""org.typelevel""", """cats-free""", """2.0.0""").value
    },
    libScalax.`h2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala211)("""com.h2database""", """h2""", """2.1.214""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala211)("""org.tpolecat""", """doobie-core""", """0.7.1""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala211)("""org.tpolecat""", """doobie-hikari""", """0.7.1""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala211)("""org.tpolecat""", """doobie-postgres""", """0.7.1""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala211)("""org.tpolecat""", """doobie-scalatest""", """0.7.1""").value
    },
    libScalax.`doobie-h2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala211)("""org.tpolecat""", """doobie-h2""", """0.7.1""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""dev.zio""", """zio""", """2.0.10""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""dev.zio""", """zio-streams""", """2.0.10""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""dev.zio""", """zio-test""", """2.0.10""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""dev.zio""", """zio-test-sbt""", """2.0.10""").value
    },
    libScalax.`typesafe-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala211)("""com.typesafe""", """config""", """1.4.2""").value
    },
    libScalax.`scala-collection-compat` ++= {
      djx.sbt.depts.plugins.pUtils.setting
        .scalaJsLibrary(djxIsScala211)("""org.scala-lang.modules""", """scala-collection-compat""", """2.9.0""")
        .value
    },
    libScalax.`http4s-Release` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""org.http4s""", """http4s-dsl""", """0.20.23""").value
    },
    libScalax.`http4s-Release` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""org.http4s""", """http4s-circe""", """0.20.23""").value
    },
    libScalax.`http4s-twirl` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala211)("""org.http4s""", """http4s-twirl""", """0.20.23""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""dev.zio""", """zio-config""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""dev.zio""", """zio-config-typesafe""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""dev.zio""", """zio-config-yaml""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""dev.zio""", """zio-config-derivation""", """3.0.7""").value
    },
    libScalax.`slf4j-simple` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala211)("""org.slf4j""", """slf4j-simple""", """2.0.7""").value
    },
    libScalax.`commons-io` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala211)("""org.apache.commons""", """commons-io""", """1.3.2""").value
    },
    libScalax.`macwire` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""com.softwaremill.macwire""", """macros""", """2.3.7""").value
    },
    libScalax.`commons-lang3` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala211)("""org.apache.commons""", """commons-lang3""", """3.12.0""").value
    },
    libScalax.`commons-lang3-bridge` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala211)("""net.scalax""", """commons-lang3-bridge""", """0.1.0""").value
    },
    libScalax.`simple-adt` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""net.scalax.simple""", """simple-adt""", """0.0.1-M7""").value
    },
    libScalax.`sbt-librarymanagement-core` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala211)("""org.scala-sbt""", """librarymanagement-core""", """1.2.4""").value
    },
    libScalax.`javacv-platform` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala211)("""org.bytedeco""", """javacv-platform""", """1.5.8""").value
    },
    libScalax.`shapeless` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""com.chuusai""", """shapeless""", """2.3.10""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""co.fs2""", """fs2-core""", """2.1.0""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala211)("""co.fs2""", """fs2-io""", """2.1.0""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala211)("""co.fs2""", """fs2-reactive-streams""", """2.1.0""").value
    },
    libScalax.`kind-projector` ++= {
      djx.sbt.depts.plugins.pUtils.setting
        .javaLibrary(djxIsScala212)("""org.typelevel""", """kind-projector""", """0.13.2""")
        .value
        .map(s => s cross CrossVersion.full)
    },
    libScalax.`circe` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""io.circe""", """circe-core""", """0.14.5""").value
    },
    libScalax.`circe` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""io.circe""", """circe-generic""", """0.14.5""").value
    },
    libScalax.`circe` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""io.circe""", """circe-parser""", """0.14.5""").value
    },
    libScalax.`scalatest` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala212)("""org.scalactic""", """scalactic""", """3.2.15""").value
    },
    libScalax.`scalatest` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala212)("""org.scalatest""", """scalatest""", """3.2.15""").value
    },
    libScalax.`scalatest` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala212)("""org.scalatest""", """scalatest-core""", """3.2.15""").value
    },
    libScalax.`cats-effect` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""org.typelevel""", """cats-effect""", """3.4.8""").value
    },
    libScalax.`cats` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""org.typelevel""", """cats-core""", """2.9.0""").value
    },
    libScalax.`h2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala212)("""com.h2database""", """h2""", """2.1.214""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala212)("""org.tpolecat""", """doobie-core""", """1.0.0-RC2""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala212)("""org.tpolecat""", """doobie-hikari""", """1.0.0-RC2""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala212)("""org.tpolecat""", """doobie-postgres""", """1.0.0-RC2""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala212)("""org.tpolecat""", """doobie-scalatest""", """1.0.0-RC2""").value
    },
    libScalax.`doobie-h2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala212)("""org.tpolecat""", """doobie-h2""", """1.0.0-RC2""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""dev.zio""", """zio""", """2.0.10""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""dev.zio""", """zio-streams""", """2.0.10""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""dev.zio""", """zio-test""", """2.0.10""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""dev.zio""", """zio-test-sbt""", """2.0.10""").value
    },
    libScalax.`typesafe-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala212)("""com.typesafe""", """config""", """1.4.2""").value
    },
    libScalax.`scala-collection-compat` ++= {
      djx.sbt.depts.plugins.pUtils.setting
        .scalaJsLibrary(djxIsScala212)("""org.scala-lang.modules""", """scala-collection-compat""", """2.9.0""")
        .value
    },
    libScalax.`http4s-Release` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""org.http4s""", """http4s-dsl""", """0.23.18""").value
    },
    libScalax.`http4s-Release` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""org.http4s""", """http4s-circe""", """0.23.18""").value
    },
    libScalax.`http4s-Release-ember-server` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""org.http4s""", """http4s-ember-server""", """0.23.18""").value
    },
    libScalax.`http4s-Release-ember-client` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""org.http4s""", """http4s-ember-client""", """0.23.18""").value
    },
    libScalax.`http4s-twirl` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala212)("""org.http4s""", """http4s-twirl""", """0.23.17""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""dev.zio""", """zio-config""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""dev.zio""", """zio-config-magnolia""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""dev.zio""", """zio-config-refined""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""dev.zio""", """zio-config-typesafe""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""dev.zio""", """zio-config-yaml""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""dev.zio""", """zio-config-derivation""", """3.0.7""").value
    },
    libScalax.`slf4j-simple` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala212)("""org.slf4j""", """slf4j-simple""", """2.0.7""").value
    },
    libScalax.`commons-io` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala212)("""org.apache.commons""", """commons-io""", """1.3.2""").value
    },
    libScalax.`macwire` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""com.softwaremill.macwire""", """macros""", """2.5.8""").value
    },
    libScalax.`commons-lang3` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala212)("""org.apache.commons""", """commons-lang3""", """3.12.0""").value
    },
    libScalax.`commons-lang3-bridge` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala212)("""net.scalax""", """commons-lang3-bridge""", """0.1.0""").value
    },
    libScalax.`simple-adt` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""net.scalax.simple""", """simple-adt""", """0.0.1-M7""").value
    },
    libScalax.`sbt-librarymanagement-core` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala212)("""org.scala-sbt""", """librarymanagement-core""", """1.8.0""").value
    },
    libScalax.`scala-sbt` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala212)("""org.scala-sbt""", """sbt""", """1.8.1""").value
    },
    libScalax.`javacv-platform` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala212)("""org.bytedeco""", """javacv-platform""", """1.5.8""").value
    },
    libScalax.`cats-effect-cps` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""org.typelevel""", """cats-effect-cps""", """0.4.0""").value
    },
    libScalax.`zio-json` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""dev.zio""", """zio-json""", """0.5.0""").value
    },
    libScalax.`shapeless` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""com.chuusai""", """shapeless""", """2.3.10""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""co.fs2""", """fs2-core""", """3.6.1""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""co.fs2""", """fs2-io""", """3.6.1""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala212)("""co.fs2""", """fs2-reactive-streams""", """3.6.1""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala212)("""co.fs2""", """fs2-scodec""", """3.6.1""").value
    },
    libScalax.`kind-projector` ++= {
      djx.sbt.depts.plugins.pUtils.setting
        .javaLibrary(djxIsScala213)("""org.typelevel""", """kind-projector""", """0.13.2""")
        .value
        .map(s => s cross CrossVersion.full)
    },
    libScalax.`circe` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""io.circe""", """circe-core""", """0.14.5""").value
    },
    libScalax.`circe` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""io.circe""", """circe-generic""", """0.14.5""").value
    },
    libScalax.`circe` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""io.circe""", """circe-parser""", """0.14.5""").value
    },
    libScalax.`scalatest` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala213)("""org.scalactic""", """scalactic""", """3.2.15""").value
    },
    libScalax.`scalatest` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala213)("""org.scalatest""", """scalatest""", """3.2.15""").value
    },
    libScalax.`scalatest` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala213)("""org.scalatest""", """scalatest-core""", """3.2.15""").value
    },
    libScalax.`cats-effect` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""org.typelevel""", """cats-effect""", """3.4.8""").value
    },
    libScalax.`cats` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""org.typelevel""", """cats-core""", """2.9.0""").value
    },
    libScalax.`h2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala213)("""com.h2database""", """h2""", """2.1.214""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala213)("""org.tpolecat""", """doobie-core""", """1.0.0-RC2""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala213)("""org.tpolecat""", """doobie-hikari""", """1.0.0-RC2""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala213)("""org.tpolecat""", """doobie-postgres""", """1.0.0-RC2""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala213)("""org.tpolecat""", """doobie-scalatest""", """1.0.0-RC2""").value
    },
    libScalax.`doobie-h2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala213)("""org.tpolecat""", """doobie-h2""", """1.0.0-RC2""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""dev.zio""", """zio""", """2.0.10""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""dev.zio""", """zio-streams""", """2.0.10""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""dev.zio""", """zio-test""", """2.0.10""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""dev.zio""", """zio-test-sbt""", """2.0.10""").value
    },
    libScalax.`typesafe-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala213)("""com.typesafe""", """config""", """1.4.2""").value
    },
    libScalax.`scala-collection-compat` ++= {
      djx.sbt.depts.plugins.pUtils.setting
        .scalaJsLibrary(djxIsScala213)("""org.scala-lang.modules""", """scala-collection-compat""", """2.9.0""")
        .value
    },
    libScalax.`http4s-Release` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""org.http4s""", """http4s-dsl""", """0.23.18""").value
    },
    libScalax.`http4s-Release` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""org.http4s""", """http4s-circe""", """0.23.18""").value
    },
    libScalax.`http4s-Release-ember-server` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""org.http4s""", """http4s-ember-server""", """0.23.18""").value
    },
    libScalax.`http4s-Release-ember-client` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""org.http4s""", """http4s-ember-client""", """0.23.18""").value
    },
    libScalax.`http4s-twirl` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala213)("""org.http4s""", """http4s-twirl""", """0.23.17""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""dev.zio""", """zio-config""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""dev.zio""", """zio-config-magnolia""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""dev.zio""", """zio-config-refined""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""dev.zio""", """zio-config-typesafe""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""dev.zio""", """zio-config-yaml""", """3.0.7""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""dev.zio""", """zio-config-derivation""", """3.0.7""").value
    },
    libScalax.`slf4j-simple` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala213)("""org.slf4j""", """slf4j-simple""", """2.0.7""").value
    },
    libScalax.`commons-io` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala213)("""org.apache.commons""", """commons-io""", """1.3.2""").value
    },
    libScalax.`macwire` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""com.softwaremill.macwire""", """macros""", """2.5.8""").value
    },
    libScalax.`commons-lang3` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala213)("""org.apache.commons""", """commons-lang3""", """3.12.0""").value
    },
    libScalax.`commons-lang3-bridge` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala213)("""net.scalax""", """commons-lang3-bridge""", """0.1.0""").value
    },
    libScalax.`simple-adt` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""net.scalax.simple""", """simple-adt""", """0.0.1-M7""").value
    },
    libScalax.`sbt-librarymanagement-core` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala213)("""org.scala-sbt""", """librarymanagement-core""", """1.8.0""").value
    },
    libScalax.`javacv-platform` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala213)("""org.bytedeco""", """javacv-platform""", """1.5.8""").value
    },
    libScalax.`cats-effect-cps` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""org.typelevel""", """cats-effect-cps""", """0.4.0""").value
    },
    libScalax.`zio-json` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""dev.zio""", """zio-json""", """0.5.0""").value
    },
    libScalax.`shapeless` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""com.chuusai""", """shapeless""", """2.3.10""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""co.fs2""", """fs2-core""", """3.6.1""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""co.fs2""", """fs2-io""", """3.6.1""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala213)("""co.fs2""", """fs2-reactive-streams""", """3.6.1""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala213)("""co.fs2""", """fs2-scodec""", """3.6.1""").value
    },
    libScalax.`circe` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""io.circe""", """circe-core""", """0.14.5""").value
    },
    libScalax.`circe` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""io.circe""", """circe-generic""", """0.14.5""").value
    },
    libScalax.`circe` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""io.circe""", """circe-parser""", """0.14.5""").value
    },
    libScalax.`scalatest` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala3)("""org.scalactic""", """scalactic""", """3.2.15""").value
    },
    libScalax.`scalatest` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala3)("""org.scalatest""", """scalatest""", """3.2.15""").value
    },
    libScalax.`scalatest` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala3)("""org.scalatest""", """scalatest-core""", """3.2.15""").value
    },
    libScalax.`cats-effect` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""org.typelevel""", """cats-effect""", """3.4.8""").value
    },
    libScalax.`cats` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""org.typelevel""", """cats-core""", """2.9.0""").value
    },
    libScalax.`h2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala3)("""com.h2database""", """h2""", """2.1.214""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala3)("""org.tpolecat""", """doobie-core""", """1.0.0-RC2""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala3)("""org.tpolecat""", """doobie-hikari""", """1.0.0-RC2""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala3)("""org.tpolecat""", """doobie-postgres""", """1.0.0-RC2""").value
    },
    libScalax.`doobie` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala3)("""org.tpolecat""", """doobie-scalatest""", """1.0.0-RC2""").value
    },
    libScalax.`doobie-h2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala3)("""org.tpolecat""", """doobie-h2""", """1.0.0-RC2""").value
    },
    libScalax.`zio2` ++= { djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""dev.zio""", """zio""", """2.0.10""").value },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""dev.zio""", """zio-streams""", """2.0.10""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""dev.zio""", """zio-test""", """2.0.10""").value
    },
    libScalax.`zio2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""dev.zio""", """zio-test-sbt""", """2.0.10""").value
    },
    libScalax.`typesafe-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala3)("""com.typesafe""", """config""", """1.4.2""").value
    },
    libScalax.`scala-collection-compat` ++= {
      djx.sbt.depts.plugins.pUtils.setting
        .scalaJsLibrary(djxIsScala3)("""org.scala-lang.modules""", """scala-collection-compat""", """2.9.0""")
        .value
    },
    libScalax.`http4s-Release` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""org.http4s""", """http4s-dsl""", """0.23.18""").value
    },
    libScalax.`http4s-Release` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""org.http4s""", """http4s-circe""", """0.23.18""").value
    },
    libScalax.`http4s-Release-ember-server` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""org.http4s""", """http4s-ember-server""", """0.23.18""").value
    },
    libScalax.`http4s-Release-ember-client` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""org.http4s""", """http4s-ember-client""", """0.23.18""").value
    },
    libScalax.`http4s-twirl` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala3)("""org.http4s""", """http4s-twirl""", """0.24.0-M1""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""dev.zio""", """zio-config""", """4.0.0-RC14""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""dev.zio""", """zio-config-magnolia""", """4.0.0-RC14""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""dev.zio""", """zio-config-refined""", """4.0.0-RC14""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""dev.zio""", """zio-config-typesafe""", """4.0.0-RC14""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""dev.zio""", """zio-config-yaml""", """4.0.0-RC14""").value
    },
    libScalax.`zio-config` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""dev.zio""", """zio-config-derivation""", """4.0.0-RC14""").value
    },
    libScalax.`slf4j-simple` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala3)("""org.slf4j""", """slf4j-simple""", """2.0.7""").value
    },
    libScalax.`commons-io` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala3)("""org.apache.commons""", """commons-io""", """1.3.2""").value
    },
    libScalax.`macwire` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""com.softwaremill.macwire""", """macros""", """2.5.8""").value
    },
    libScalax.`commons-lang3` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala3)("""org.apache.commons""", """commons-lang3""", """3.12.0""").value
    },
    libScalax.`commons-lang3-bridge` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala3)("""net.scalax""", """commons-lang3-bridge""", """0.1.0""").value
    },
    libScalax.`simple-adt` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""net.scalax.simple""", """simple-adt""", """0.0.1-M7""").value
    },
    libScalax.`sbt-librarymanagement-core` ++= {
      djx.sbt.depts.plugins.pUtils.setting
        .scalaLibrary(djxIsScala3)("""org.scala-sbt""", """librarymanagement-core""", """2.0.0-alpha12""")
        .value
    },
    libScalax.`javacv-platform` ++= {
      djx.sbt.depts.plugins.pUtils.setting.javaLibrary(djxIsScala3)("""org.bytedeco""", """javacv-platform""", """1.5.8""").value
    },
    libScalax.`cats-effect-cps` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""org.typelevel""", """cats-effect-cps""", """0.4.0""").value
    },
    libScalax.`zio-json` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""dev.zio""", """zio-json""", """0.5.0""").value
    },
    libScalax.`shapeless` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""org.typelevel""", """shapeless3-deriving""", """3.3.0""").value
    },
    libScalax.`shapeless` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""org.typelevel""", """shapeless3-typeable""", """3.3.0""").value
    },
    libScalax.`shapeless3-test` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""org.typelevel""", """shapeless3-test""", """3.3.0""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""co.fs2""", """fs2-core""", """3.6.1""").value
    },
    libScalax.`fs2` ++= { djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""co.fs2""", """fs2-io""", """3.6.1""").value },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaLibrary(djxIsScala3)("""co.fs2""", """fs2-reactive-streams""", """3.6.1""").value
    },
    libScalax.`fs2` ++= {
      djx.sbt.depts.plugins.pUtils.setting.scalaJsLibrary(djxIsScala3)("""co.fs2""", """fs2-scodec""", """3.6.1""").value
    }
  )

}
