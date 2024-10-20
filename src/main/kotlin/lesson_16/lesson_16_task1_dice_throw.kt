package lesson_16

class Dice(
    private val diceNumber: Int = (1..6).random(),
) {
    fun showDice() {
        println(diceNumber)
    }
}

fun main() {
    val dice1 = Dice()
    dice1.showDice()
}