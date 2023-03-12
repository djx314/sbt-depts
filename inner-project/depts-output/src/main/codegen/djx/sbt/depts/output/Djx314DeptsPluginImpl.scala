package djx.sbt.depts.output

import _root_.sbt._
import _root_.sbt.Keys._
import _root_.scala.collection.compat._
import _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

trait BuildKeys extends impl.BuildKeysAbs {

  val scalaV: ScalaV = ScalaV(`v211` = """2.11.12""", `v212` = """2.12.17""", `v213` = """2.13.10""", `v3` = """3.2.2""")

  object libScalax {
    val `typesafe-config`            = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for typesafe-config""")
    val `scalatest`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scalatest""")
    val `kind-projector`             = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for kind-projector""")
    val `simple-adt`                 = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for simple-adt""")
    val `cats-effect`                = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for cats-effect""")
    val `scala-collection-compat`    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scala-collection-compat""")
    val `commons-lang3-bridge`       = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-lang3-bridge""")
    val `http4s-twirl`               = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-twirl""")
    val `commons-lang3`              = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-lang3""")
    val `doobie`                     = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for doobie""")
    val `zio-config`                 = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-config""")
    val `slf4j-simple`               = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for slf4j-simple""")
    val `zio-json`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-json""")
    val `h2`                         = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for h2""")
    val `zio2`                       = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio2""")
    val `http4s-Release`             = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-Release""")
    val `sbt-librarymanagement-core` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for sbt-librarymanagement-core""")
    val `shapeless3-test`            = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for shapeless3-test""")
    val `html.scala`                 = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for html.scala""")
    val `circe`                      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for circe""")
    val `cats-effect-cps`            = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for cats-effect-cps""")
    val `doobie-h2`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for doobie-h2""")
    val `javacv-platform`            = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for javacv-platform""")
    val `binding.scala`              = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for binding.scala""")
    val `commons-io`                 = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-io""")
    val `shapeless`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for shapeless""")
    val `macwire`                    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for macwire""")
    val `cats`                       = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for cats""")
  }
}

trait Djx314DeptsImpl {

  val buildKeys: BuildKeys
  import buildKeys._

