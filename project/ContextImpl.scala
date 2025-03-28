import sbt._

object VarContext {
  val changeDeptVar: TaskKey[String]          = taskKey[String]("taskKey for dept var.")
  val endDeptVar: Def.Setting[Task[String]]   = changeDeptVar := "end dept var"
  val changePluginVar: TaskKey[String]        = taskKey[String]("taskKey for plugin var.")
  val endPluginVar: Def.Setting[Task[String]] = changeDeptVar := "end plugin var"

  trait JavaVersionToSetting
  object JavaVersionToSetting {
    val value: JavaVersionToSetting = new JavaVersionToSetting {
      //
    }
  }
  val customJV: SettingKey[JavaVersionToSetting] = settingKey[JavaVersionToSetting]("JavaVersionToSetting")
}
