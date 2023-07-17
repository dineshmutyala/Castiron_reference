package com.dinesh.castiron.gradle

object Config {
    private const val ROOT_NAMESPACE = "com.dinesh"

    object App {
        const val APPLICATION_ID = "com.dinesh.castiron"
        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0"
    }

    object SDK {
        const val SDK_VERSION = 33
        const val MIN_SDK_VERSION = 21
        const val KOTLIN_JVM_TARGET = "1.8"
        const val KOTLIN_COMPOSE_COMPILER = "1.4.8"
    }

    object Modules {
        const val APP = ":castiron-app"
        const val UI_COMPONENTS = ":castiron-ui-components"
        const val UI_THEME = ":castiron-ui-theme"

        fun getNamespace(module: String): String {
            return if (module == APP || ":$module" == APP) App.APPLICATION_ID
            else "$ROOT_NAMESPACE.${module.replace("-", ".")}"
        }
    }
}