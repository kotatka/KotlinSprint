package lesson_14


abstract class figure(
    val color: String,
) {
    abstract fun areaCalculation(): Float

    abstract fun perimetrCalculation(): Float

    override fun toString(): String {
        return "figure(color='$color')"
    }

}

class rectangle(
    color: String,
    val width: Int,
    val length: Int,
) : figure(color) {

    override fun areaCalculation(): Float = (width * length).toFloat()

    override fun perimetrCalculation(): Float = ((2 * width) + (2 * length)).toFloat()

    override fun toString(): String {
        return "rectangle(width=$width, length=$length)"
    }

}

class circle(
    color: String,
    val radius: Int,
) : figure(color) {

    override fun areaCalculation(): Float = (3.14 * radius * radius).toFloat()

    override fun perimetrCalculation(): Float = (2 * 3.14 * radius).toFloat()

    override fun toString(): String {
        return "circle(radius=$radius)"
    }

}

fun main() {

    val figuresList = mutableListOf<figure>(
        circle("черный", 10),
        circle("белый", 5),
        rectangle("черный", 10, 9),
        rectangle("белый", 5, 4),
    )

    val blackFigures = figuresList.filter { it.color == "черный" }
    val perimetrBlack = (blackFigures.map { it.perimetrCalculation() })
    println("Сумма периметров черных фигур: ${perimetrBlack.sum()}")

    val whiteFigures = figuresList.filter { it.color == "белый" }
    val areaWhite = (whiteFigures.map { it.areaCalculation() })
    println("Сумма площадей белых фигур: ${areaWhite.sum()}")
}