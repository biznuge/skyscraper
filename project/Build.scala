import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "skyscraper"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
        "com.mongodb.casbah" %% "casbah" % "2.1.5-1",
        "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT"
    )

	// https://yobriefca.se/blog/2012/05/07/starter-for-10-scala-play-2-and-mongo/
	// best tute i found.

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here  
	resolvers ++= Seq(
    		"repo.novus snaps" at "http://repo.novus.com/snapshots/",
		"casbah" at "https://oss.sonatype.org/content/groups/scala-tools/" 
	)
   
    )

}
