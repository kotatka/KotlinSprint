package lesson_20

class Player(
    val name: String,
    val maxHP: Int = 100,
    var currentHP: Int,
)

fun main() {
    val player1 = Player("Даниил", 100, 20)

    val healingSalve: (Player) -> Unit
    healingSalve = { it.currentHP = it.maxHP }

    healingSalve(player1)
}