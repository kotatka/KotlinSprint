package lesson_10

fun main() {
    var winPoint = 0
    var userChoise = "да"

    while (userChoise == "да") {

        winPoint = round(winPoint)
        println("Вы хотите сыграть еще?")
        userChoise = readln()

    }

    println("Ваше количество побед: $winPoint")
}

fun throwDice() = (1..6).random()

fun round(name: Int): Int {
    var x = name
    val playerThrow = throwDice()
    println("Игрок бросил кубик. У него выпало: $playerThrow")

    val computerThrow = throwDice()
    println("Компьютер бросил кубик. У него выпало: $computerThrow")
    if (playerThrow > computerThrow) {
        println("Победило человечество")
        x++
    } else if (computerThrow > playerThrow) println("Победила машина")
    else println("Ничья")
    return x
}