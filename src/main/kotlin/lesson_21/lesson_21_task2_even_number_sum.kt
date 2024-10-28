package lesson_21

fun List<Int>.evenNumberSum(x: List<Int>): Int = (this.filter { it % 2 == 0 }).sum()

fun main() {
    val list = listOf<Int>(1, 5, 7, 18, 11, 22)
    val summ = list.evenNumberSum(list)
    println(summ)
}