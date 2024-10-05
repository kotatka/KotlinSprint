package lesson_8

fun main() {
    val ingridientsOfRagu = arrayOf("курица", "лук", "перец", "соль", "морковь", "картофель")
    println(ingridientsOfRagu)

    println("Какой ингридиент вы хотите заменить?")
    val userOldIngridient = readln()

    if (userOldIngridient !in ingridientsOfRagu)
        println("Данного ингридиента нет в рецепте")
    else {
        println("Какой ингридиент вы хотите добавить?")
        val userNewIngridient = readln()

        val indexReplacing = ingridientsOfRagu.indexOf(userOldIngridient)
        ingridientsOfRagu[indexReplacing] = userNewIngridient

        for (i in ingridientsOfRagu) {
            println("Ингридиент ${ingridientsOfRagu.indexOf(i) + 1}: $i")
        }
    }
}