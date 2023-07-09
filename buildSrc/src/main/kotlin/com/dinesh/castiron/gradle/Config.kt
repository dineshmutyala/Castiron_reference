package com.dinesh.castiron.gradle

object Config {
    const val ROOT_NAMESPACE = "com.dinesh"

    object App {
        const val APPLICATION_ID = "com.dinesh.castiron"
        const val NAMESPACE = APPLICATION_ID
        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0"
    }

    object SDK {
        const val SDK_VERSION = 33
        const val MIN_SDK_VERSION = 21
        const val KOTLIN_JVM_TARGET = "1.8"
        const val KOTLIN_COMPOSE_COMPILER = "1.4.8"
    }
}