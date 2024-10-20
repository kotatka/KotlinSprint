package lesson_16

private const val PI = 3.14

class Circle(
    private val radius: Int,
) {
    fun longCircle() = PI * 2 * radius
    fun areaCircle() = PI * radius * radius
}

fun main() {
    val circle1 = Circle(5)

    val areaOfCircle = circle1.areaCircle()
    val longOfCircle = circle1.longCircle()

    println("Площадь круга = $areaOfCircle")
    println("Длина окружности = $longOfCircle")
}