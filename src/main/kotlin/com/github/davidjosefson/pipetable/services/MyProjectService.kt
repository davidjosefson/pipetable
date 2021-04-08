package com.github.davidjosefson.pipetable.services

import com.github.davidjosefson.pipetable.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
