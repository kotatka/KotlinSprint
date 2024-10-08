package lesson_9

fun main() {
    val ingridientsOfOmelet = listOf(2, 50, 15)

    println("Сколько порций омлета вам нужно сделать?")
    val userChoise = readln().toInt()
    val calculateIngridients = ingridientsOfOmelet.map { it * userChoise }

    println(
        "На $userChoise порций вам понадобится: Яиц - ${calculateIngridients[0]} шт., молока - ${calculateIngridients[1]} мл.," +
                "сливочного масла - ${calculateIngridients[2]} гр. "
    )

}