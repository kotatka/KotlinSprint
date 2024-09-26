package lesson_2

fun main() {
    val percentCons = 100
    val crystalOre = 7
    val ironOre = 11
    val buff = 20f
    val buffCrystal: Int = (crystalOre * buff / percentCons).toInt()
    val buffIron: Int = (ironOre * buff / percentCons).toInt()
    println(buffCrystal)
    println(buffIron)
}