package lesson_4

const val GROUP_TRAINING_ONE = 1
const val GROUP_TRAINING_TWO = 0
fun main() {
    val trainingDay = 5
    println(
        """
        Упражнения для рук:    ${(trainingDay % 2) == GROUP_TRAINING_ONE}
        Упражнения для ног:    ${(trainingDay % 2) == GROUP_TRAINING_TWO}
        Упражнения для спины:  ${(trainingDay % 2) == GROUP_TRAINING_TWO}
        Упражнения для пресса: ${(trainingDay % 2) == GROUP_TRAINING_ONE}
    """.trimMargin()
    )
}