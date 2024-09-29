package lesson_5

const val WINNIG_NUMBER1 = 18
const val WINNING_NUMBER2 = 7

fun main() {
    println(
        "Вам нужно угадать 2 числа в диапазоне от 0 до 42, если вы угадали все 2, то вы получаете приз" +
                "если вы угадали одно число, то вы получаете утешительный приз. Введите первое число"
    )
    val userChoise1 = readln().toInt()
    println("Введите второе число")
    val userChoise2 = readln().toInt()
    val isWinChoise1 = ((userChoise1 == WINNIG_NUMBER1) || (userChoise1 == WINNING_NUMBER2))
    val isWinChoise2 = ((userChoise2 == WINNIG_NUMBER1) || (userChoise2 == WINNING_NUMBER2))

    println("Числа, которые нужны для победы: $WINNIG_NUMBER1, $WINNING_NUMBER2")

    if ((userChoise2 == userChoise1) && (isWinChoise1 == true)) println("Вы выйграли утешительный приз!")
    else if ((isWinChoise2 == true) && (isWinChoise1 == true)) println("Поздравляем! Вы выйграли главный приз!")
    else if ((isWinChoise2 == true) || (isWinChoise1 == true)) println("Вы выйграли утешительный приз!")
    else if ((isWinChoise2 != true) && (isWinChoise1 != true)) println("Неудача!")
}