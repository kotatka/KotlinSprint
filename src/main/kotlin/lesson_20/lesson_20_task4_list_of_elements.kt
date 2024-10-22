package lesson_20

fun main() {
    val listOfElements = listOf("Апельсин", "Помидор", "Огурец", "Яйцо", "Мандарин", "Курица", "Соль")
    listOfElements.map { if (listOfElements.indexOf(it) % 2 != 0) println("Нажат элемент: $it") }
}