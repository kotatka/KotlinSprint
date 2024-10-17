package lesson_14

open class Liner(
    val speedShip: String = "средняя",
    val carryingShip: String = "средняя",
    val capacityShip: String = "наивысшая",
) {
    override fun toString(): String {
        return "Liner(speedShip='$speedShip', carryingShip='$carryingShip', capacityShip='$capacityShip')"
    }
}

class CargoShip(
    speedShip: String = "маленькая",
    carryingShip: String = "высокая",
) : Liner(speedShip, carryingShip)

class Isebreaker(
    speedShip: String = "маленькая",
    capacityShip: String = "маленькая",
) : Liner(speedShip, capacityShip) {
    fun iceBreake() {
        println("Ледокол ломает лёд")
    }
}

fun main() {
    val liner1 = Liner()
    val cargoShip1 = CargoShip()
    val icebreaker1 = Isebreaker()

    println(liner1)
    println(cargoShip1)
    println(icebreaker1)

    icebreaker1.iceBreake()
}



