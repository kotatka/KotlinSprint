package lesson_22

class RegularBook1(
    name: String,
    author: String,
)

data class DataBook1(
    val name: String,
    val author: String
)

fun main() {
    val book1 = RegularBook1("Гарри Поттер", "Роулинг")
    val book2 = DataBook1("Властелин колец", "Толкиен")

    println(book1) // Строковое представление объекта по умолчанию
    println(book2) // В Data Class используется переопределенная функция toString()
}