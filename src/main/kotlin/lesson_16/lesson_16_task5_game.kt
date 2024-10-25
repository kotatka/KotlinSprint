package lesson_16

class Player(
    val name: String,
    private var healthPoint: Int,
    private var punchPower: Int,
) {
    fun heal(healNum: Int) {
        if (healthPoint == 0) println("Лечение не возможно, игрок $name мертв")
        else healthPoint += healNum
    }

    fun damage(damageNum: Int) {
        healthPoint -= damageNum
        if (healthPoint < 1) die()
    }

    private fun die() {
        println("Игрок $name погиб")
        healthPoint = 0
        punchPower = 0
    }
}

fun main() {
    val player1 = Player("Даня", 20, 10)

    player1.damage(5)
    player1.damage(10)
    player1.heal(5)
    player1.damage(11)
    player1.heal(5)
}