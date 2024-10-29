package lesson_20

fun main() {
    val listOfElements = listOf("Апельсин", "Помидор", "Огурец", "Яйцо", "Мандарин", "Курица", "Соль")
    val lyambda: (String) -> Unit
    lyambda = { println("Нажат элемент: $it") }
    val listOfLyambda = listOfElements.map { if (listOfElements.indexOf(it) % 2 != 0) lyambda(it) }
}