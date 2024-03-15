pluginManagement {
    repositories {
        maven("https://www.jitpack.io")
        google()
        mavenCentral()
        gradlePluginPortal()

    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven ("https://www.jitpack.io")
        google()
        mavenCentral()
    }
}


rootProject.name = "Aula Zoom Imagem"
include(":app")