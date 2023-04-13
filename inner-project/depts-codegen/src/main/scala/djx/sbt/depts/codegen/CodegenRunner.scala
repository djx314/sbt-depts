package djx.sbt.depts
package codegen

import java.nio.file.{Files, Paths}
import scala.util.Using
import java.io.PrintWriter

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
    locally {
      val scalafmtConfigFile = Paths.get(str(3))
      val scalafmtOutputFile = Paths.get(str(4))
      ScalafmtConfigUpdate.toScalaFile(scalafmtConfigFile, scalafmtOutputFile)
    }
    locally {
      val outputFile = Paths.get(str(5))
      Files.createDirectories(outputFile.getParent)
      val strs = PluginLibraryDepts.gen(LibraryPluginDeptsInstance.context.value)
      Using.resource(new PrintWriter(outputFile.toFile)) { writer =>
        writer.println("package djx.sbt.depts.plugins.impl")
        writer.println
        writer.println("import sbt.librarymanagement.syntax._")
        writer.println
        writer.println("trait PluginsColImpl {")
        writer.println
        for (eachStr <- strs) {
          writer.println(eachStr)
          writer.println
        }
        writer.println("}")
        writer.println
      }
    }
  }

}
