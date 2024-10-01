package lesson_5

fun main() {
    val number1 = 13
    val number2 = 26
    println("Добрый день, чтобы продолжить авторизацию докажите, что вы не бот. Решите пример '$number1+$number2'")
    val userAnswer = readln().toInt()

    if (userAnswer == (number1 + number2)) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}