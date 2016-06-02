name := "JData Gen"

version := "1.0"

scalaVersion := "2.10.4"

//EclipseKeys.withSource := true

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.google.code.gson" % "gson" % "2.6.2"
)