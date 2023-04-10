# sbt-depts

[![Maven Central](https://img.shields.io/maven-central/v/net.scalax.djx314/sbt-depts-djx314-plugins_2.12.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22net.scalax.djx314%22%20AND%20a:%22sbt-depts-djx314%22)

A deceptive sbt project that sync the dependencies what `scalax` need.
```sbt
addSbtPlugin("net.scalax.djx314" % "sbt-depts-djx314" % "latest.version")
```
Related Poject:
1. [scala-workers/commons-lang3-bridge](https://github.com/scala-workers/commons-lang3-bridge)
1. [scalax/simple](https://github.com/scalax/simple)

本地测试步骤：
1. 添加依赖到`/scala-version-project/`下面的4个文件夹，分别对应4个Scala版本
1. 这个工程是一个伪装工程，本身并没有实际意义，进入目录`/inner-project/`
1. 以`/inner-project/`为Root启动sbt，运行sbt命令`bbLocal`即可对项目进行打包
1. 打包得到新版本，记住版本号，更新到原项目，只更新`addSbtPlugin("net.scalax.djx314" % "sbt-depts-djx314" % "0.0.1-M420")`这句即可
1. 在原项目运行`djxUpdate`，即可把其他需要更新的细项一并更新。