package djx.sbt.depts.abs

import com.typesafe.config.{Config, ConfigFactory}

import java.io.File
import java.nio.file.Paths

trait TakeSbtProperties {
  protected def sbtPropertiesFile: File
  private val typesafePropertiesConfig: Config = ConfigFactory.parseFile(sbtPropertiesFile)
  val version: String                          = typesafePropertiesConfig.getConfig("sbt").getString("version")

  def code: String = s"sbt.version=$version"
}
