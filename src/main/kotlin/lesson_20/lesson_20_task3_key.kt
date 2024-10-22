package lesson_20

class Player(
    val name: String,
    var isHaveKey: Boolean = false,
)

fun main() {
    val player1 = Player("Даниил")

    val checkKey: (Player) -> Unit
    checkKey = { if (it.isHaveKey == false) println("Дверь заперта") else println("Игрок открыл дверь") }

    checkKey(player1)
    player1.isHaveKey = true
    checkKey(player1)
}