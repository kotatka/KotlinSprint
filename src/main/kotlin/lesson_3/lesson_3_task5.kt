package lesson_3

fun main() {
    val turnChess = "D2-D4;0"
    val (from, too, turn) = turnChess.split("-", ";")

    println(from)
    println(too)
    println(turn)
}


