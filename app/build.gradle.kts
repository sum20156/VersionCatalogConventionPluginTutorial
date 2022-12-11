plugins {
    id ("conventionplugintest.android.application")
    id ("conventionplugintest.android.compose")
}

android {
    namespace ="com.example.conventionplugintest"

    defaultConfig {
        applicationId ="com.example.conventionplugintest"
        versionCode =1
        versionName ="1.0"

        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary =true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled=false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation (libs.android.core.ktx)
    implementation (libs.lifecycle.runtime.ktx)
    testImplementation (libs.junit)
    androidTestImplementation (libs.androidx.test.ext)

}