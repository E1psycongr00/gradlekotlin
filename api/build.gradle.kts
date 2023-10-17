plugins {
    id("application")
}

application {
    mainClass = "org.example.ApiMain"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":shared"))
}

tasks.register<Copy>("copyReport") {
    from(layout.buildDirectory.file("report/my-report.pdf"))
    into(layout.buildDirectory.dir("toArchive"))
}

