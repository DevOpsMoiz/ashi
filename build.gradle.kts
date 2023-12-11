// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath ("io.realm:realm-gradle-plugin:0.88.2")
        classpath ("io.realm:realm-gradle-plugin:10.11.1")

    }
}
plugins {
    id("com.android.application") version "8.2.0" apply false
    id ("com.android.library" ) version "8.2.0" apply false
    id ("org.jetbrains.kotlin.android") version "1.6.20" apply false
    id ("org.jetbrains.kotlin.kapt") version "1.6.20" apply false
}