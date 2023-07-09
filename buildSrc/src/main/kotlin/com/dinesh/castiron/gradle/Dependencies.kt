package com.dinesh.castiron.gradle

object Dependencies {
    private object Versions {
        object AndroidX {
            const val ACTIVITY = "1.7.2"
            const val CORE = "1.10.1"

            object Compose {
                const val BOM = "2022.10.00"
            }
        }

        object Firebase {
            const val BOM = "32.1.1"
        }

        object Kotlin {
            const val BOM = "1.8.22"
        }

        object Testing {
            const val JUNIT4 = "4.13.2"
            const val JUNIT4_ANDROID_EXT = "1.1.5"
        }
    }

    object AndroidX {

        private const val ANDROIDX = "androidx"

        const val ACTIVITY = "$ANDROIDX.activity:activity-compose:${Versions.AndroidX.ACTIVITY}"
        const val CORE = "$ANDROIDX.core:core-ktx:${Versions.AndroidX.CORE}"

        object Compose {
            private const val COMPOSE = "$ANDROIDX.compose"
            const val BOM = "$COMPOSE:compose-bom:${Versions.AndroidX.Compose.BOM}"

            object MATERIAL {
                const val MATERIAL3 = "$COMPOSE.material3:material3"
            }

            object UI {
                private const val UI = "${COMPOSE}.ui"
                const val TOOLING = "$UI:ui-tooling"
                const val TOOLING_PREVIEW = "$UI:ui-tooling-preview"
            }
        }
    }

    object Firebase {
        private const val ROOT = "com.google.firebase"

        const val BOM = "$ROOT:firebase-bom:${Versions.Firebase.BOM}"
        const val AUTH = "$ROOT:firebase-auth-ktx"
    }

    object Kotlin {
        const val BOM = "org.jetbrains.kotlin:kotlin-bom:${Versions.Kotlin.BOM}"
    }

    object Testing {
        const val JUNIT4 = "junit:junit:${Versions.Testing.JUNIT4}"
        const val JUNIT4_ANDROID_EXT = "androidx.test.ext:junit:${Versions.Testing.JUNIT4_ANDROID_EXT}"
    }
}