package lesson_9

fun main() {
    println("Введите 5 ингридиетов через запятую с пробелом.")
    val userStringIngridients = readln().split(", ")
    val userListIngridients = userStringIngridients.sorted()
    println("Ваш список: $userListIngridients")
}
