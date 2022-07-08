plugins {
    `kotlin-dsl`
    id("maven-publish")
    id("com.gradle.plugin-publish") version "0.18.0"
}

group = "com.futuremind"
version = "0.1.0"

dependencies {
    implementation(kotlin("gradle-plugin"))
}

gradlePlugin {
    plugins {
        create("compilerPlugin") {
            id = "com.futuremind.hardspace"
            implementationClass = "com.futuremind.hardspace.gradle.CompilerPlugin"
        }
    }
}