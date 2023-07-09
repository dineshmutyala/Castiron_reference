package com.dinesh.castiron.gradle.plugins

import com.android.build.gradle.ProguardFiles.getDefaultProguardFile
import com.dinesh.castiron.gradle.Config
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaLibraryPlugin
import org.gradle.kotlin.dsl.configure
import com.android.build.gradle.BaseExtension

fun Project.configureAndroid() {
    configureAndroidApp()
}

private fun Project.configureAndroidApp() {
    configure<BaseExtension> {
        namespace = Config.App.NAMESPACE

        compileSdkVersion(Config.SDK.SDK_VERSION)

        defaultConfig {
            applicationId = Config.App.APPLICATION_ID
            minSdk = Config.SDK.MIN_SDK_VERSION
            targetSdk = Config.SDK.SDK_VERSION
            versionCode = Config.App.VERSION_CODE
            versionName = Config.App.VERSION_NAME

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            vectorDrawables {
                useSupportLibrary = true
            }
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
