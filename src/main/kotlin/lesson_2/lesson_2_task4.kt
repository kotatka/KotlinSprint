package lesson_2

fun main(){
    val crystalOre = 7
    val ironOre = 11
    val buff = 0.2f
    val buffCrystal:Int = (crystalOre*buff).toInt()
    val buffIron:Int = (ironOre*buff).toInt()
    println(buffCrystal)
    println(buffIron)
}