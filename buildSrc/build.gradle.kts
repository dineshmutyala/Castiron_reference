plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("com.android.tools.build:gradle:8.0.2")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.22")
}

gradlePlugin {
    plugins {
        create("CastIronPlugin") {
            id = "castIronPlugin"
            implementationClass = "com.dinesh.castiron.gradle.plugins.CastIronPlugin"
        }
    }
}