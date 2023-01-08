Context.changePluginVar           := "sbtScalafmt"
addSbtPlugin("org.scalameta"       % "sbt-scalafmt"             % "2.4.6")
Context.changePluginVar           := "sbtRevolver"
addSbtPlugin("io.spray"            % "sbt-revolver"             % "0.9.1")
Context.changePluginVar           := "sbtTwirl"
addSbtPlugin("com.typesafe.play"   % "sbt-twirl"                % "1.6.0-RC1")
Context.changePluginVar           := "sbtSonatype"
addSbtPlugin("org.xerial.sbt"      % "sbt-sonatype"             % "3.9.2")
Context.changePluginVar           := "sbtPgp"
addSbtPlugin("com.jsuereth"        % "sbt-pgp"                  % "2.0.1")
Context.changePluginVar           := "sbtScalajsCrossproject"
addSbtPlugin("org.portable-scala"  % "sbt-scalajs-crossproject" % "1.2.0")
Context.changePluginVar           := "sbtGit"
addSbtPlugin("com.github.sbt"      % "sbt-git"                  % "2.0.0")
Context.changePluginVar           := "sbtIdeSettings"
addSbtPlugin("org.jetbrains.scala" % "sbt-ide-settings"         % "1.1.1")
Context.changePluginVar           := "sbtScalajs"
addSbtPlugin("org.scala-js"        % "sbt-scalajs"              % "1.12.0")
