package lesson_21

class Player(
    val name: String,
    val maxHP: Int = 100,
    var currentHP: Int,
)

fun Player.isHealty(): Boolean = currentHP == maxHP

fun main() {
    val player1 = Player("Даня", 100, 100)
    val player2 = Player("Костя", 100, 50)

    println("здоров ${player1.name}? ответ: ${player1.isHealty()} ")
    println("здоров ${player2.name}? ответ: ${player2.isHealty()} ")
}