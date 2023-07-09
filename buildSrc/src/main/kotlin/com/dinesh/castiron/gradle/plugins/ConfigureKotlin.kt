package com.dinesh.castiron.gradle.plugins

import com.android.build.gradle.ProguardFiles.getDefaultProguardFile
import com.dinesh.castiron.gradle.Config
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaLibraryPlugin
import org.gradle.kotlin.dsl.configure
import com.android.build.gradle.BaseExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun Project.configureKotlin() {
    tasks.withType(KotlinCompile::class.java) {
        kotlinOptions {
            jvmTarget = Config.SDK.KOTLIN_JVM_TARGET
        }
    }
}