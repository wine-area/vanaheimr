/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("java-conventions")
    // swagger-gradle-plugin
    id("io.swagger.core.v3.swagger-gradle-plugin")
}

val implementation by configurations

dependencies {
    // swagger-annotations
    implementation("io.swagger.core.v3:swagger-annotations:2.1.9")
    // https://mvnrepository.com/artifact/jakarta.validation/jakarta.validation-api
    implementation("jakarta.validation:jakarta.validation-api:3.0.2")
    // spring-web-annontations
    compileOnly("org.springframework:spring-web")
}



