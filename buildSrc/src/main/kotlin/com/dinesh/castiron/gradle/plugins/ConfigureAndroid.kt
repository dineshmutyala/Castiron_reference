package com.dinesh.castiron.gradle.plugins

import Plugins
import com.android.build.gradle.AppPlugin
import com.android.build.gradle.ProguardFiles.getDefaultProguardFile
import com.dinesh.castiron.gradle.Config
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaLibraryPlugin
import org.gradle.kotlin.dsl.configure
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.LibraryPlugin
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

fun Project.configureAndroid() {
    configureAndroidCommon()
    if (plugins.hasPlugin(Plugins.ANDROID_APP)) configureAndroidApp()
    else if (plugins.hasPlugin(Plugins.ANDROID_LIB)) configureAndroidLibrary()
}

private fun Project.configureAndroidCommon() {
    configure<BaseExtension> {
        defaultConfig {
            minSdk = Config.SDK.MIN_SDK_VERSION
            targetSdk = Config.SDK.SDK_VERSION
        }

        buildTypes {
            named("release") {
                isMinifyEnabled = false
                proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            }
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }

        buildFeatures.apply {
            compose = true
        }

        composeOptions {
            kotlinCompilerExtensionVersion = Config.SDK.KOTLIN_COMPOSE_COMPILER
        }
    }
}

private fun Project.configureAndroidApp() {
    configure<BaseAppModuleExtension> {
        namespace = Config.App.NAMESPACE

        compileSdk = Config.SDK.SDK_VERSION

        defaultConfig {
            applicationId = Config.App.APPLICATION_ID
            versionCode = Config.App.VERSION_CODE
            versionName = Config.App.VERSION_NAME
        }
    }
}

private fun Project.configureAndroidLibrary() {
    configure<LibraryExtension> {
        namespace = "${Config.ROOT_NAMESPACE}.${name.replace("-", ".")}"

        compileSdk = Config.SDK.SDK_VERSION

        defaultConfig.apply {
            consumerProguardFiles("consumer-rules.pro")
        }
    }
}
