package lesson_8

fun main() {
    val addOnWeek = intArrayOf(4, 5, 8, 3, 12, 15, 18)
    var addAll = 0
    for (i in 0..(addOnWeek.size - 1)) {
        addAll += addOnWeek[i]
    }
    println(addAll)
}