package lesson_5

const val CORRECT_ANSWER = 39

fun main() {
    println("Добрый день, чтобы продолжить авторизацию докажите, что вы не бот. Решите пример '13+26'")
    val userAnswer = readln().toInt()

    if (userAnswer == CORRECT_ANSWER) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}