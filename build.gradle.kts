plugins {
    kotlin("jvm") version "1.9.23"

    kotlin("plugin.serialization") version "1.5.0"
}

group = "edu.agh.susgame.dto"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val cborVersion = "1.3.0"
val coroutinesVersion = "1.9.0"

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$cborVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-cbor:$cborVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
