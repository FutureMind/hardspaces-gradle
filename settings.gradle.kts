pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "Hard_Space_Plugin"
include(":plugin")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}