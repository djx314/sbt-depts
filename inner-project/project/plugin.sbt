import djx.sbt.depts.plugins.{PluginsCollection => pluginCol}

addSbtPlugin(pluginCol.`sbt-scalafmt`)
addSbtPlugin(pluginCol.`sbt-sonatype`)
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")
