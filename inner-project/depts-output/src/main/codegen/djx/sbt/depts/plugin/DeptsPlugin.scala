package djx.sbt.depts.output

import _root_.sbt._
import _root_.sbt.Keys._
import _root_.scala.collection.compat._
import _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

trait Djx314DeptsPluginImpl extends _root_.sbt.AutoPlugin {

  override def trigger: PluginTrigger = allRequirements

  object autoImport {
    object lib {
      val `zio`   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio""")
      val `circe` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for circe""")
    }

    object scalaV {

      val `v211` = """2.11.12"""
      val `v212` = """2.12.17"""
      val `v213` = """2.13.10"""
      val `v3`   = """3.2.1"""

    }

  }

  import autoImport._

  override def buildSettings: Seq[Setting[_]] = Seq(
    lib.`zio`                      := lib.`zio`.?.value.to(List).flatten,
    lib.`zio` += """dev.zio"""    %%% """zio"""           % """2.0.5""",
    lib.`zio` += """dev.zio"""    %%% """zio-streams"""   % """2.0.5""",
    lib.`zio` += """dev.zio"""    %%% """zio-test"""      % """2.0.5""",
    lib.`zio` += """dev.zio"""    %%% """zio-test-sbt"""  % """2.0.5""",
    lib.`circe`                    := lib.`circe`.?.value.to(List).flatten,
    lib.`circe` += """io.circe""" %%% """circe-core"""    % """0.14.3""",
    lib.`circe` += """io.circe""" %%% """circe-generic""" % """0.14.3""",
    lib.`circe` += """io.circe""" %%% """circe-parser"""  % """0.14.3"""
  )

}
