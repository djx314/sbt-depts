package djx.sbt.depts.abs

import com.typesafe.config.{Config, ConfigFactory}

trait TakeSbtProperties {
  protected def sbtPropertiesString: String
  private def typesafePropertiesConfig: Config = ConfigFactory.parseString(sbtPropertiesString)
  def version: String                          = typesafePropertiesConfig.getConfig("sbt").getString("version")
}
