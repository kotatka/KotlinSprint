package lesson_10

fun main() {
    var winPoint = 0
    var playerThrow: Int
    var computerThrow: Int
    var userChoise = "да"

    while (userChoise == "да") {
        playerThrow = throwDice()
        println("Игрок бросил кубик. У него выпало: $playerThrow")

        computerThrow = throwDice()
        println("Компьютер бросил кубик. У него выпало: $computerThrow")

        winPoint = compareResult(playerThrow, computerThrow, winPoint)

        println("Вы хотите сыграть еще?")
        userChoise = readln()

    }

    println("Ваше количество побед: $winPoint")
}

fun throwDice() = (1..6).random()

fun compareResult(playerThrow: Int, computerThrow: Int, winPoint: Int): Int {
    var x = winPoint
    if (playerThrow > computerThrow) {
        println("Победило человечество")
        x++
    } else if (computerThrow > playerThrow) println("Победила машина")
    else println("Ничья")
    return x
}