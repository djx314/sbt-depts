VarContext.changePluginVar        := "sbt-scalafmt"
addSbtPlugin("org.scalameta"       % "sbt-scalafmt"             % "2.5.0")
VarContext.changePluginVar        := "sbt-revolver"
addSbtPlugin("io.spray"            % "sbt-revolver"             % "0.9.1")
VarContext.changePluginVar        := "sbt-twirl"
addSbtPlugin("com.typesafe.play"   % "sbt-twirl"                % "1.6.0-RC1")
VarContext.changePluginVar        := "sbt-sonatype"
addSbtPlugin("org.xerial.sbt"      % "sbt-sonatype"             % "3.9.17")
VarContext.changePluginVar        := "sbt-pgp"
addSbtPlugin("com.jsuereth"        % "sbt-pgp"                  % "2.0.2")
VarContext.changePluginVar        := "sbt-scalajs-crossproject"
addSbtPlugin("org.portable-scala"  % "sbt-scalajs-crossproject" % "1.2.0")
VarContext.changePluginVar        := "sbt-git"
addSbtPlugin("com.github.sbt"      % "sbt-git"                  % "2.0.1")
VarContext.changePluginVar        := "sbt-ide-settings"
addSbtPlugin("org.jetbrains.scala" % "sbt-ide-settings"         % "1.1.1")
VarContext.changePluginVar        := "sbt-scalajs"
addSbtPlugin("org.scala-js"        % "sbt-scalajs"              % "1.13.0")
VarContext.changePluginVar        := "sbt-platform-deps"
addSbtPlugin("org.portable-scala"  % "sbt-platform-deps"        % "1.0.1")
VarContext.changePluginVar        := "flyway-sbt"
addSbtPlugin("io.github.davidmweber" % "flyway-sbt"               % "7.4.0")
VarContext.changePluginVar        := "sbt-web-scalajs"
addSbtPlugin("com.vmunier"           % "sbt-web-scalajs"          % "1.2.0")

