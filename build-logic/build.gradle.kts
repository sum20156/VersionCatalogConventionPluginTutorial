plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin{
    plugins{
        register("androidApplication"){
            id="conventionplugintest.android.application"
            implementationClass="AndroidApplicationConventionPlugin"
        }
        register("androidLibrary"){
            id="conventionplugintest.android.library"
            implementationClass="AndroidLibraryConventionPlugin"
        }
        register("androidFeature"){
            id="conventionplugintest.android.feature"
            implementationClass="AndroidFeatureConventionPlugin"
        }
        register("composePluginForApp"){
            id="conventionplugintest.android.compose"
            implementationClass="AndroidApplicationComposeConventionPlugin"
        }
        register("composePluginLibrary"){
            id="conventionplugintest.android.compose.library"
            implementationClass="AndroidLibraryComposeConventionPlugin"
        }

    }
}