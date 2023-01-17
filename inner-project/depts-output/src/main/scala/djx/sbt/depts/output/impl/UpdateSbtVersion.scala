package djx.sbt.depts
package output
package impl

import java.nio.file.{Files, Path}

object UpdateSbtVersion {
  def update(file: Path): Unit = Files.writeString(file, s"sbt.version=${SbtVersionSetting.sbtVersion}")
}
