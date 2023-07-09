import com.dinesh.castiron.gradle.Config
import com.dinesh.castiron.gradle.Dependencies

plugins {
    id (Plugins.ANDROID_APP)
    id (Plugins.KOTLIN_ANDROID)
    id (Plugins.CAST_IRON_PLUGIN)
    id(Plugins.GOOGLE_SERVICES)
}

dependencies {

    implementation (platform(Dependencies.Kotlin.BOM))

    implementation (Dependencies.AndroidX.CORE)
    implementation (Dependencies.AndroidX.ACTIVITY)

    implementation (platform(Dependencies.AndroidX.Compose.BOM))
    implementation (Dependencies.AndroidX.Compose.MATERIAL.MATERIAL3)
    debugImplementation (Dependencies.AndroidX.Compose.UI.TOOLING)
    debugImplementation (Dependencies.AndroidX.Compose.UI.TOOLING_PREVIEW)

    implementation(platform(Dependencies.Firebase.BOM))
    implementation(Dependencies.Firebase.AUTH)

    implementation(project(Config.Modules.UI_COMPONENTS))
    implementation(project(Config.Modules.UI_THEME))

    testImplementation (Dependencies.Testing.JUNIT4)
    androidTestImplementation (Dependencies.Testing.JUNIT4_ANDROID_EXT)
}