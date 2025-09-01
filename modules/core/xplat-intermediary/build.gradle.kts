plugins {
    id("com.kneelawk.submodule")
    id("com.kneelawk.versioning")
    id("com.kneelawk.kpublish")
}

submodule {
    applyXplatConnection(":core-xplat")
    setupJavadoc()
}

kpublish {
    createPublication()
}
