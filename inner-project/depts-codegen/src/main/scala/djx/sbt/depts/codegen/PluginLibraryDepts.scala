package djx.sbt.depts
package codegen

import abs.PluginDepts

import java.io.PrintWriter
import java.nio.file.{Files, Path}
import scala.util.Using

object PluginLibraryDepts {

  def gen(p: List[PluginDepts.LibraryDeptsSettings]): List[String] = {
    var settingStrings: List[String] = List.empty
    var currentContext: String       = null

    for (l <- p) {
      l match {
        case PluginDepts.ChangeDeptVarSettings(varName) => currentContext = varName
        case PluginDepts.AddLibrarySettings(lib) =>
          val str = s"""val `$currentContext`: sbt.librarymanagement.ModuleID = ${lib.genString}"""
          settingStrings = settingStrings ::: str :: List.empty[String]
      }
    }

    settingStrings
  }

}
