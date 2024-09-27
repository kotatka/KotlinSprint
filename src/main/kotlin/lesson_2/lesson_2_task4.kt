package lesson_2
const val PERCENT_CONST = 100
fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20f
    val buffCrystal: Int = (crystalOre * buff / PERCENT_CONST).toInt()
    val buffIron: Int = (ironOre * buff / PERCENT_CONST).toInt()
    println(buffCrystal)
    println(buffIron)
}