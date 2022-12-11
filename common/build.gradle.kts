plugins {
    id("conventionplugintest.android.library")
}

android {
    namespace = "com.example.common"
}

dependencies {
    api(libs.bundles.networking)
}