  def settingsForDept: Seq[Setting[_]] = Seq(
    libScalax.`typesafe-config`            := libScalax.`typesafe-config`.?.value.to(List).flatten,
    libScalax.`scalatest`                  := libScalax.`scalatest`.?.value.to(List).flatten,
    libScalax.`kind-projector`             := libScalax.`kind-projector`.?.value.to(List).flatten,
    libScalax.`simple-adt`                 := libScalax.`simple-adt`.?.value.to(List).flatten,
    libScalax.`cats-effect`                := libScalax.`cats-effect`.?.value.to(List).flatten,
    libScalax.`scala-collection-compat`    := libScalax.`scala-collection-compat`.?.value.to(List).flatten,
    libScalax.`commons-lang3-bridge`       := libScalax.`commons-lang3-bridge`.?.value.to(List).flatten,
    libScalax.`http4s-twirl`               := libScalax.`http4s-twirl`.?.value.to(List).flatten,
    libScalax.`commons-lang3`              := libScalax.`commons-lang3`.?.value.to(List).flatten,
    libScalax.`doobie`                     := libScalax.`doobie`.?.value.to(List).flatten,
    libScalax.`zio-config`                 := libScalax.`zio-config`.?.value.to(List).flatten,
    libScalax.`slf4j-simple`               := libScalax.`slf4j-simple`.?.value.to(List).flatten,
    libScalax.`zio-json`                   := libScalax.`zio-json`.?.value.to(List).flatten,
    libScalax.`h2`                         := libScalax.`h2`.?.value.to(List).flatten,
    libScalax.`zio2`                       := libScalax.`zio2`.?.value.to(List).flatten,
    libScalax.`http4s-Release`             := libScalax.`http4s-Release`.?.value.to(List).flatten,
    libScalax.`sbt-librarymanagement-core` := libScalax.`sbt-librarymanagement-core`.?.value.to(List).flatten,
    libScalax.`shapeless3-test`            := libScalax.`shapeless3-test`.?.value.to(List).flatten,
    libScalax.`html.scala`                 := libScalax.`html.scala`.?.value.to(List).flatten,
    libScalax.`circe`                      := libScalax.`circe`.?.value.to(List).flatten,
    libScalax.`cats-effect-cps`            := libScalax.`cats-effect-cps`.?.value.to(List).flatten,
    libScalax.`doobie-h2`                  := libScalax.`doobie-h2`.?.value.to(List).flatten,
    libScalax.`javacv-platform`            := libScalax.`javacv-platform`.?.value.to(List).flatten,
    libScalax.`binding.scala`              := libScalax.`binding.scala`.?.value.to(List).flatten,
    libScalax.`commons-io`                 := libScalax.`commons-io`.?.value.to(List).flatten,
    libScalax.`shapeless`                  := libScalax.`shapeless`.?.value.to(List).flatten,
    libScalax.`macwire`                    := libScalax.`macwire`.?.value.to(List).flatten,
    libScalax.`cats`                       := libScalax.`cats`.?.value.to(List).flatten,
    libScalax.`kind-projector` ++= {
      if (djxIsScala211.value) Seq("""org.typelevel""" % """kind-projector""" % """0.13.2""" cross CrossVersion.full) else Seq.empty
    },
    libScalax.`circe` ++= { if (djxIsScala211.value) Seq("""io.circe""" %%% """circe-core""" % """0.11.2""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala211.value) Seq("""io.circe""" %%% """circe-generic""" % """0.11.2""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala211.value) Seq("""io.circe""" %%% """circe-parser""" % """0.11.2""") else Seq.empty },
    libScalax.`scalatest` ++= { if (djxIsScala211.value) Seq("""org.scalactic""" %% """scalactic""" % """3.2.15""") else Seq.empty },
    libScalax.`scalatest` ++= { if (djxIsScala211.value) Seq("""org.scalatest""" %% """scalatest""" % """3.2.15""") else Seq.empty },
    libScalax.`scalatest` ++= { if (djxIsScala211.value) Seq("""org.scalatest""" %% """scalatest-core""" % """3.2.15""") else Seq.empty },
    libScalax.`cats-effect` ++= { if (djxIsScala211.value) Seq("""org.typelevel""" %%% """cats-effect""" % """3.4.2""") else Seq.empty },
    libScalax.`cats` ++= { if (djxIsScala211.value) Seq("""org.typelevel""" %%% """cats-core""" % """2.9.0""") else Seq.empty },
    libScalax.`h2` ++= { if (djxIsScala211.value) Seq("""com.h2database""" % """h2""" % """2.1.214""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala211.value) Seq("""org.tpolecat""" %% """doobie-core""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala211.value) Seq("""org.tpolecat""" %% """doobie-hikari""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala211.value) Seq("""org.tpolecat""" %% """doobie-postgres""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala211.value) Seq("""org.tpolecat""" %% """doobie-scalatest""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie-h2` ++= { if (djxIsScala211.value) Seq("""org.tpolecat""" %% """doobie-h2""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio""" % """2.0.10""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-streams""" % """2.0.10""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-test""" % """2.0.10""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-test-sbt""" % """2.0.10""") else Seq.empty },
    libScalax.`typesafe-config` ++= { if (djxIsScala211.value) Seq("""com.typesafe""" % """config""" % """1.4.2""") else Seq.empty },
    libScalax.`scala-collection-compat` ++= {
      if (djxIsScala211.value) Seq("""org.scala-lang.modules""" %%% """scala-collection-compat""" % """2.9.0""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala211.value) Seq("""org.http4s""" %%% """http4s-dsl""" % """0.23.17""") else Seq.empty },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala211.value) Seq("""org.http4s""" %%% """http4s-ember-server""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala211.value) Seq("""org.http4s""" %%% """http4s-ember-client""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala211.value) Seq("""org.http4s""" %%% """http4s-circe""" % """0.23.17""") else Seq.empty },
    libScalax.`http4s-twirl` ++= { if (djxIsScala211.value) Seq("""org.http4s""" %% """http4s-twirl""" % """0.23.17""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-config""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-config-magnolia""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-config-refined""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-config-typesafe""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-config-yaml""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-config-gen""" % """3.0.7""") else Seq.empty },
    libScalax.`slf4j-simple` ++= { if (djxIsScala211.value) Seq("""org.slf4j""" % """slf4j-simple""" % """2.0.6""") else Seq.empty },
    libScalax.`binding.scala` ++= {
      if (djxIsScala211.value) Seq("""com.thoughtworks.binding""" %%% """binding""" % """11.9.0""") else Seq.empty
    },
    libScalax.`commons-io` ++= { if (djxIsScala211.value) Seq("""org.apache.commons""" % """commons-io""" % """1.3.2""") else Seq.empty },
    libScalax.`macwire` ++= { if (djxIsScala211.value) Seq("""com.softwaremill.macwire""" %%% """macros""" % """2.5.8""") else Seq.empty },
    libScalax.`commons-lang3` ++= {
      if (djxIsScala211.value) Seq("""org.apache.commons""" % """commons-lang3""" % """3.12.0""") else Seq.empty
    },
    libScalax.`commons-lang3-bridge` ++= {
      if (djxIsScala211.value) Seq("""net.scalax""" %% """commons-lang3-bridge""" % """0.1.0""") else Seq.empty
    },
    libScalax.`simple-adt` ++= {
      if (djxIsScala211.value) Seq("""net.scalax.simple""" %%% """simple-adt""" % """0.0.1-M7""") else Seq.empty
    },
    libScalax.`sbt-librarymanagement-core` ++= {
      if (djxIsScala211.value) Seq("""org.scala-sbt""" %% """librarymanagement-core""" % """1.8.0""") else Seq.empty
    },
    libScalax.`javacv-platform` ++= {
      if (djxIsScala211.value) Seq("""org.bytedeco""" % """javacv-platform""" % """1.5.8""") else Seq.empty
    },
    libScalax.`shapeless` ++= { if (djxIsScala211.value) Seq("""com.chuusai""" %%% """shapeless""" % """2.3.10""") else Seq.empty },
    libScalax.`kind-projector` ++= {
      if (djxIsScala212.value) Seq("""org.typelevel""" % """kind-projector""" % """0.13.2""" cross CrossVersion.full) else Seq.empty
    },
    libScalax.`circe` ++= { if (djxIsScala212.value) Seq("""io.circe""" %%% """circe-core""" % """0.14.5""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala212.value) Seq("""io.circe""" %%% """circe-generic""" % """0.14.5""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala212.value) Seq("""io.circe""" %%% """circe-parser""" % """0.14.5""") else Seq.empty },
    libScalax.`scalatest` ++= { if (djxIsScala212.value) Seq("""org.scalactic""" %% """scalactic""" % """3.2.15""") else Seq.empty },
    libScalax.`scalatest` ++= { if (djxIsScala212.value) Seq("""org.scalatest""" %% """scalatest""" % """3.2.15""") else Seq.empty },
    libScalax.`scalatest` ++= { if (djxIsScala212.value) Seq("""org.scalatest""" %% """scalatest-core""" % """3.2.15""") else Seq.empty },
    libScalax.`cats-effect` ++= { if (djxIsScala212.value) Seq("""org.typelevel""" %%% """cats-effect""" % """3.4.2""") else Seq.empty },
    libScalax.`cats` ++= { if (djxIsScala212.value) Seq("""org.typelevel""" %%% """cats-core""" % """2.9.0""") else Seq.empty },
    libScalax.`h2` ++= { if (djxIsScala212.value) Seq("""com.h2database""" % """h2""" % """2.1.214""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala212.value) Seq("""org.tpolecat""" %% """doobie-core""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala212.value) Seq("""org.tpolecat""" %% """doobie-hikari""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala212.value) Seq("""org.tpolecat""" %% """doobie-postgres""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala212.value) Seq("""org.tpolecat""" %% """doobie-scalatest""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie-h2` ++= { if (djxIsScala212.value) Seq("""org.tpolecat""" %% """doobie-h2""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio""" % """2.0.10""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-streams""" % """2.0.10""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-test""" % """2.0.10""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-test-sbt""" % """2.0.10""") else Seq.empty },
    libScalax.`typesafe-config` ++= { if (djxIsScala212.value) Seq("""com.typesafe""" % """config""" % """1.4.2""") else Seq.empty },
    libScalax.`scala-collection-compat` ++= {
      if (djxIsScala212.value) Seq("""org.scala-lang.modules""" %%% """scala-collection-compat""" % """2.9.0""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala212.value) Seq("""org.http4s""" %%% """http4s-dsl""" % """0.23.17""") else Seq.empty },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala212.value) Seq("""org.http4s""" %%% """http4s-ember-server""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala212.value) Seq("""org.http4s""" %%% """http4s-ember-client""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala212.value) Seq("""org.http4s""" %%% """http4s-circe""" % """0.23.17""") else Seq.empty },
    libScalax.`http4s-twirl` ++= { if (djxIsScala212.value) Seq("""org.http4s""" %% """http4s-twirl""" % """0.23.17""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-config""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-config-magnolia""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-config-refined""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-config-typesafe""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-config-yaml""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-config-gen""" % """3.0.7""") else Seq.empty },
    libScalax.`slf4j-simple` ++= { if (djxIsScala212.value) Seq("""org.slf4j""" % """slf4j-simple""" % """2.0.6""") else Seq.empty },
    libScalax.`binding.scala` ++= {
      if (djxIsScala212.value) Seq("""com.thoughtworks.binding""" %%% """binding""" % """12.2.0""") else Seq.empty
    },
    libScalax.`html.scala` ++= { if (djxIsScala212.value) Seq("""com.yang-bo""" %%% """html""" % """3.0.2""") else Seq.empty },
    libScalax.`commons-io` ++= { if (djxIsScala212.value) Seq("""org.apache.commons""" % """commons-io""" % """1.3.2""") else Seq.empty },
    libScalax.`macwire` ++= { if (djxIsScala212.value) Seq("""com.softwaremill.macwire""" %%% """macros""" % """2.5.8""") else Seq.empty },
    libScalax.`commons-lang3` ++= {
      if (djxIsScala212.value) Seq("""org.apache.commons""" % """commons-lang3""" % """3.12.0""") else Seq.empty
    },
    libScalax.`commons-lang3-bridge` ++= {
      if (djxIsScala212.value) Seq("""net.scalax""" %% """commons-lang3-bridge""" % """0.1.0""") else Seq.empty
    },
    libScalax.`simple-adt` ++= {
      if (djxIsScala212.value) Seq("""net.scalax.simple""" %%% """simple-adt""" % """0.0.1-M7""") else Seq.empty
    },
    libScalax.`sbt-librarymanagement-core` ++= {
      if (djxIsScala212.value) Seq("""org.scala-sbt""" %% """librarymanagement-core""" % """1.8.0""") else Seq.empty
    },
    libScalax.`javacv-platform` ++= {
      if (djxIsScala212.value) Seq("""org.bytedeco""" % """javacv-platform""" % """1.5.8""") else Seq.empty
    },
    libScalax.`cats-effect-cps` ++= {
      if (djxIsScala212.value) Seq("""org.typelevel""" %%% """cats-effect-cps""" % """0.4.0""") else Seq.empty
    },
    libScalax.`zio-json` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-json""" % """0.4.2""") else Seq.empty },
    libScalax.`shapeless` ++= { if (djxIsScala212.value) Seq("""com.chuusai""" %%% """shapeless""" % """2.3.10""") else Seq.empty },
    libScalax.`kind-projector` ++= {
      if (djxIsScala213.value) Seq("""org.typelevel""" % """kind-projector""" % """0.13.2""" cross CrossVersion.full) else Seq.empty
    },
    libScalax.`circe` ++= { if (djxIsScala213.value) Seq("""io.circe""" %%% """circe-core""" % """0.14.5""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala213.value) Seq("""io.circe""" %%% """circe-generic""" % """0.14.5""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala213.value) Seq("""io.circe""" %%% """circe-parser""" % """0.14.5""") else Seq.empty },
    libScalax.`scalatest` ++= { if (djxIsScala213.value) Seq("""org.scalactic""" %% """scalactic""" % """3.2.15""") else Seq.empty },
    libScalax.`scalatest` ++= { if (djxIsScala213.value) Seq("""org.scalatest""" %% """scalatest""" % """3.2.15""") else Seq.empty },
    libScalax.`scalatest` ++= { if (djxIsScala213.value) Seq("""org.scalatest""" %% """scalatest-core""" % """3.2.15""") else Seq.empty },
    libScalax.`cats-effect` ++= { if (djxIsScala213.value) Seq("""org.typelevel""" %%% """cats-effect""" % """3.4.2""") else Seq.empty },
    libScalax.`cats` ++= { if (djxIsScala213.value) Seq("""org.typelevel""" %%% """cats-core""" % """2.9.0""") else Seq.empty },
    libScalax.`h2` ++= { if (djxIsScala213.value) Seq("""com.h2database""" % """h2""" % """2.1.214""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala213.value) Seq("""org.tpolecat""" %% """doobie-core""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala213.value) Seq("""org.tpolecat""" %% """doobie-hikari""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala213.value) Seq("""org.tpolecat""" %% """doobie-postgres""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala213.value) Seq("""org.tpolecat""" %% """doobie-scalatest""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie-h2` ++= { if (djxIsScala213.value) Seq("""org.tpolecat""" %% """doobie-h2""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio""" % """2.0.10""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-streams""" % """2.0.10""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-test""" % """2.0.10""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-test-sbt""" % """2.0.10""") else Seq.empty },
    libScalax.`typesafe-config` ++= { if (djxIsScala213.value) Seq("""com.typesafe""" % """config""" % """1.4.2""") else Seq.empty },
    libScalax.`scala-collection-compat` ++= {
      if (djxIsScala213.value) Seq("""org.scala-lang.modules""" %%% """scala-collection-compat""" % """2.9.0""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala213.value) Seq("""org.http4s""" %%% """http4s-dsl""" % """0.23.17""") else Seq.empty },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala213.value) Seq("""org.http4s""" %%% """http4s-ember-server""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala213.value) Seq("""org.http4s""" %%% """http4s-ember-client""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala213.value) Seq("""org.http4s""" %%% """http4s-circe""" % """0.23.17""") else Seq.empty },
    libScalax.`http4s-twirl` ++= { if (djxIsScala213.value) Seq("""org.http4s""" %% """http4s-twirl""" % """0.23.17""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-config""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-config-magnolia""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-config-refined""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-config-typesafe""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-config-yaml""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-config-gen""" % """3.0.7""") else Seq.empty },
    libScalax.`slf4j-simple` ++= { if (djxIsScala213.value) Seq("""org.slf4j""" % """slf4j-simple""" % """2.0.6""") else Seq.empty },
    libScalax.`binding.scala` ++= {
      if (djxIsScala213.value) Seq("""com.thoughtworks.binding""" %%% """binding""" % """12.2.0""") else Seq.empty
    },
    libScalax.`html.scala` ++= { if (djxIsScala213.value) Seq("""com.yang-bo""" %%% """html""" % """3.0.2""") else Seq.empty },
    libScalax.`commons-io` ++= { if (djxIsScala213.value) Seq("""org.apache.commons""" % """commons-io""" % """1.3.2""") else Seq.empty },
    libScalax.`macwire` ++= { if (djxIsScala213.value) Seq("""com.softwaremill.macwire""" %%% """macros""" % """2.5.8""") else Seq.empty },
    libScalax.`commons-lang3` ++= {
      if (djxIsScala213.value) Seq("""org.apache.commons""" % """commons-lang3""" % """3.12.0""") else Seq.empty
    },
    libScalax.`commons-lang3-bridge` ++= {
      if (djxIsScala213.value) Seq("""net.scalax""" %% """commons-lang3-bridge""" % """0.1.0""") else Seq.empty
    },
    libScalax.`simple-adt` ++= {
      if (djxIsScala213.value) Seq("""net.scalax.simple""" %%% """simple-adt""" % """0.0.1-M7""") else Seq.empty
    },
    libScalax.`sbt-librarymanagement-core` ++= {
      if (djxIsScala213.value) Seq("""org.scala-sbt""" %% """librarymanagement-core""" % """1.8.0""") else Seq.empty
    },
    libScalax.`javacv-platform` ++= {
      if (djxIsScala213.value) Seq("""org.bytedeco""" % """javacv-platform""" % """1.5.8""") else Seq.empty
    },
    libScalax.`cats-effect-cps` ++= {
      if (djxIsScala213.value) Seq("""org.typelevel""" %%% """cats-effect-cps""" % """0.4.0""") else Seq.empty
    },
    libScalax.`zio-json` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-json""" % """0.4.2""") else Seq.empty },
    libScalax.`shapeless` ++= { if (djxIsScala213.value) Seq("""com.chuusai""" %%% """shapeless""" % """2.3.10""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala3.value) Seq("""io.circe""" %%% """circe-core""" % """0.14.5""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala3.value) Seq("""io.circe""" %%% """circe-generic""" % """0.14.5""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala3.value) Seq("""io.circe""" %%% """circe-parser""" % """0.14.5""") else Seq.empty },
    libScalax.`scalatest` ++= { if (djxIsScala3.value) Seq("""org.scalactic""" %% """scalactic""" % """3.2.15""") else Seq.empty },
    libScalax.`scalatest` ++= { if (djxIsScala3.value) Seq("""org.scalatest""" %% """scalatest""" % """3.2.15""") else Seq.empty },
    libScalax.`scalatest` ++= { if (djxIsScala3.value) Seq("""org.scalatest""" %% """scalatest-core""" % """3.2.15""") else Seq.empty },
    libScalax.`cats-effect` ++= { if (djxIsScala3.value) Seq("""org.typelevel""" %%% """cats-effect""" % """3.4.2""") else Seq.empty },
    libScalax.`cats` ++= { if (djxIsScala3.value) Seq("""org.typelevel""" %%% """cats-core""" % """2.9.0""") else Seq.empty },
    libScalax.`h2` ++= { if (djxIsScala3.value) Seq("""com.h2database""" % """h2""" % """2.1.214""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala3.value) Seq("""org.tpolecat""" %% """doobie-core""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala3.value) Seq("""org.tpolecat""" %% """doobie-hikari""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala3.value) Seq("""org.tpolecat""" %% """doobie-postgres""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie` ++= { if (djxIsScala3.value) Seq("""org.tpolecat""" %% """doobie-scalatest""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`doobie-h2` ++= { if (djxIsScala3.value) Seq("""org.tpolecat""" %% """doobie-h2""" % """1.0.0-RC2""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio""" % """2.0.10""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-streams""" % """2.0.10""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-test""" % """2.0.10""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-test-sbt""" % """2.0.10""") else Seq.empty },
    libScalax.`typesafe-config` ++= { if (djxIsScala3.value) Seq("""com.typesafe""" % """config""" % """1.4.2""") else Seq.empty },
    libScalax.`scala-collection-compat` ++= {
      if (djxIsScala3.value) Seq("""org.scala-lang.modules""" %%% """scala-collection-compat""" % """2.9.0""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala3.value) Seq("""org.http4s""" %%% """http4s-dsl""" % """0.23.17""") else Seq.empty },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala3.value) Seq("""org.http4s""" %%% """http4s-ember-server""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala3.value) Seq("""org.http4s""" %%% """http4s-ember-client""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala3.value) Seq("""org.http4s""" %%% """http4s-circe""" % """0.23.17""") else Seq.empty },
    libScalax.`http4s-twirl` ++= { if (djxIsScala3.value) Seq("""org.http4s""" %% """http4s-twirl""" % """0.23.17""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-config""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-config-magnolia""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-config-refined""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-config-typesafe""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-config-yaml""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-config-gen""" % """3.0.7""") else Seq.empty },
    libScalax.`slf4j-simple` ++= { if (djxIsScala3.value) Seq("""org.slf4j""" % """slf4j-simple""" % """2.0.6""") else Seq.empty },
    libScalax.`binding.scala` ++= {
      if (djxIsScala3.value) Seq("""com.thoughtworks.binding""" %%% """binding""" % """12.2.0""") else Seq.empty
    },
    libScalax.`html.scala` ++= { if (djxIsScala3.value) Seq("""com.yang-bo""" %%% """html""" % """3.0.2""") else Seq.empty },
    libScalax.`commons-io` ++= { if (djxIsScala3.value) Seq("""org.apache.commons""" % """commons-io""" % """1.3.2""") else Seq.empty },
    libScalax.`macwire` ++= { if (djxIsScala3.value) Seq("""com.softwaremill.macwire""" %%% """macros""" % """2.5.8""") else Seq.empty },
    libScalax.`commons-lang3` ++= {
      if (djxIsScala3.value) Seq("""org.apache.commons""" % """commons-lang3""" % """3.12.0""") else Seq.empty
    },
    libScalax.`commons-lang3-bridge` ++= {
      if (djxIsScala3.value) Seq("""net.scalax""" %% """commons-lang3-bridge""" % """0.1.0""") else Seq.empty
    },
    libScalax.`simple-adt` ++= { if (djxIsScala3.value) Seq("""net.scalax.simple""" %%% """simple-adt""" % """0.0.1-M7""") else Seq.empty },
    libScalax.`sbt-librarymanagement-core` ++= {
      if (djxIsScala3.value) Seq("""org.scala-sbt""" %% """librarymanagement-core""" % """1.8.0""") else Seq.empty
    },
    libScalax.`javacv-platform` ++= { if (djxIsScala3.value) Seq("""org.bytedeco""" % """javacv-platform""" % """1.5.8""") else Seq.empty },
    libScalax.`cats-effect-cps` ++= {
      if (djxIsScala3.value) Seq("""org.typelevel""" %%% """cats-effect-cps""" % """0.4.0""") else Seq.empty
    },
    libScalax.`zio-json` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-json""" % """0.4.2""") else Seq.empty },
    libScalax.`shapeless` ++= {
      if (djxIsScala3.value) Seq("""org.typelevel""" %%% """shapeless3-deriving""" % """3.3.0""") else Seq.empty
    },
    libScalax.`shapeless` ++= {
      if (djxIsScala3.value) Seq("""org.typelevel""" %%% """shapeless3-typeable""" % """3.3.0""") else Seq.empty
    },
    libScalax.`shapeless3-test` ++= {
      if (djxIsScala3.value) Seq("""org.typelevel""" %%% """shapeless3-test""" % """3.3.0""") else Seq.empty
    }
  )

}
