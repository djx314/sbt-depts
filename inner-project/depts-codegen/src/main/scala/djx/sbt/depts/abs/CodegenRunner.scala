package djx.sbt.depts
package codegen

import java.nio.file.Paths

object CodegenRunner {

  def main(str: Array[String]): Unit = {
    locally {
      val propertiesFile = Paths.get(str(0)).toFile.getCanonicalFile
      val targetFile     = Paths.get(str(1))
      new SbtVersionSetting(sbtPropertiesFile = propertiesFile).codegenAction(targetFile)
    }
    locally {
      val libConfigFile = Paths.get(str(2))
      AppHaveATest.codegenAction(libConfigFile)
    }
  }

}
