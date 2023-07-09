package com.dinesh.castiron.gradle.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class CastIronPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.configureAndroid()

        target.configureKotlin()
    }
}