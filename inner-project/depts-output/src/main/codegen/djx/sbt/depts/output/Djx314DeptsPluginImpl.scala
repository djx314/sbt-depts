package djx.sbt.depts.output

import _root_.sbt._
import _root_.sbt.Keys._
import _root_.scala.collection.compat._
import _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

trait BuildKeys extends impl.BuildKeysAbs {

  val scalaV: ScalaV = ScalaV(`v211` = """2.11.12""", `v212` = """2.12.18""", `v213` = """2.13.11""", `v3` = """3.3.0""")

  object libScalax {
    val `typesafe-config`             = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for typesafe-config""")
    val `http4s-Release-ember-server` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-Release-ember-server""")
    val `http4s-Release-ember-client` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-Release-ember-client""")
    val `scalatest`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scalatest""")
    val `scala-sbt`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scala-sbt""")
    val `distage`                     = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for distage""")
    val `fs2`                         = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for fs2""")
    val `kind-projector`              = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for kind-projector""")
    val `simple-adt`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for simple-adt""")
    val `cats-effect`                 = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for cats-effect""")
    val `slick`                       = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for slick""")
    val `scala-collection-compat`     = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scala-collection-compat""")
    val `commons-lang3-bridge`        = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-lang3-bridge""")
    val `http4s-twirl`                = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-twirl""")
    val `commons-lang3`               = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for commons-lang3""")
    val `doobie`                      = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for doobie""")
    val `zio-config`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-config""")
    val `slf4j-simple`                = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for slf4j-simple""")
    val `zio-json`                    = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-json""")
    val `play-circe`                  = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for play-circe""")
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
    innerSetting.setKey(libScalax.`typesafe-config`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`http4s-Release-ember-server`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`http4s-Release-ember-client`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`scalatest`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`scala-sbt`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`distage`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`fs2`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`kind-projector`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`simple-adt`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`cats-effect`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`slick`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`scala-collection-compat`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`commons-lang3-bridge`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`http4s-twirl`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`commons-lang3`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`doobie`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`zio-config`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`slf4j-simple`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`zio-json`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`play-circe`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`h2`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`zio2`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`http4s-Release`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`sbt-librarymanagement-core`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`shapeless3-test`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`circe`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`cats-effect-cps`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`doobie-h2`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`javacv-platform`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`commons-io`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`shapeless`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`macwire`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.setKey(libScalax.`cats`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty),
    innerSetting.addLibrarySetting(libScalax.`shapeless`)(djxIsScala211)(contextLibraryCollection.apply(("shapeless", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect`)(djxIsScala212)(contextLibraryCollection.apply(("cats-effect", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala213)(contextLibraryCollection.apply(("doobie", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala213)(contextLibraryCollection.apply(("scalatest", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala213)(contextLibraryCollection.apply(("fs2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javacv-platform`)(djxIsScala211)(contextLibraryCollection.apply(("javacv-platform", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-json`)(djxIsScala213)(contextLibraryCollection.apply(("zio-json", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie-h2`)(djxIsScala213)(contextLibraryCollection.apply(("doobie-h2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala213)(contextLibraryCollection.apply(("circe", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-librarymanagement-core`)(djxIsScala212)(
      contextLibraryCollection.apply(("sbt-librarymanagement-core", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala212)(contextLibraryCollection.apply(("http4s-Release", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`play-circe`)(djxIsScala212)(contextLibraryCollection.apply(("play-circe", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3`)(djxIsScala211)(contextLibraryCollection.apply(("commons-lang3", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`simple-adt`)(djxIsScala212)(contextLibraryCollection.apply(("simple-adt", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie-h2`)(djxIsScala212)(contextLibraryCollection.apply(("doobie-h2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3-bridge`)(djxIsScala3)(
      contextLibraryCollection.apply(("commons-lang3-bridge", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`shapeless`)(djxIsScala213)(contextLibraryCollection.apply(("shapeless", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless3-test`)(djxIsScala3)(contextLibraryCollection.apply(("shapeless3-test", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala211)(contextLibraryCollection.apply(("zio2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slick`)(djxIsScala213)(contextLibraryCollection.apply(("slick", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats`)(djxIsScala212)(contextLibraryCollection.apply(("cats", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
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
    innerSetting.addLibrarySetting(libScalax.`cats-effect`)(djxIsScala211)(contextLibraryCollection.apply(("cats-effect", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-collection-compat`)(djxIsScala3)(
      contextLibraryCollection.apply(("scala-collection-compat", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`slick`)(djxIsScala211)(contextLibraryCollection.apply(("slick", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`kind-projector`)(djxIsScala213)(contextLibraryCollection.apply(("kind-projector", "2.13")))(
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
    innerSetting.addLibrarySetting(libScalax.`doobie-h2`)(djxIsScala211)(contextLibraryCollection.apply(("doobie-h2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect-cps`)(djxIsScala3)(contextLibraryCollection.apply(("cats-effect-cps", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-server`)(djxIsScala3)(
      contextLibraryCollection.apply(("http4s-Release-ember-server", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`commons-io`)(djxIsScala213)(contextLibraryCollection.apply(("commons-io", "2.13")))(
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
    innerSetting.addLibrarySetting(libScalax.`commons-lang3-bridge`)(djxIsScala211)(
      contextLibraryCollection.apply(("commons-lang3-bridge", "2.11"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala211)(contextLibraryCollection.apply(("doobie", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect`)(djxIsScala3)(contextLibraryCollection.apply(("cats-effect", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`simple-adt`)(djxIsScala3)(contextLibraryCollection.apply(("simple-adt", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-librarymanagement-core`)(djxIsScala213)(
      contextLibraryCollection.apply(("sbt-librarymanagement-core", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-client`)(djxIsScala212)(
      contextLibraryCollection.apply(("http4s-Release-ember-client", "2.12"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`scala-sbt`)(djxIsScala212)(contextLibraryCollection.apply(("scala-sbt", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`h2`)(djxIsScala212)(contextLibraryCollection.apply(("h2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-librarymanagement-core`)(djxIsScala3)(
      contextLibraryCollection.apply(("sbt-librarymanagement-core", "3"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`slf4j-simple`)(djxIsScala211)(contextLibraryCollection.apply(("slf4j-simple", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala3)(contextLibraryCollection.apply(("zio2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-twirl`)(djxIsScala212)(contextLibraryCollection.apply(("http4s-twirl", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release`)(djxIsScala211)(contextLibraryCollection.apply(("http4s-Release", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`play-circe`)(djxIsScala213)(contextLibraryCollection.apply(("play-circe", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect-cps`)(djxIsScala212)(contextLibraryCollection.apply(("cats-effect-cps", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala212)(contextLibraryCollection.apply(("zio2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javacv-platform`)(djxIsScala212)(contextLibraryCollection.apply(("javacv-platform", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`typesafe-config`)(djxIsScala3)(contextLibraryCollection.apply(("typesafe-config", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`simple-adt`)(djxIsScala211)(contextLibraryCollection.apply(("simple-adt", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats`)(djxIsScala3)(contextLibraryCollection.apply(("cats", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless`)(djxIsScala3)(contextLibraryCollection.apply(("shapeless", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala212)(contextLibraryCollection.apply(("fs2", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`shapeless`)(djxIsScala212)(contextLibraryCollection.apply(("shapeless", "2.12")))(
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
    innerSetting.addLibrarySetting(libScalax.`macwire`)(djxIsScala213)(contextLibraryCollection.apply(("macwire", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie-h2`)(djxIsScala3)(contextLibraryCollection.apply(("doobie-h2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala212)(contextLibraryCollection.apply(("circe", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3`)(djxIsScala3)(contextLibraryCollection.apply(("commons-lang3", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-collection-compat`)(djxIsScala211)(
      contextLibraryCollection.apply(("scala-collection-compat", "2.11"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`kind-projector`)(djxIsScala212)(contextLibraryCollection.apply(("kind-projector", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala211)(contextLibraryCollection.apply(("fs2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`typesafe-config`)(djxIsScala212)(contextLibraryCollection.apply(("typesafe-config", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats`)(djxIsScala213)(contextLibraryCollection.apply(("cats", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`typesafe-config`)(djxIsScala211)(contextLibraryCollection.apply(("typesafe-config", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3-bridge`)(djxIsScala213)(
      contextLibraryCollection.apply(("commons-lang3-bridge", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`distage`)(djxIsScala212)(contextLibraryCollection.apply(("distage", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-io`)(djxIsScala211)(contextLibraryCollection.apply(("commons-io", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala212)(contextLibraryCollection.apply(("zio-config", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect`)(djxIsScala213)(contextLibraryCollection.apply(("cats-effect", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio2`)(djxIsScala213)(contextLibraryCollection.apply(("zio2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slick`)(djxIsScala212)(contextLibraryCollection.apply(("slick", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slf4j-simple`)(djxIsScala3)(contextLibraryCollection.apply(("slf4j-simple", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`distage`)(djxIsScala3)(contextLibraryCollection.apply(("distage", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3`)(djxIsScala212)(contextLibraryCollection.apply(("commons-lang3", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala211)(contextLibraryCollection.apply(("scalatest", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scalatest`)(djxIsScala3)(contextLibraryCollection.apply(("scalatest", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`h2`)(djxIsScala213)(contextLibraryCollection.apply(("h2", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`macwire`)(djxIsScala3)(contextLibraryCollection.apply(("macwire", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`zio-json`)(djxIsScala3)(contextLibraryCollection.apply(("zio-json", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`h2`)(djxIsScala3)(contextLibraryCollection.apply(("h2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-Release-ember-client`)(djxIsScala213)(
      contextLibraryCollection.apply(("http4s-Release-ember-client", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`kind-projector`)(djxIsScala211)(contextLibraryCollection.apply(("kind-projector", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`scala-collection-compat`)(djxIsScala213)(
      contextLibraryCollection.apply(("scala-collection-compat", "2.13"))
    )(sourcePosition.fromEnclosing()),
    innerSetting.addLibrarySetting(libScalax.`zio-config`)(djxIsScala211)(contextLibraryCollection.apply(("zio-config", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slf4j-simple`)(djxIsScala213)(contextLibraryCollection.apply(("slf4j-simple", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`h2`)(djxIsScala211)(contextLibraryCollection.apply(("h2", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`commons-lang3`)(djxIsScala213)(contextLibraryCollection.apply(("commons-lang3", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`fs2`)(djxIsScala3)(contextLibraryCollection.apply(("fs2", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`circe`)(djxIsScala211)(contextLibraryCollection.apply(("circe", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`simple-adt`)(djxIsScala213)(contextLibraryCollection.apply(("simple-adt", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`macwire`)(djxIsScala211)(contextLibraryCollection.apply(("macwire", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`http4s-twirl`)(djxIsScala211)(contextLibraryCollection.apply(("http4s-twirl", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javacv-platform`)(djxIsScala3)(contextLibraryCollection.apply(("javacv-platform", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`slick`)(djxIsScala3)(contextLibraryCollection.apply(("slick", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`doobie`)(djxIsScala3)(contextLibraryCollection.apply(("doobie", "3")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`javacv-platform`)(djxIsScala213)(contextLibraryCollection.apply(("javacv-platform", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats`)(djxIsScala211)(contextLibraryCollection.apply(("cats", "2.11")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`distage`)(djxIsScala213)(contextLibraryCollection.apply(("distage", "2.13")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`sbt-librarymanagement-core`)(djxIsScala211)(
      contextLibraryCollection.apply(("sbt-librarymanagement-core", "2.11"))
    )(sourcePosition.fromEnclosing()),
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
    innerSetting.addLibrarySetting(libScalax.`slf4j-simple`)(djxIsScala212)(contextLibraryCollection.apply(("slf4j-simple", "2.12")))(
      sourcePosition.fromEnclosing()
    ),
    innerSetting.addLibrarySetting(libScalax.`cats-effect-cps`)(djxIsScala213)(contextLibraryCollection.apply(("cats-effect-cps", "2.13")))(
      sourcePosition.fromEnclosing()
    )
  )

}
