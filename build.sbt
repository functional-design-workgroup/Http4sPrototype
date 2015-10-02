lazy val root = (project in file(".")).
  settings(
    name := "Http4sPrototype",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.11.7",
    assemblyJarName := "http4s-prototype.jar",
    mainClass in assembly := Some("org.awesome.http4s.Http4sPrototype")
  )

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= {
  lazy val version = "0.9.3"
  Seq(
    "org.http4s" %% "http4s-dsl" % version,
    "org.http4s" %% "http4s-blaze-server" % version
  )
}
