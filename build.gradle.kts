plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.shadow)
}

val packageName = "org.example"
group = packageName
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // AWS CDK
    implementation(libs.awsCdk)
    implementation(libs.awsConstructs)

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
