buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Dependencies.HILT_AGP)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10")
    }
}