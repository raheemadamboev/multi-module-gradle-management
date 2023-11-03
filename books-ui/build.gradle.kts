plugins {
    `android-library`
    `kotlin-android`
}

apply<MainGradlePlugin>()

android {
    namespace = "xyz.teamgravity.books_ui"
}

dependencies {
    core()
    hilt()
}