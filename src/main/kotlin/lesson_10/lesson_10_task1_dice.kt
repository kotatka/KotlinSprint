package lesson_10

fun main() {
    val playerThrow = throwDice()
    println("Игрок бросил кубик. У него выпало: $playerThrow")

    val computerThrow = throwDice()
    println("Компьютер бросил кубик. У него выпало: $computerThrow")
    if (playerThrow > computerThrow) println("Победило человечество")
    else if (computerThrow > playerThrow) println("Победила машина")
    else println("Ничья")

}

fun throwDice() = (1..6).random()