package lesson_18

open class DiceThrow() {
    open fun throwDice() {
        println("")
    }
}

class Dice4facesThrow() : DiceThrow() {
    override fun throwDice() {
        println("На кости выпало: ${(1..4).random()}")
    }
}

class Dice6facesThrow() : DiceThrow() {
    override fun throwDice() {
        println("На кости выпало: ${(1..6).random()}")
    }
}

class Dice8facesThrow() : DiceThrow() {
    override fun throwDice() {
        println("На кости выпало: ${(1..8).random()}")
    }
}

fun main() {
    val dice1 = Dice4facesThrow()
    val dice2 = Dice6facesThrow()
    val dice3 = Dice8facesThrow()
    val diceList = listOf<DiceThrow>(dice1, dice2, dice3)
    diceList.forEach { it.throwDice() }
}