package djx.sbt.depts.abs;

import coursier._

object BC {

  def main(arr: Array[String]): Unit = {
    val files = Fetch().addDependencies(dep"org.scala-sbt:sbt-launch:1.11.0").run()

    println(files)
  }

}
