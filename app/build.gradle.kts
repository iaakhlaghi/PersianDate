plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.iaa.persiandate"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.iaa.persiandate"
        minSdk = 31
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }
}
