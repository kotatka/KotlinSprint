package lesson_4

const val ALL_TABLES = 13

fun main() {
    val bookTablesToday = ALL_TABLES
    val freeTablesTomorrow = 4
    val bookTablesTomorrow = ALL_TABLES - freeTablesTomorrow
    var isBook = bookTablesToday < ALL_TABLES

    println("Доступность столиков на сегодня:$isBook")

    isBook = bookTablesTomorrow < ALL_TABLES

    println("Доступность столиков на завтра:$isBook")
}