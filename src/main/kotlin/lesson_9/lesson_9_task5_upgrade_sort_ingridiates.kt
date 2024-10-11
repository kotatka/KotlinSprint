package lesson_9

fun main() {
    println("Введите 5 ингридиентов.")
    val userIngridients = MutableList(5) { readln().trim() }.toSet().sorted()
    println(userIngridients.joinToString(separator = ", ", postfix = ".").replaceFirstChar { it.uppercase() })
}