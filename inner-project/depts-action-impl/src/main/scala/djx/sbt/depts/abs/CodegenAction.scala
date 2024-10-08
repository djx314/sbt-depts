package djx.sbt.depts.abs

import java.nio.file.Paths
import java.nio.file.Path

object CodegenActionImpl {

  def findJarPath[ClassType](launchClass: Class[ClassType]): Path = {
    val jarFileURL = launchClass.getProtectionDomain().getCodeSource().getLocation()
    Paths.get(jarFileURL.toURI())
  }

}
