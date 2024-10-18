package lesson_15

class Instrument(
    val name: String,
    val nums: Int,
) : Search {
    override fun startSearch() {
        println("Выполняется поиск комплектующего для инструмента:$name")
    }

}

class Accessory(
    val name: String,
    val nums: Int,
)

interface Search {
    fun startSearch()
}

fun main() {
    val accessory1 = Accessory("Струна", 10)
    val instrument1 = Instrument("Скрипка", 6)
    instrument1.startSearch()
}