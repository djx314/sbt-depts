package djx.sbt.depts.output

import _root_.sbt._
import _root_.sbt.Keys._
import _root_.scala.collection.compat._
import _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

trait BuildKeys extends impl.BuildKeysAbs {

  val scalaV: ScalaV = ScalaV(`v211` = """2.11.12""", `v212` = """2.12.17""", `v213` = """2.13.10""", `v3` = """3.2.2""")

  object libScalax {
    val `typesafe-config`         = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for typesafe-config""")
    val `kind-projector`          = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for kind-projector""")
    val `scala-collection-compat` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scala-collection-compat""")
    val `zio-config`              = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-config""")
    val `slf4j-simple`            = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for slf4j-simple""")
    val `zio2`                    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio2""")
    val `http4s-Release`          = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-Release""")
    val `circe`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for circe""")
    val `binding.scala`           = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for binding.scala""")
    val `commons-io`              = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-io""")
    val `macwire`                 = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for macwire""")
    val `sbt-librarymanagement`   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for sbt-librarymanagement""")
  }
}

trait Djx314DeptsImpl {

  val buildKeys: BuildKeys
  import buildKeys._

  def settingsForDept: Seq[Setting[_]] = Seq(
    libScalax.`typesafe-config`         := libScalax.`typesafe-config`.?.value.to(List).flatten,
    libScalax.`kind-projector`          := libScalax.`kind-projector`.?.value.to(List).flatten,
    libScalax.`scala-collection-compat` := libScalax.`scala-collection-compat`.?.value.to(List).flatten,
    libScalax.`zio-config`              := libScalax.`zio-config`.?.value.to(List).flatten,
    libScalax.`slf4j-simple`            := libScalax.`slf4j-simple`.?.value.to(List).flatten,
    libScalax.`zio2`                    := libScalax.`zio2`.?.value.to(List).flatten,
    libScalax.`http4s-Release`          := libScalax.`http4s-Release`.?.value.to(List).flatten,
    libScalax.`circe`                   := libScalax.`circe`.?.value.to(List).flatten,
    libScalax.`binding.scala`           := libScalax.`binding.scala`.?.value.to(List).flatten,
    libScalax.`commons-io`              := libScalax.`commons-io`.?.value.to(List).flatten,
    libScalax.`macwire`                 := libScalax.`macwire`.?.value.to(List).flatten,
    libScalax.`sbt-librarymanagement`   := libScalax.`sbt-librarymanagement`.?.value.to(List).flatten,
    libScalax.`kind-projector` ++= {
      if (djxIsScala211.value) Seq("""org.typelevel""" % """kind-projector""" % """0.13.2""" cross CrossVersion.full) else Seq.empty
    },
    libScalax.`circe` ++= { if (djxIsScala211.value) Seq("""io.circe""" %%% """circe-core""" % """0.11.2""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala211.value) Seq("""io.circe""" %%% """circe-generic""" % """0.11.2""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala211.value) Seq("""io.circe""" %%% """circe-parser""" % """0.11.2""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio""" % """2.0.5""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-streams""" % """2.0.5""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-test""" % """2.0.5""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-test-sbt""" % """2.0.5""") else Seq.empty },
    libScalax.`typesafe-config` ++= { if (djxIsScala211.value) Seq("""com.typesafe""" % """config""" % """1.4.1""") else Seq.empty },
    libScalax.`scala-collection-compat` ++= {
      if (djxIsScala211.value) Seq("""org.scala-lang.modules""" %%% """scala-collection-compat""" % """2.8.1""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala211.value) Seq("""org.http4s""" %%% """http4s-dsl""" % """0.23.17""") else Seq.empty },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala211.value) Seq("""org.http4s""" %%% """http4s-ember-server""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala211.value) Seq("""org.http4s""" %%% """http4s-ember-client""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala211.value) Seq("""org.http4s""" %%% """http4s-circe""" % """0.23.17""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-config""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-config-magnolia""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-config-refined""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-config-typesafe""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-config-yaml""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala211.value) Seq("""dev.zio""" %%% """zio-config-gen""" % """3.0.7""") else Seq.empty },
    libScalax.`slf4j-simple` ++= { if (djxIsScala211.value) Seq("""org.slf4j""" % """slf4j-simple""" % """2.0.6""") else Seq.empty },
    libScalax.`binding.scala` ++= {
      if (djxIsScala211.value) Seq("""com.yang-bo""" %%% """html""" % """2.0.0+28-a2b9d520""") else Seq.empty
    },
    libScalax.`binding.scala` ++= {
      if (djxIsScala211.value) Seq("""com.thoughtworks.binding""" %%% """binding""" % """12.1.0+110-53fd3428""") else Seq.empty
    },
    libScalax.`commons-io` ++= { if (djxIsScala211.value) Seq("""org.apache.commons""" % """commons-io""" % """1.3.2""") else Seq.empty },
    libScalax.`macwire` ++= { if (djxIsScala211.value) Seq("""com.softwaremill.macwire""" %%% """macros""" % """2.5.8""") else Seq.empty },
    libScalax.`kind-projector` ++= {
      if (djxIsScala212.value) Seq("""org.typelevel""" % """kind-projector""" % """0.13.2""" cross CrossVersion.full) else Seq.empty
    },
    libScalax.`circe` ++= { if (djxIsScala212.value) Seq("""io.circe""" %%% """circe-core""" % """0.14.3""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala212.value) Seq("""io.circe""" %%% """circe-generic""" % """0.14.3""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala212.value) Seq("""io.circe""" %%% """circe-parser""" % """0.14.3""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio""" % """2.0.5""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-streams""" % """2.0.5""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-test""" % """2.0.5""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-test-sbt""" % """2.0.5""") else Seq.empty },
    libScalax.`typesafe-config` ++= { if (djxIsScala212.value) Seq("""com.typesafe""" % """config""" % """1.4.1""") else Seq.empty },
    libScalax.`scala-collection-compat` ++= {
      if (djxIsScala212.value) Seq("""org.scala-lang.modules""" %%% """scala-collection-compat""" % """2.8.1""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala212.value) Seq("""org.http4s""" %%% """http4s-dsl""" % """0.23.17""") else Seq.empty },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala212.value) Seq("""org.http4s""" %%% """http4s-ember-server""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala212.value) Seq("""org.http4s""" %%% """http4s-ember-client""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala212.value) Seq("""org.http4s""" %%% """http4s-circe""" % """0.23.17""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-config""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-config-magnolia""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-config-refined""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-config-typesafe""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-config-yaml""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala212.value) Seq("""dev.zio""" %%% """zio-config-gen""" % """3.0.7""") else Seq.empty },
    libScalax.`slf4j-simple` ++= { if (djxIsScala212.value) Seq("""org.slf4j""" % """slf4j-simple""" % """2.0.6""") else Seq.empty },
    libScalax.`binding.scala` ++= {
      if (djxIsScala212.value) Seq("""com.yang-bo""" %%% """html""" % """2.0.0+28-a2b9d520""") else Seq.empty
    },
    libScalax.`binding.scala` ++= {
      if (djxIsScala212.value) Seq("""com.thoughtworks.binding""" %%% """binding""" % """12.1.0+110-53fd3428""") else Seq.empty
    },
    libScalax.`commons-io` ++= { if (djxIsScala212.value) Seq("""org.apache.commons""" % """commons-io""" % """1.3.2""") else Seq.empty },
    libScalax.`macwire` ++= { if (djxIsScala212.value) Seq("""com.softwaremill.macwire""" %%% """macros""" % """2.5.8""") else Seq.empty },
    libScalax.`sbt-librarymanagement` ++= {
      if (djxIsScala212.value) Seq("""org.scala-sbt""" %% """librarymanagement-core""" % """1.8.0""") else Seq.empty
    },
    libScalax.`kind-projector` ++= {
      if (djxIsScala213.value) Seq("""org.typelevel""" % """kind-projector""" % """0.13.2""" cross CrossVersion.full) else Seq.empty
    },
    libScalax.`circe` ++= { if (djxIsScala213.value) Seq("""io.circe""" %%% """circe-core""" % """0.14.3""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala213.value) Seq("""io.circe""" %%% """circe-generic""" % """0.14.3""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala213.value) Seq("""io.circe""" %%% """circe-parser""" % """0.14.3""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio""" % """2.0.5""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-streams""" % """2.0.5""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-test""" % """2.0.5""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-test-sbt""" % """2.0.5""") else Seq.empty },
    libScalax.`typesafe-config` ++= { if (djxIsScala213.value) Seq("""com.typesafe""" % """config""" % """1.4.1""") else Seq.empty },
    libScalax.`scala-collection-compat` ++= {
      if (djxIsScala213.value) Seq("""org.scala-lang.modules""" %%% """scala-collection-compat""" % """2.8.1""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala213.value) Seq("""org.http4s""" %%% """http4s-dsl""" % """0.23.17""") else Seq.empty },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala213.value) Seq("""org.http4s""" %%% """http4s-ember-server""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala213.value) Seq("""org.http4s""" %%% """http4s-ember-client""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala213.value) Seq("""org.http4s""" %%% """http4s-circe""" % """0.23.17""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-config""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-config-magnolia""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-config-refined""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-config-typesafe""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-config-yaml""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala213.value) Seq("""dev.zio""" %%% """zio-config-gen""" % """3.0.7""") else Seq.empty },
    libScalax.`slf4j-simple` ++= { if (djxIsScala213.value) Seq("""org.slf4j""" % """slf4j-simple""" % """2.0.6""") else Seq.empty },
    libScalax.`binding.scala` ++= {
      if (djxIsScala213.value) Seq("""com.yang-bo""" %%% """html""" % """2.0.0+28-a2b9d520""") else Seq.empty
    },
    libScalax.`binding.scala` ++= {
      if (djxIsScala213.value) Seq("""com.thoughtworks.binding""" %%% """binding""" % """12.1.0+110-53fd3428""") else Seq.empty
    },
    libScalax.`commons-io` ++= { if (djxIsScala213.value) Seq("""org.apache.commons""" % """commons-io""" % """1.3.2""") else Seq.empty },
    libScalax.`macwire` ++= { if (djxIsScala213.value) Seq("""com.softwaremill.macwire""" %%% """macros""" % """2.5.8""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala3.value) Seq("""io.circe""" %%% """circe-core""" % """0.14.3""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala3.value) Seq("""io.circe""" %%% """circe-generic""" % """0.14.3""") else Seq.empty },
    libScalax.`circe` ++= { if (djxIsScala3.value) Seq("""io.circe""" %%% """circe-parser""" % """0.14.3""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio""" % """2.0.5""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-streams""" % """2.0.5""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-test""" % """2.0.5""") else Seq.empty },
    libScalax.`zio2` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-test-sbt""" % """2.0.5""") else Seq.empty },
    libScalax.`typesafe-config` ++= { if (djxIsScala3.value) Seq("""com.typesafe""" % """config""" % """1.4.1""") else Seq.empty },
    libScalax.`scala-collection-compat` ++= {
      if (djxIsScala3.value) Seq("""org.scala-lang.modules""" %%% """scala-collection-compat""" % """2.8.1""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala3.value) Seq("""org.http4s""" %%% """http4s-dsl""" % """0.23.17""") else Seq.empty },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala3.value) Seq("""org.http4s""" %%% """http4s-ember-server""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= {
      if (djxIsScala3.value) Seq("""org.http4s""" %%% """http4s-ember-client""" % """0.23.17""") else Seq.empty
    },
    libScalax.`http4s-Release` ++= { if (djxIsScala3.value) Seq("""org.http4s""" %%% """http4s-circe""" % """0.23.17""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-config""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-config-magnolia""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-config-refined""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-config-typesafe""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-config-yaml""" % """3.0.7""") else Seq.empty },
    libScalax.`zio-config` ++= { if (djxIsScala3.value) Seq("""dev.zio""" %%% """zio-config-gen""" % """3.0.7""") else Seq.empty },
    libScalax.`slf4j-simple` ++= { if (djxIsScala3.value) Seq("""org.slf4j""" % """slf4j-simple""" % """2.0.6""") else Seq.empty },
    libScalax.`binding.scala` ++= { if (djxIsScala3.value) Seq("""com.yang-bo""" %%% """html""" % """2.0.0+28-a2b9d520""") else Seq.empty },
    libScalax.`binding.scala` ++= {
      if (djxIsScala3.value) Seq("""com.thoughtworks.binding""" %%% """binding""" % """12.1.0+110-53fd3428""") else Seq.empty
    },
    libScalax.`commons-io` ++= { if (djxIsScala3.value) Seq("""org.apache.commons""" % """commons-io""" % """1.3.2""") else Seq.empty },
    libScalax.`macwire` ++= { if (djxIsScala3.value) Seq("""com.softwaremill.macwire""" %%% """macros""" % """2.5.8""") else Seq.empty }
  )

}
