import sbt._
object Context {
  val changeDeptVar: TaskKey[String] = taskKey[String]("taskKey for dept var.")
}
