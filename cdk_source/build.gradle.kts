plugins {
    kotlin("jvm") version "1.9.21"
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
