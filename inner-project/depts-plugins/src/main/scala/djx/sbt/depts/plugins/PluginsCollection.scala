package djx.sbt.depts.plugins

import sbt.librarymanagement.syntax._

trait PluginsCollection extends djx.sbt.depts.plugins.impl.PluginsColImpl {
  val `sbt-depts`: sbt.librarymanagement.ModuleID = "net.scalax.djx314" % "sbt-depts-djx314" % GlobalVersion.version
}

object PluginsCollection extends PluginsCollection
