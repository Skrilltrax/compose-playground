// Add compose gradle plugin
plugins {
    kotlin("multiplatform") version "1.5.0"
    id("org.jetbrains.compose") version "0.0.0-web-dev-13"
}

// Add maven repositories
repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

// Enable JS(IR) target and add dependencies
kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.web.core)
                implementation(compose.web.widgets)
                implementation(compose.runtime)
            }
        }
    }
}


group = "dev.skrilltrax"
version = "1.0.0-SNAPSHOT"
