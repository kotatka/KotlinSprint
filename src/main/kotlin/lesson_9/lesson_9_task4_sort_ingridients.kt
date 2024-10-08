package lesson_9

fun main() {
    println("Введите 5 ингридиетов через запятую с пробелом.")
    val userListIngridients = readln().split(", ").toMutableList()
    userListIngridients.sort()
    println("Ваш список: $userListIngridients")
}
