plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            plugin("kotlinJvm", "org.jetbrains.kotlin.jvm").version("1.9.23")
            plugin("shadow", "com.github.johnrengelman.shadow").version("8.1.1")
            library("awsCdk", "software.amazon.awscdk:aws-cdk-lib:2.133.0")
            library("awsConstructs", "software.constructs:constructs:10.3.0")
        }
    }
}
rootProject.name = "cdk_source"
