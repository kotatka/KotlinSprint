package lesson_2
const val Percent_Const = 100
fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20f
    val buffCrystal: Int = (crystalOre * buff / Percent_Const).toInt()
    val buffIron: Int = (ironOre * buff / Percent_Const).toInt()
    println(buffCrystal)
    println(buffIron)
}