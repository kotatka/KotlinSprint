package lesson_4

fun main() {
    val trainingDay = 5
    val dayParity = trainingDay % 2

    println(
        """
        Упражнения для рук:    ${dayParity == 0}
        Упражнения для ног:    ${dayParity != 0}
        Упражнения для спины:  ${dayParity != 0}
        Упражнения для пресса: ${dayParity == 0}
    """.trimMargin()
    )
}