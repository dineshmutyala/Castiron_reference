import com.dinesh.castiron.gradle.Config
import com.dinesh.castiron.gradle.Dependencies

plugins {
    id (Plugins.ANDROID_LIB)
    id (Plugins.KOTLIN_ANDROID)
    id (Plugins.CAST_IRON_PLUGIN)
}

dependencies {

    implementation (platform(Dependencies.Kotlin.BOM))

    implementation (Dependencies.AndroidX.Core.KTX)

    implementation (platform(Dependencies.AndroidX.Compose.BOM))
    implementation (Dependencies.AndroidX.Compose.MATERIAL.MATERIAL3)
    debugImplementation (Dependencies.AndroidX.Compose.UI.TOOLING)
    debugImplementation (Dependencies.AndroidX.Compose.UI.TOOLING_PREVIEW)

    implementation(project(Config.Modules.UI_THEME))

    testImplementation(Dependencies.Testing.JUNIT4)
    androidTestImplementation(Dependencies.Testing.JUNIT4_ANDROID_EXT)
}