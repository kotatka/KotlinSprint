package lesson_8

fun main() {
    val ingridientsOfRagu = arrayOf("курица", "лук", "перец", "соль", "морковь", "картофель")

    println("Информацию о каком ингридиенте вы хотите найти?")
    val userChoiseIngridient = readln()

    if (userChoiseIngridient in ingridientsOfRagu)
        println("Ингридиент $userChoiseIngridient в рецепте есть")
    else
        println("Такого ингридиента в рецепте нет")
}