package lesson_8

fun main() {
    val ingridientsOfRagu = arrayOf("курица", "лук", "перец", "соль", "морковь", "картофель")

    println("Информацию о каком ингридиенте вы хотите найти?")
    val userChoiseIngridient = readln()

    for (i in ingridientsOfRagu) {
        if (i == userChoiseIngridient) {
            println("Ингридиент $i в рецепте есть")
            return
        }
    }
    println("Такого ингридиента в рецепте нет")
}