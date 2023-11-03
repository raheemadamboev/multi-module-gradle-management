import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

object Dependencies {
    const val COMPOSE_BOM = "androidx.compose:compose-bom:${Versions.COMPOSE_BOM}"
    const val COMPOSE_UI = "androidx.compose.ui:ui"
    const val COMPOSE_UI_GRAPHICS = "androidx.compose.ui:ui-graphics"
    const val COMPOSE_UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
    const val COMPOSE_MATERIAL3 = "androidx.compose.material3:material3"
    const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}"
    const val COMPOSE_LIFECYLE = "androidx.lifecycle:lifecycle-runtime-compose:${Versions.COMPOSE_LIFECYCLE}"
    const val CORE = "androidx.core:core-ktx:${Versions.CORE}"
    const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    const val HILT_AGP = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
}

fun DependencyHandler.core() {
    implementation(Dependencies.CORE)
}

fun DependencyHandler.compose() {
    implementation(platform(Dependencies.COMPOSE_BOM))
    implementation(Dependencies.COMPOSE_UI)
    implementation(Dependencies.COMPOSE_UI_GRAPHICS)
    implementation(Dependencies.COMPOSE_UI_TOOLING_PREVIEW)
    implementation(Dependencies.COMPOSE_MATERIAL3)
    implementation(Dependencies.COMPOSE_ACTIVITY)
    implementation(Dependencies.COMPOSE_LIFECYLE)
}

fun DependencyHandler.hilt() {
    implementation(Dependencies.HILT_ANDROID)
    kapt(Dependencies.HILT_COMPILER)
}

fun DependencyHandler.room() {
    implementation(Dependencies.ROOM_RUNTIME)
    implementation(Dependencies.ROOM_KTX)
    kapt(Dependencies.ROOM_COMPILER)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.RETROFIT)
}

fun DependencyHandler.booksDatasource() {
    implementation(project(":books-datasource"))
}

fun DependencyHandler.booksUi() {
    implementation(project(":books-ui"))
}
