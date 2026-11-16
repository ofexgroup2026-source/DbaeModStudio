pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()      // also hosts com.android.tools.build:apksig
        mavenCentral()
    }
}
rootProject.name = "DbaeModStudio"
include(":app")
