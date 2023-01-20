package djx.sbt.depts.output

import _root_.sbt._
import _root_.sbt.Keys._
import _root_.scala.collection.compat._
import _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

trait BuildKeys {

  object scalaV {

    val `v211` = """2.11.12"""
    val `v212` = """2.12.17"""
    val `v213` = """2.13.10"""
    val `v3`   = """3.2.1"""

  }

  object libScalax {
    val `zio`                     = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio""")
    val `circe`                   = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for circe""")
    val `typesafe-config`         = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for typesafe-config""")
    val `scala-collection-compat` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for scala-collection-compat""")
    val `http4s-Release`          = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for http4s-Release""")
    val `zio-config`              = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]]("""lib for zio-config""")
  }
}

trait Djx314DeptsImpl {

  val buildKeys: BuildKeys
  import buildKeys._

  def settingsForDept: Seq[Setting[_]] = Seq(
    libScalax.`zio`                                                      := libScalax.`zio`.?.value.to(List).flatten,
    libScalax.`zio` += """dev.zio"""                                    %%% """zio"""                     % """2.0.5""",
    libScalax.`zio` += """dev.zio"""                                    %%% """zio-streams"""             % """2.0.5""",
    libScalax.`zio` += """dev.zio"""                                    %%% """zio-test"""                % """2.0.5""",
    libScalax.`zio` += """dev.zio"""                                    %%% """zio-test-sbt"""            % """2.0.5""",
    libScalax.`circe`                                                    := libScalax.`circe`.?.value.to(List).flatten,
    libScalax.`circe` += """io.circe"""                                 %%% """circe-core"""              % """0.14.3""",
    libScalax.`circe` += """io.circe"""                                 %%% """circe-generic"""           % """0.14.3""",
    libScalax.`circe` += """io.circe"""                                 %%% """circe-parser"""            % """0.14.3""",
    libScalax.`typesafe-config`                                          := libScalax.`typesafe-config`.?.value.to(List).flatten,
    libScalax.`typesafe-config` += """com.typesafe"""                     % """config"""                  % """1.4.1""",
    libScalax.`scala-collection-compat`                                  := libScalax.`scala-collection-compat`.?.value.to(List).flatten,
    libScalax.`scala-collection-compat` += """org.scala-lang.modules""" %%% """scala-collection-compat""" % """2.8.1""",
    libScalax.`http4s-Release`                                           := libScalax.`http4s-Release`.?.value.to(List).flatten,
    libScalax.`http4s-Release` += """org.http4s"""                      %%% """http4s-dsl"""              % """0.23.17""",
    libScalax.`http4s-Release` += """org.http4s"""                      %%% """http4s-ember-server"""     % """0.23.17""",
    libScalax.`http4s-Release` += """org.http4s"""                      %%% """http4s-ember-client"""     % """0.23.17""",
    libScalax.`http4s-Release` += """org.http4s"""                      %%% """http4s-circe"""            % """0.23.17""",
    libScalax.`zio-config`                                               := libScalax.`zio-config`.?.value.to(List).flatten,
    libScalax.`zio-config` += """dev.zio"""                             %%% """zio-config"""              % """3.0.7""",
    libScalax.`zio-config` += """dev.zio"""                             %%% """zio-config-magnolia"""     % """3.0.7""",
    libScalax.`zio-config` += """dev.zio"""                             %%% """zio-config-refined"""      % """3.0.7""",
    libScalax.`zio-config` += """dev.zio"""                             %%% """zio-config-typesafe"""     % """3.0.7""",
    libScalax.`zio-config` += """dev.zio"""                             %%% """zio-config-yaml"""         % """3.0.7""",
    libScalax.`zio-config` += """dev.zio"""                             %%% """zio-config-gen"""          % """3.0.7"""
  )

}
