plugins {
    id("fabric-loom") apply false
    id("com.kneelawk.submodule") apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
