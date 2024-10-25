package lesson_19

enum class Patron(val powerPatron: Int) {
    BLUE_PATRON(5),
    GREEN_PATRON(10),
    RED_PATRON(20),
    NOTHING(0),
}

class Tank(val name: String, var typeOfPatron: Patron = Patron.NOTHING) {
    fun loadPatron(type: Patron) {
        typeOfPatron = type
    }

    fun shoot() {
        if (typeOfPatron==Patron.NOTHING) println("Танк - $name не заряжен")
        else println("Танк - $name наносит: ${typeOfPatron.powerPatron} урона")
    }
}

fun main() {
    val tank1 = Tank("Катюша")
    tank1.shoot()

    tank1.loadPatron(Patron.BLUE_PATRON)
    tank1.shoot()

    tank1.loadPatron(Patron.GREEN_PATRON)
    tank1.shoot()

    tank1.loadPatron(Patron.RED_PATRON)
    tank1.shoot()
}