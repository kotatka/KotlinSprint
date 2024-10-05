package lesson_6

fun main() {
    var num1: Int
    var num2: Int
    var userNum: Int
    var numberOfAttempts = 3

    do {
        num1 = (1..9).random()
        num2 = (1..9).random()

        println("Чтобы доказать что вы не бот, решите пример $num1 + $num2")
        userNum = readln().toInt()

        numberOfAttempts--
    } while ((numberOfAttempts > 0) && (userNum != (num1 + num2)))

    if (userNum == num1 + num2) println("Добро пожаловать")
    else println("Доступ запрещен")
}