package lesson_17

class Ship(name: String) {
    var name: String = name
        get() = field
        set(value) {
            if (value != field) println("Ошибка, менять имя корабля нельзя")
        }
    var averageSpeed: Int = 60
    var port: String = ""
}

fun main() {
    val ship1 = Ship("Гончая")

    ship1.name = "Дракула"
    ship1.averageSpeed = 65
    ship1.port = "Архангельск"

    println(ship1.name)
    println(ship1.averageSpeed)
    println(ship1.port)
}