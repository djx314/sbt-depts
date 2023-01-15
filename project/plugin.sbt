VarContext.changePluginVar        := "sbtScalafmt"
addSbtPlugin("org.scalameta"       % "sbt-scalafmt"             % "2.4.6")
VarContext.changePluginVar        := "sbtRevolver"
addSbtPlugin("io.spray"            % "sbt-revolver"             % "0.9.1")
VarContext.changePluginVar        := "sbtTwirl"
addSbtPlugin("com.typesafe.play"   % "sbt-twirl"                % "1.6.0-RC1")
VarContext.changePluginVar        := "sbtSonatype"
addSbtPlugin("org.xerial.sbt"      % "sbt-sonatype"             % "3.9.2")
VarContext.changePluginVar        := "sbtPgp"
addSbtPlugin("com.jsuereth"        % "sbt-pgp"                  % "2.0.1")
VarContext.changePluginVar        := "sbtScalajsCrossproject"
addSbtPlugin("org.portable-scala"  % "sbt-scalajs-crossproject" % "1.2.0")
VarContext.changePluginVar        := "sbtGit"
addSbtPlugin("com.github.sbt"      % "sbt-git"                  % "2.0.0")
VarContext.changePluginVar        := "sbtIdeSettings"
addSbtPlugin("org.jetbrains.scala" % "sbt-ide-settings"         % "1.1.1")
VarContext.changePluginVar        := "sbtScalajs"
addSbtPlugin("org.scala-js"        % "sbt-scalajs"              % "1.12.0")
