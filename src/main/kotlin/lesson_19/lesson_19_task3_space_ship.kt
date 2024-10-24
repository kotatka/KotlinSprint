package lesson_19

class SpaceShip(
    val name: String,
    val speed: Int,
) {
    fun takeOff(): String = TODO("Сделать функцию taheoff")
    fun landing() {
        println("Корабль сел")
    }
    //TODO доделать shootAsteroid
    fun shootAsteroid(){
        println("Корабль стреляет, но не точно")
    }
}

fun main() {
    val spaceShip1 = SpaceShip("рутой", 100)
    spaceShip1.takeOff()
    spaceShip1.shootAsteroid()
}