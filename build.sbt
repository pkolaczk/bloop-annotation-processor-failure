import Dependencies._

ThisBuild / scalaVersion     := "2.11.12"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"


lazy val root = (project in file("."))
  .settings(
    name := "bloop-annotation-processing",
    compileOrder := CompileOrder.JavaThenScala,
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.immutables" % "value"  % "2.7.4" % Provided,
    libraryDependencies += "com.github.misberner.duzzt" % "duzzt-processor" % "0.0.2" % Provided
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
