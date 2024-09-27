package lesson_4

fun main() {
    val allTables = 13
    val bookTablesToday = 13
    val freeTablesTomorrow = 4
    val bookTablesTomorrow = allTables - freeTablesTomorrow
    var canBook = bookTablesToday < allTables

    println("Доступность столиков на сегодня:$canBook")

    canBook = bookTablesTomorrow < allTables

    println("Доступность столиков на завтра:$canBook")
}