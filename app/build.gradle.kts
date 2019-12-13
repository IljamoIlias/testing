plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(29)
    buildToolsVersion = "29.0.2"

    defaultConfig {
        applicationId = "com.example.mytestapp"
        minSdkVersion(22)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/java", "src/main/kotlin")
        }
    }

    packagingOptions{
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/metadata.jvm.kotlin_module")
        exclude("META-INF/metadata.kotlin_module")
    }

}

dependencies {
    implementation(kotlin("stdlib-jdk7", "1.3.61"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core-ktx:1.1.0")
    implementation("com.squareup.moshi:moshi-kotlin-codegen:1.9.2")
}
