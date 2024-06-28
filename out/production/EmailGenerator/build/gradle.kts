plugins {
    kotlin("jvm") version "1.5.31"
}

group = "com.wintersolid"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral() // repositories dependencies
}

dependencies {
    implementation(kotlin("stdlib")) // Kotlin standard library
    testImplementation(kotlin("test")) // Kotlin test library
}

tasks.test {
    useJUnitPlatform()
}
