package lesson_4

fun main() {
    val trainingDay = 5
    val isEven: Boolean = (trainingDay % 2) == 0

    println(
        """
        Упражнения для рук:    ${!isEven}
        Упражнения для ног:    $isEven
        Упражнения для спины:  $isEven
        Упражнения для пресса: ${!isEven}
    """.trimMargin()
    )
}