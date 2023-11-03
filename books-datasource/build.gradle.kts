plugins {
    `android-library`
    `kotlin-android`
}

apply<MainGradlePlugin>()

android {
    namespace = "xyz.teamgravity.books_datasource"
}

dependencies {
    core()
    hilt()
    room()
    retrofit()
}