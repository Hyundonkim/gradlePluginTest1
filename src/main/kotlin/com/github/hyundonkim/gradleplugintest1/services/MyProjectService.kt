package com.github.hyundonkim.gradleplugintest1.services

import com.intellij.openapi.project.Project
import com.github.hyundonkim.gradleplugintest1.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
