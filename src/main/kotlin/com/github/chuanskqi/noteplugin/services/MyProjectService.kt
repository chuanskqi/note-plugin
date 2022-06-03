package com.github.chuanskqi.noteplugin.services

import com.intellij.openapi.project.Project
import com.github.chuanskqi.noteplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
