package lesson_9

fun main() {
    val ingridientsOfRagu = listOf("курица", "лук", "морковь", "чеснок", "перец", "картофель", "соль")

    println("В рецепте есть следующие элементы:")
    ingridientsOfRagu.forEach {
        println(it)
    }
}