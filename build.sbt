lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "performance-test-plugin",
    scalaVersion := "2.12.18",
    majorVersion := 0,
    addSbtPlugin("io.gatling" % "gatling-sbt" % "4.1.5")
  )
