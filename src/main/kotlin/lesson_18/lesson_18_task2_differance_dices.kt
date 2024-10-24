package lesson_18

abstract class DiceThrow() {
    abstract val faces: Int
    abstract fun throwDice()
}

class Dice4facesThrow(
    override val faces: Int = 4,
) : DiceThrow() {
    override fun throwDice() {
        println("На кости выпало: ${(1..faces).random()}")
    }
}

class Dice6facesThrow(
    override val faces: Int = 6,
) : DiceThrow() {
    override fun throwDice() {
        println("На кости выпало: ${(1..faces).random()}")
    }
}

class Dice8facesThrow(
    override val faces: Int = 8,
) : DiceThrow() {
    override fun throwDice() {
        println("На кости выпало: ${(1..faces).random()}")
    }
}

fun main() {
    val dice1 = Dice4facesThrow()
    val dice2 = Dice6facesThrow()
    val dice3 = Dice8facesThrow()
    val diceList = listOf<DiceThrow>(dice1, dice2, dice3)
    diceList.forEach { it.throwDice() }
}