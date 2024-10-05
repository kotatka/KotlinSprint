package lesson_6

fun main() {
    val lotteryNumber = (1..9).random()
    var numberOfAttemps = 5
    var userChoise = 0

    while (numberOfAttemps > 0) {
        println("Угадайте число в промежутке от 1 до 9")
        userChoise = readln().toInt()

        if (lotteryNumber == userChoise) break
        else println("Неверно, у вас осталось попыток: ${--numberOfAttemps}")
    }
    if (userChoise == lotteryNumber) println("Это была великолепная игра!")
    else println("Было загадано число: $lotteryNumber")
}