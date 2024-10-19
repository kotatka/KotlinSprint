package lesson_15

abstract class MusicThing {
    abstract val name: String
    abstract val nums: Int
}

class Instrument(
    override val name: String,
    override val nums: Int,
) : MusicThing(), Search {
    override fun startSearch()
    {
        println("Выполняется поиск комплектующего для инструмента:$name")
    }
}

class Accessory(
    override val name: String,
    override val nums: Int,
) : MusicThing()

interface Search {
    fun startSearch()
}

fun main() {
    val accessory1 = Accessory("Струна", 10)
    val instrument1 = Instrument("Скрипка", 6)
    instrument1.startSearch()
}