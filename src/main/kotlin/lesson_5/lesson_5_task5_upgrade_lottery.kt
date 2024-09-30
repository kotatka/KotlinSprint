package lesson_5

fun main() {
    val lotteryNums = ((0..42).shuffled().take(3)).toList()

    println("Введите 3 числа")

    val userChoise = listOf(readln().toInt(), readln().toInt(), readln().toInt())
    val guessedNums = (lotteryNums.intersect(userChoise)).toList()
    val sizeOfPrice = guessedNums.size

    when (sizeOfPrice) {
        3 -> println("Поздравляем, вы угадали все числа! Вы получаете Джекпот!!!")
        2 -> println("Вы угадали два числа. Вы получаете крупный приз.")
        1 -> println("Вы угадали одно число. Вы получаете утешительный приз.")
        else -> println("Вы не угадали ни одного числа. Попробуйте еще раз.")
    }
    println("Выигрышные номера: $lotteryNums")
}