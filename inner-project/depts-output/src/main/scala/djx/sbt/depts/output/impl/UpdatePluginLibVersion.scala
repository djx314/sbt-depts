package djx.sbt.depts
package output
package impl

import plugins.impl.GlobalVersion.{version => pVersion}

import java.nio.file.{Files, Path}

object UpdatePluginLibVersion {
  def update(file: Path): Unit =
    Files.writeString(file, s"""libraryDependencies += "net.scalax.djx314" %% "sbt-depts-djx314-plugins" % "${pVersion}"""")
}
