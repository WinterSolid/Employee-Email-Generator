plugins {
    kotlin("jvm") version "1.5.31"
}

group = "com.wintersolid"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral() // repositories dependencies
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.8.0")
}


tasks.test {
    useJUnitPlatform()
}
