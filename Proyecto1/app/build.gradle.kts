plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.rack.proyecto1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.rack.proyecto1"
        minSdk = 21
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    viewBinding { //Activar esto para tener el binding
        enable = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    //implementation(libs.retrofit) //Importar retrofit2 para el consumo de apis y la transformacion de json
    //implementation(libs.retrofitconverter) //Importar retrofit2 para el consumo de apis y la transformacion de json)
    //implementation(libs.retrofitconvertergson)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("com.squareup.retrofit2:retrofit:2.11.0") // Retrofit 9 (hacer peticiones y transformar las respuestas en objetos)
    implementation("com.squareup.retrofit2:converter-gson:2.11.0") // Gson Converter 9
    implementation("com.squareup.picasso:picasso:2.8") //Picasso (poner imagenes a partir de urls y cache)
    implementation("androidx.datastore:datastore-preferences:1.0.0") //Libreria para guardar ajustes en el dispositivo
}
