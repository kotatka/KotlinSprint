package lesson_14

open class LinerTask2(
    val name: String,
    val speedShip: String = "средняя",
    val carryingShip: String = "средняя",
    val capacityShip: String = "наивысшая",
) {
    open fun loadingShip() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }

    fun outputInformation() {
        println("Имя корабля: $name, Скорость: $speedShip, грузоподъемность: $carryingShip, вместительность: $capacityShip")
    }
}

class CargoShipTask2(
    name: String,
    speedShip: String = "маленькая",
    carryingShip: String = "высокая",
) : LinerTask2(name, speedShip, carryingShip) {
    override fun loadingShip() {
        println("$name активирует погрузочный кран")
    }
}

class IsebreakerTask2(
    name: String,
    speedShip: String = "маленькая",
    capacityShip: String = "маленькая",
) : LinerTask2(name, speedShip, capacityShip) {
    fun iceBreake() {
        println("Ледокол ломает лёд")
    }

    override fun loadingShip() {
        println("$name ледокол открывает ворота со стороны кормы")
    }
}

fun main() {
    val liner1 = LinerTask2("Лайнер1")
    val cargoShip1 = CargoShipTask2("Грузовой корабль1")
    val icebreaker1 = IsebreakerTask2("Ледокол1")

    liner1.loadingShip()
    cargoShip1.loadingShip()
    icebreaker1.loadingShip()

    liner1.outputInformation()
    cargoShip1.outputInformation()
    icebreaker1.outputInformation()
}

