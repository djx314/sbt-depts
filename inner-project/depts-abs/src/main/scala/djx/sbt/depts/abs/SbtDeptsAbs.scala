package djx.sbt.depts.abs

import com.typesafe.config.{Config, ConfigFactory}

class TakeSbtProperties(sbtLibrary: TakeSbtProperties.Extra3)
    extends TakeSbtProperties.Extra3(org = sbtLibrary.org, libName = sbtLibrary.libName, version = sbtLibrary.version)

object TakeSbtProperties {

  implicit class Extra1(val org: String) extends AnyVal {
    def %(libName: String): Extra2 = Extra2(org = org, libName = libName)
  }

  case class Extra2(org: String, libName: String) {
    def %(version: String): Extra3 = Extra3(org = org, libName = libName, version = version)
  }

  case class Extra3(org: String, libName: String, version: String)

  object libraryDependencies {
    def +=(t: Extra3): Extra3 = t
  }

}
