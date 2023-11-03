import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

class MainGradlePlugin : Plugin<Project> {

    override fun apply(project: Project) {
        applyPlugins(project)
        applyProjectConfig(project)
    }

    private fun applyPlugins(project: Project) {
        project.apply {
            plugin("android-library")
            plugin("kotlin-android")
            plugin("kotlin-kapt")
            plugin("dagger.hilt.android.plugin")
        }
    }

    private fun applyProjectConfig(project: Project) {
        project.extensions.getByType(LibraryExtension::class.java).apply {
            compileSdk = ProjectConfig.COMPILE_SDK

            defaultConfig {
                minSdk = ProjectConfig.MIN_SDK
                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            }

            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_17
                targetCompatibility = JavaVersion.VERSION_17
            }
        }
    }
}