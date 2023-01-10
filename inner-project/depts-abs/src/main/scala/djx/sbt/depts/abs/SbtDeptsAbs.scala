package djx.sbt.depts.abs

import com.typesafe.config.{Config, ConfigFactory}

import java.io.File
import java.nio.file.Paths

trait TakeSbtProperties {
  protected def sbtPropertiesFile: File
  private val typesafePropertiesConfig: Config = ConfigFactory.parseFile(sbtPropertiesFile)
  val version: String                          = typesafePropertiesConfig.getConfig("sbt").getString("version")
}

object bb extends App with TakeSbtProperties {
  override protected def sbtPropertiesFile: File = Paths.get("..", "project", "build.properties").toFile
  println(version)
}
