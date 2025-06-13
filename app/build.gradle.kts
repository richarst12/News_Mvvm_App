plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("org.jetbrains.kotlin.kapt") // for dagger annotation processing
}

android {
    namespace = "com.example.news_mvvm_app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.news_mvvm_app"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    //dagger
    implementation(libs.dagger)
    kapt(libs.dagger.compiler)
    // Lifecycle components
//    implementation("android.arch.lifecycle:extensions:1.1.1") // For ViewModelProviders, etc. (legacy)
     implementation(libs.androidx.lifecycle.viewmodel.ktx)
    //  implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
  //  implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
//// Glide
    implementation("com.github.bumptech.glide:glide:4.11.0")
    implementation("androidx.browser:browser:1.4.0")
//
//    // Retrofit + Gson
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
}