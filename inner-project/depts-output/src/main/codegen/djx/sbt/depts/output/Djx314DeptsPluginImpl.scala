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
    innerSetting.addLibrarySetting(libScalax.`kind-projector`)(djxIsScala211)(contextLibraryCollection.apply(("kind-projector", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala211)(contextLibraryCollection.apply(("circe", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala211)(contextLibraryCollection.apply(("circe", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala211)(contextLibraryCollection.apply(("circe", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala211)(contextLibraryCollection.apply(("scalatest", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala211)(contextLibraryCollection.apply(("scalatest", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala211)(contextLibraryCollection.apply(("scalatest", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect`)(djxIsScala211)(contextLibraryCollection.apply(("cats-effect", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats`)(djxIsScala211)(contextLibraryCollection.apply(("cats", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats`)(djxIsScala211)(contextLibraryCollection.apply(("cats", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`h2`)(djxIsScala211)(contextLibraryCollection.apply(("h2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala211)(contextLibraryCollection.apply(("doobie", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala211)(contextLibraryCollection.apply(("doobie", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala211)(contextLibraryCollection.apply(("doobie", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala211)(contextLibraryCollection.apply(("doobie", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie-h2`)(djxIsScala211)(contextLibraryCollection.apply(("doobie-h2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala211)(contextLibraryCollection.apply(("zio2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala211)(contextLibraryCollection.apply(("zio2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala211)(contextLibraryCollection.apply(("zio2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala211)(contextLibraryCollection.apply(("zio2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`typesafe-config`)(djxIsScala211)(contextLibraryCollection.apply(("typesafe-config", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-collection-compat`)(djxIsScala211)(
      contextLibraryCollection.apply(("scala-collection-compat", "2.11"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala211)(contextLibraryCollection.apply(("http4s-Release", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala211)(contextLibraryCollection.apply(("http4s-Release", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-twirl`)(djxIsScala211)(contextLibraryCollection.apply(("http4s-twirl", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala211)(contextLibraryCollection.apply(("zio-config", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala211)(contextLibraryCollection.apply(("zio-config", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala211)(contextLibraryCollection.apply(("zio-config", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala211)(contextLibraryCollection.apply(("zio-config", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slf4j-simple`)(djxIsScala211)(contextLibraryCollection.apply(("slf4j-simple", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-io`)(djxIsScala211)(contextLibraryCollection.apply(("commons-io", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`macwire`)(djxIsScala211)(contextLibraryCollection.apply(("macwire", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3`)(djxIsScala211)(contextLibraryCollection.apply(("commons-lang3", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3-bridge`)(djxIsScala211)(
      contextLibraryCollection.apply(("commons-lang3-bridge", "2.11"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`simple-adt`)(djxIsScala211)(contextLibraryCollection.apply(("simple-adt", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-librarymanagement-core`)(djxIsScala211)(
      contextLibraryCollection.apply(("sbt-librarymanagement-core", "2.11"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javacv-platform`)(djxIsScala211)(contextLibraryCollection.apply(("javacv-platform", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless`)(djxIsScala211)(contextLibraryCollection.apply(("shapeless", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala211)(contextLibraryCollection.apply(("fs2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala211)(contextLibraryCollection.apply(("fs2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala211)(contextLibraryCollection.apply(("fs2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`kind-projector`)(djxIsScala212)(contextLibraryCollection.apply(("kind-projector", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala212)(contextLibraryCollection.apply(("circe", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala212)(contextLibraryCollection.apply(("circe", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala212)(contextLibraryCollection.apply(("circe", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala212)(contextLibraryCollection.apply(("scalatest", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala212)(contextLibraryCollection.apply(("scalatest", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala212)(contextLibraryCollection.apply(("scalatest", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect`)(djxIsScala212)(contextLibraryCollection.apply(("cats-effect", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats`)(djxIsScala212)(contextLibraryCollection.apply(("cats", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`h2`)(djxIsScala212)(contextLibraryCollection.apply(("h2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala212)(contextLibraryCollection.apply(("doobie", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala212)(contextLibraryCollection.apply(("doobie", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala212)(contextLibraryCollection.apply(("doobie", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala212)(contextLibraryCollection.apply(("doobie", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie-h2`)(djxIsScala212)(contextLibraryCollection.apply(("doobie-h2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala212)(contextLibraryCollection.apply(("zio2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala212)(contextLibraryCollection.apply(("zio2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala212)(contextLibraryCollection.apply(("zio2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala212)(contextLibraryCollection.apply(("zio2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`typesafe-config`)(djxIsScala212)(contextLibraryCollection.apply(("typesafe-config", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-collection-compat`)(djxIsScala212)(
      contextLibraryCollection.apply(("scala-collection-compat", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala212)(contextLibraryCollection.apply(("http4s-Release", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala212)(contextLibraryCollection.apply(("http4s-Release", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-server`)(djxIsScala212)(
      contextLibraryCollection.apply(("http4s-Release-ember-server", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-client`)(djxIsScala212)(
      contextLibraryCollection.apply(("http4s-Release-ember-client", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-twirl`)(djxIsScala212)(contextLibraryCollection.apply(("http4s-twirl", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala212)(contextLibraryCollection.apply(("zio-config", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala212)(contextLibraryCollection.apply(("zio-config", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala212)(contextLibraryCollection.apply(("zio-config", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala212)(contextLibraryCollection.apply(("zio-config", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala212)(contextLibraryCollection.apply(("zio-config", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala212)(contextLibraryCollection.apply(("zio-config", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slf4j-simple`)(djxIsScala212)(contextLibraryCollection.apply(("slf4j-simple", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-io`)(djxIsScala212)(contextLibraryCollection.apply(("commons-io", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`macwire`)(djxIsScala212)(contextLibraryCollection.apply(("macwire", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3`)(djxIsScala212)(contextLibraryCollection.apply(("commons-lang3", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3-bridge`)(djxIsScala212)(
      contextLibraryCollection.apply(("commons-lang3-bridge", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`simple-adt`)(djxIsScala212)(contextLibraryCollection.apply(("simple-adt", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-librarymanagement-core`)(djxIsScala212)(
      contextLibraryCollection.apply(("sbt-librarymanagement-core", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`scala-sbt`)(djxIsScala212)(contextLibraryCollection.apply(("scala-sbt", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javacv-platform`)(djxIsScala212)(contextLibraryCollection.apply(("javacv-platform", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect-cps`)(djxIsScala212)(contextLibraryCollection.apply(("cats-effect-cps", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-json`)(djxIsScala212)(contextLibraryCollection.apply(("zio-json", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless`)(djxIsScala212)(contextLibraryCollection.apply(("shapeless", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala212)(contextLibraryCollection.apply(("fs2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala212)(contextLibraryCollection.apply(("fs2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala212)(contextLibraryCollection.apply(("fs2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala212)(contextLibraryCollection.apply(("fs2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`kind-projector`)(djxIsScala213)(contextLibraryCollection.apply(("kind-projector", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala213)(contextLibraryCollection.apply(("circe", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala213)(contextLibraryCollection.apply(("circe", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala213)(contextLibraryCollection.apply(("circe", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala213)(contextLibraryCollection.apply(("scalatest", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala213)(contextLibraryCollection.apply(("scalatest", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala213)(contextLibraryCollection.apply(("scalatest", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect`)(djxIsScala213)(contextLibraryCollection.apply(("cats-effect", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats`)(djxIsScala213)(contextLibraryCollection.apply(("cats", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`h2`)(djxIsScala213)(contextLibraryCollection.apply(("h2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala213)(contextLibraryCollection.apply(("doobie", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala213)(contextLibraryCollection.apply(("doobie", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala213)(contextLibraryCollection.apply(("doobie", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala213)(contextLibraryCollection.apply(("doobie", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie-h2`)(djxIsScala213)(contextLibraryCollection.apply(("doobie-h2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala213)(contextLibraryCollection.apply(("zio2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala213)(contextLibraryCollection.apply(("zio2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala213)(contextLibraryCollection.apply(("zio2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala213)(contextLibraryCollection.apply(("zio2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`typesafe-config`)(djxIsScala213)(contextLibraryCollection.apply(("typesafe-config", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-collection-compat`)(djxIsScala213)(
      contextLibraryCollection.apply(("scala-collection-compat", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala213)(contextLibraryCollection.apply(("http4s-Release", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala213)(contextLibraryCollection.apply(("http4s-Release", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-server`)(djxIsScala213)(
      contextLibraryCollection.apply(("http4s-Release-ember-server", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-client`)(djxIsScala213)(
      contextLibraryCollection.apply(("http4s-Release-ember-client", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-twirl`)(djxIsScala213)(contextLibraryCollection.apply(("http4s-twirl", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala213)(contextLibraryCollection.apply(("zio-config", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala213)(contextLibraryCollection.apply(("zio-config", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala213)(contextLibraryCollection.apply(("zio-config", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala213)(contextLibraryCollection.apply(("zio-config", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala213)(contextLibraryCollection.apply(("zio-config", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala213)(contextLibraryCollection.apply(("zio-config", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slf4j-simple`)(djxIsScala213)(contextLibraryCollection.apply(("slf4j-simple", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-io`)(djxIsScala213)(contextLibraryCollection.apply(("commons-io", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`macwire`)(djxIsScala213)(contextLibraryCollection.apply(("macwire", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3`)(djxIsScala213)(contextLibraryCollection.apply(("commons-lang3", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3-bridge`)(djxIsScala213)(
      contextLibraryCollection.apply(("commons-lang3-bridge", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`simple-adt`)(djxIsScala213)(contextLibraryCollection.apply(("simple-adt", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-librarymanagement-core`)(djxIsScala213)(
      contextLibraryCollection.apply(("sbt-librarymanagement-core", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javacv-platform`)(djxIsScala213)(contextLibraryCollection.apply(("javacv-platform", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect-cps`)(djxIsScala213)(contextLibraryCollection.apply(("cats-effect-cps", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-json`)(djxIsScala213)(contextLibraryCollection.apply(("zio-json", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless`)(djxIsScala213)(contextLibraryCollection.apply(("shapeless", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala213)(contextLibraryCollection.apply(("fs2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala213)(contextLibraryCollection.apply(("fs2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala213)(contextLibraryCollection.apply(("fs2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala213)(contextLibraryCollection.apply(("fs2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala3)(contextLibraryCollection.apply(("circe", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala3)(contextLibraryCollection.apply(("circe", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala3)(contextLibraryCollection.apply(("circe", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala3)(contextLibraryCollection.apply(("scalatest", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala3)(contextLibraryCollection.apply(("scalatest", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala3)(contextLibraryCollection.apply(("scalatest", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect`)(djxIsScala3)(contextLibraryCollection.apply(("cats-effect", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats`)(djxIsScala3)(contextLibraryCollection.apply(("cats", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`h2`)(djxIsScala3)(contextLibraryCollection.apply(("h2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala3)(contextLibraryCollection.apply(("doobie", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala3)(contextLibraryCollection.apply(("doobie", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala3)(contextLibraryCollection.apply(("doobie", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala3)(contextLibraryCollection.apply(("doobie", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie-h2`)(djxIsScala3)(contextLibraryCollection.apply(("doobie-h2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala3)(contextLibraryCollection.apply(("zio2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala3)(contextLibraryCollection.apply(("zio2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala3)(contextLibraryCollection.apply(("zio2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala3)(contextLibraryCollection.apply(("zio2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`typesafe-config`)(djxIsScala3)(contextLibraryCollection.apply(("typesafe-config", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-collection-compat`)(djxIsScala3)(
      contextLibraryCollection.apply(("scala-collection-compat", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala3)(contextLibraryCollection.apply(("http4s-Release", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala3)(contextLibraryCollection.apply(("http4s-Release", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-server`)(djxIsScala3)(
      contextLibraryCollection.apply(("http4s-Release-ember-server", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-client`)(djxIsScala3)(
      contextLibraryCollection.apply(("http4s-Release-ember-client", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-twirl`)(djxIsScala3)(contextLibraryCollection.apply(("http4s-twirl", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala3)(contextLibraryCollection.apply(("zio-config", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala3)(contextLibraryCollection.apply(("zio-config", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala3)(contextLibraryCollection.apply(("zio-config", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala3)(contextLibraryCollection.apply(("zio-config", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala3)(contextLibraryCollection.apply(("zio-config", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala3)(contextLibraryCollection.apply(("zio-config", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slf4j-simple`)(djxIsScala3)(contextLibraryCollection.apply(("slf4j-simple", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-io`)(djxIsScala3)(contextLibraryCollection.apply(("commons-io", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`macwire`)(djxIsScala3)(contextLibraryCollection.apply(("macwire", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3`)(djxIsScala3)(contextLibraryCollection.apply(("commons-lang3", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3-bridge`)(djxIsScala3)(
      contextLibraryCollection.apply(("commons-lang3-bridge", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`simple-adt`)(djxIsScala3)(contextLibraryCollection.apply(("simple-adt", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-librarymanagement-core`)(djxIsScala3)(
      contextLibraryCollection.apply(("sbt-librarymanagement-core", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`javacv-platform`)(djxIsScala3)(contextLibraryCollection.apply(("javacv-platform", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect-cps`)(djxIsScala3)(contextLibraryCollection.apply(("cats-effect-cps", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-json`)(djxIsScala3)(contextLibraryCollection.apply(("zio-json", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless`)(djxIsScala3)(contextLibraryCollection.apply(("shapeless", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless`)(djxIsScala3)(contextLibraryCollection.apply(("shapeless", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless3-test`)(djxIsScala3)(contextLibraryCollection.apply(("shapeless3-test", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala3)(contextLibraryCollection.apply(("fs2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala3)(contextLibraryCollection.apply(("fs2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala3)(contextLibraryCollection.apply(("fs2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala3)(contextLibraryCollection.apply(("fs2", "3")))(
      sourcePosition.fromEnclosing()
    )
  )

}
