package djx.sbt.depts.abs

import com.typesafe.config.ConfigFactory

import java.io.File
import java.nio.file.Paths

trait a {

  private val c = ConfigFactory.parseFile(Paths.get("..", "project", "build.properties").toFile)

  val version: String = c.getConfig("sbt").getString("version")

  println(version)

}

object bb extends App with a
