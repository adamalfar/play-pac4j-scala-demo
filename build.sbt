name     := """play-pac4j-scala-demo"""

version  := """1.2.0-SNAPSHOT"""

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "org.pac4j"         % "play-pac4j_scala" % "1.2.0",
  "org.pac4j"         % "pac4j-http"           % "1.5.0",
  "org.pac4j"         % "pac4j-cas"            % "1.5.0",
  "org.pac4j"         % "pac4j-openid"         % "1.5.0",
  "org.pac4j"         % "pac4j-oauth"          % "1.5.0",
  "org.pac4j"         % "pac4j-saml"          % "1.5.0"
)  

resolvers ++= Seq("Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
                "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/")

play.Project.playScalaSettings
