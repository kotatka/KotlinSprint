package lesson_8

fun main() {
    println("Сколько ингридиентов планироуется в вашем рецепте?")
    val numsIngridients = readln().toInt()

    val arrayOfIngridients = Array(size = numsIngridients, { "" })

    for (i in 0..(numsIngridients - 1)) {
        println("Введите ингридиент №${i + 1}")
        arrayOfIngridients[i] = readln()
    }

    for (i in arrayOfIngridients)
        println("Ингридиент ${arrayOfIngridients.indexOf(i) + 1}: $i")
}