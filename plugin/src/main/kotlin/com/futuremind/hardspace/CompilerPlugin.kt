package com.futuremind.hardspace

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Exec
import org.gradle.kotlin.dsl.task

class CompilerPlugin : Plugin<Project> {

    override fun apply(project: Project) {

        project.task<Exec>("convertSpaces") {
//            project.tasks.getByName("preBuild").dependsOn(this)
            setWorkingDir("../")
            commandLine(
                "python3",
                "scripts/convert_breaking_spaces.py"
            )
//                .args(
//                "--BREAKINGSPACECHARACTER=&#160;",
//                "--PATHS", "app/src/main/res/values-pl/strings.xml"
//            )
        }

    }

}
