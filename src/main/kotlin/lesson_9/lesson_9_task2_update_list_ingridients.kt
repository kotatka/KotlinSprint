package lesson_9

fun main() {
    val listOfIngridients = mutableListOf("яйцо", "помидор", "перец")
    println("В рецепте есть базовые ингридиенты: $listOfIngridients . Желаете добавить свой?")
    val userChoise = readln()

    val rightAnswer = userChoise.equals("да", true)

    if (rightAnswer != true) return

    println("Какой ингридиент вы хотите добавить?")

    listOfIngridients.add(readln())

    println("Теперь в рецепте есть следующие элементы: $listOfIngridients")
}