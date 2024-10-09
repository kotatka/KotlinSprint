package lesson_8

import java.util.*

fun main() {
    val ingridientsOfRagu = arrayOf("курица", "лук", "перец", "соль", "морковь", "картофель")

    println(Arrays.toString(ingridientsOfRagu))

    println("Какой ингридиент вы хотите заменить?")
    val userOldIngridient = readln()
    val checkIngridient = ingridientsOfRagu.indexOf(userOldIngridient)

    if (checkIngridient == -1)
        println("Данного ингридиента нет в рецепте")
    else {
        println("Какой ингридиент вы хотите добавить?")
        val userNewIngridient = readln()

        ingridientsOfRagu[checkIngridient] = userNewIngridient

        for (i in ingridientsOfRagu) {
            println("Ингридиент ${ingridientsOfRagu.indexOf(i) + 1}: $i")
        }
    }
}