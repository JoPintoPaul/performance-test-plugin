# performance-test-plugin

To clone:
```
git clone https://github.com/JoPintoPaul/performance-test-plugin.git
```
To publish locally:
```
sbt publishLocal
```

To use in a project
1. Add to `plugins.sbt`: 
  `addSbtPlugin("uk.gov.hmrc" % "performance-test-plugin" % "0.1.0-SNAPSHOT")`
2. Delete from `plugins.sbt`: `gatling-sbt`
3. Delete from `Dependencies.scala`: all Gatling libraries and the `performance-test-runner` library
