package com.github.byrlx.asplugin.services

import com.intellij.openapi.project.Project
import com.github.byrlx.asplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
