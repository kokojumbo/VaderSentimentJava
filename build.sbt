
name := "vader-sentiment"

version := "1.0"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  "org.apache.lucene" % "lucene-analyzers-common" % "5.5.0",
  "commons-lang" % "commons-lang" % "2.6",
  "log4j" % "log4j" % "1.2.17",
  "junit" % "junit" % "4.12"
)

