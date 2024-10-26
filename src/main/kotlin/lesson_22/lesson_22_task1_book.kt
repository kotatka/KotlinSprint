package lesson_22

class RegularBook(
    name: String,
    author: String,
)

data class DataBook(
    val name: String,
    val author: String
)

fun main() {
    val book1 = RegularBook("Капитанская дочка", "Пушкин")
    val book2 = RegularBook("Капитанская дочка", "Пушкин")

    val book3 = DataBook("Собачье сердце", "Булгаков")
    val book4 = DataBook("Собачье сердце", "Булгаков")

    println(book1 == book2)    //будет false, потомоу что сравниваются ссылки на значения
    println(book3 == book4)    //будет true, потмоу что сравниваюстя сами значения
}