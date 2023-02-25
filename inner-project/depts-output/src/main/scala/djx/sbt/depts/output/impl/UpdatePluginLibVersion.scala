package djx.sbt.depts
package output
package impl

import plugins.impl.GlobalVersion.version as pVersion

import java.io.{FileOutputStream, PrintWriter}
import java.nio.file.{Files, Path}
import scala.util.Using

object UpdatePluginLibVersion {
  def update(file: Path): Unit = {
    val writeString = s"""libraryDependencies += "net.scalax.djx314" %% "sbt-depts-djx314-plugins" % "${pVersion}""""
    Using.resource(new FileOutputStream(file.toFile)) { out =>
      Using.resource(new PrintWriter(out)) { writer =>
        writer.println(writeString)
      }
    }
  }
}
