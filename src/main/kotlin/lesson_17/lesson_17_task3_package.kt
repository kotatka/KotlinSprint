package lesson_17

class Package {
    var name: String = ""
        get() = if (isSecret == true) "Секретно" else field
    var numFiles: Int = 0
        get() = if (isSecret == true) 0 else field
    var isSecret: Boolean = false
}

fun main() {
    val package1 = Package()
    package1.name = "Папка1"
    package1.numFiles = 20
    package1.isSecret = true

    println(package1.name)
    println(package1.numFiles)
}