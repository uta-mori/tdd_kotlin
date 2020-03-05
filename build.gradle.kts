import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "org.example"
version = "1.0-SNAPSHOT"


plugins {
    java
    kotlin("jvm") version "1.3.31"
    id("org.jlleitschuh.gradle.ktlint-idea") version "9.2.1"
//    id("io.gitlab.arturbosch.detekt") version "1.6.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.0")
}

//detekt {
//    input = files("src/main/kotlin")
//    config = files("ci/detekt.yml")
//    // 設定ファイルはデフォルトの差分だけを記述する
//    buildUponDefaultConfig = true
//}

tasks {
    test {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
    }

    withType<KotlinCompile>().configureEach {
        kotlinOptions.jvmTarget = "1.8"
    }
}