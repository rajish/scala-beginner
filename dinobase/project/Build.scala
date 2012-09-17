import sbt._
import Keys._
import PlayProject._

import org.ensime.sbt.Plugin.Settings.ensimeConfig
import org.ensime.sbt.util.SExp._


object ApplicationBuild extends Build {

    val appName         = "dinobase"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here
      ensimeConfig := sexp(
        key(":only-include-in-index"), sexp(
          "controllers\\..*",
          "models\\..*",
          "views\\..*",
          "play\\..*",
          "play\\..api\\..*"
        ),
        key(":source-roots"), sexp(
          "/home/rajish/proj/scala-beginner/dinobase/app",
          "/home/rajish/proj/scala-beginner/dinobase/test",
          "/home/rajish/bin/play2/framework/src"
        )
      )
    )
}
