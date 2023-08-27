package djx.sbt.depts
package output
package impl

import java.io.{FileOutputStream, PrintWriter}
import java.nio.file.{Files, Path}
import scala.util.Using

object UpdateSbtVersion {
  def update(file: Path): Unit = {
    val writeString = s"sbt.version=${SbtVersionSetting.sbtVersion}"
    Using.resource(new PrintWriter(file.toFile)) { writer =>
      writer.println(writeString)
    }
  }
}
