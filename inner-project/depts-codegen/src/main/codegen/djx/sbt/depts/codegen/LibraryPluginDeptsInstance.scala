package djx.sbt.depts
package codegen

object LibraryPluginDeptsInstance extends _root_.djx.sbt.depts.abs.PluginDepts {

  VarContext.changePluginVar := "sbt-scalafmt"

  addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.0")

  VarContext.changePluginVar := "sbt-revolver"

  addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")

  VarContext.changePluginVar := "sbt-twirl"

  addSbtPlugin("com.typesafe.play" % "sbt-twirl" % "1.6.0-RC2")

  VarContext.changePluginVar := "sbt-sonatype"

  addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.17")

  VarContext.changePluginVar := "sbt-pgp"

  addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")

  VarContext.changePluginVar := "sbt-scalajs-crossproject"

  addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.2.0")

  VarContext.changePluginVar := "sbt-git"

  addSbtPlugin("com.github.sbt" % "sbt-git" % "2.0.1")

  VarContext.changePluginVar := "sbt-ide-settings"

  addSbtPlugin("org.jetbrains.scala" % "sbt-ide-settings" % "1.1.1")

  VarContext.changePluginVar := "sbt-scalajs"

  addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.13.0")

  VarContext.changePluginVar := "sbt-platform-deps"

  addSbtPlugin("org.portable-scala" % "sbt-platform-deps" % "1.0.1")

  VarContext.changePluginVar := "flyway-sbt"

  addSbtPlugin("io.github.davidmweber" % "flyway-sbt" % "7.4.0")

  VarContext.changePluginVar := "sbt-web-scalajs"

  addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.2.0")

  VarContext.changePluginVar := "sbt-depts-djx314"

  addSbtPlugin("net.scalax.djx314" % "sbt-depts-djx314" % "0.0.1-M337")

  VarContext.changePluginVar := "sbt-js-engine"

  addSbtPlugin("com.typesafe.sbt" % "sbt-js-engine" % "1.2.3")

  VarContext.changePluginVar := "sbt-scala-js-map"

  addSbtPlugin("com.thoughtworks.sbt-scala-js-map" % "sbt-scala-js-map" % "4.1.1")

}
