plugins {
    kotlin("jvm") version "1.9.21"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // AWS CDK
    val awsCdkVersion = "2.115.0"
    implementation("software.amazon.awscdk:aws-cdk-lib:$awsCdkVersion")
    val constructsVersion = "10.3.0"
    implementation("software.constructs:constructs:$constructsVersion")

    // Testing
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
