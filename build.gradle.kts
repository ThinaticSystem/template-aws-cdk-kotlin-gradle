plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow")
}

val packageName = "org.example"
group = packageName
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // AWS CDK
    val awsCdkVersion: String by project
    implementation("software.amazon.awscdk:aws-cdk-lib:$awsCdkVersion")
    val constructsVersion: String by project
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

val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "$packageName.CdkAppKt"
    }
}
