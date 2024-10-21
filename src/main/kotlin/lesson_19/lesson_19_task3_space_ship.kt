package lesson_19

class SpaceShip(
    val name: String,
    val speed: Int,
) {
    fun takeOff(): String = TODO()
    fun landing() {
        println("Корабль сел")
    }

    fun shootAsteroid() = TODO()
}

fun main() {
    val spaceShip1 = SpaceShip("рутой", 100)
    spaceShip1.takeOff()
    spaceShip1.shootAsteroid()
}