package com.ysoft.training

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

/**
 * Simple plugin for counting lines in build.gradle.
 **/
class LineCountPlugin implements Plugin<Project> {

    void apply(Project project) {
        Task countLineTask = project.tasks.add("countLines")
        countLineTask.doLast {
            def counter = 0
            new File("build.gradle").eachLine { line -> 
                counter += 1
            }
            println "Total lines: ${counter}"
        }
    }
}
