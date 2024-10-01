package lesson_2


fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20f
    val buffCrystal = (crystalOre * buff / PERCENT_CONST).toInt()
    val buffIron = (ironOre * buff / PERCENT_CONST).toInt()

    println(buffCrystal)
    println(buffIron)
}