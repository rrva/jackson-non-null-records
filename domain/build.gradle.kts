plugins {
    kotlin("jvm")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val jackson = "2.16.1"
dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jackson")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:$jackson")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jackson")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-smile:$jackson")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}