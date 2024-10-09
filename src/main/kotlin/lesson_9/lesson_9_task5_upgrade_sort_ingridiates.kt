package lesson_9

fun main() {
    val userIngridients = MutableList(5) { readln().trim() }.toSet().sorted()
    println(userIngridients.joinToString().replaceFirstChar { it.uppercase() })
}