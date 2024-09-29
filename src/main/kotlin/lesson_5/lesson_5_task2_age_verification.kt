package lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2024

    println("Пожалуйста введите свой год рождения")

    val userYearOfBirth = readln().toInt()

    if ((currentYear-userYearOfBirth)>= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вернуться на главный экран")
}