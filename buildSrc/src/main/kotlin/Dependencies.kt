import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {
    const val androidXCore = "androidx.core:${Versions.androidXCore}"
    const val androidXLifeCycle = "androidx.lifecycle:${Versions.androidXLifeCycle}"
    const val androidXActivity = "androidx.activity:${Versions.androidXActivity}"

    const val composeMaterial = "androidx.compose.material3:material3:${Versions.composeMaterial3}"
    const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeUiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeRuntime = "androidx.compose.runtime:runtime:${Versions.compose}"
    const val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
    const val composeTest = "androidx.compose.ui:ui-test-manifest"
    const val material3 = "androidx.compose.material3:material3"

    const val junit = "junit:junit:${Versions.junit}"
    const val androidxTestExtension = "androidx.test.ext:${Versions.androidxTestExtension}"
    const val androidxTestEspresso = "androidx.test.espresso:${Versions.androidxTestEspresso}"
    const val androidxComposeUiTest = "androidx.compose.ui:ui-test-junit4"

    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltAgp = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"

    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
}

fun DependencyHandler.android(){
    implementation(Dependencies.androidXCore)
    implementation(Dependencies.androidXLifeCycle)
    implementation(Dependencies.androidXActivity)
    testImplementation(Dependencies.junit)
    androidTestApi(Dependencies.androidxTestExtension)
    androidTestApi(Dependencies.androidxTestEspresso)
    androidTestApi(Dependencies.androidxComposeUiTest)
    debugImplementation(Dependencies.composeUiTooling)
    debugImplementation(Dependencies.composeTest)
}

fun DependencyHandler.room() {
    implementation(Dependencies.roomRuntime)
    implementation(Dependencies.roomKtx)
    kapt(Dependencies.roomCompiler)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.retrofit)
    implementation(Dependencies.moshiConverter)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLoggingInterceptor)
}

fun DependencyHandler.compose() {
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeBom)
    implementation(Dependencies.material3)
    implementation(Dependencies.composeRuntime)
    implementation(Dependencies.composeUiGraphics)
    implementation(Dependencies.composeUiTooling)
    implementation(Dependencies.composeMaterial)
    debugImplementation(Dependencies.composeUiToolingPreview)
}

fun DependencyHandler.hilt() {
    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltCompiler)
}