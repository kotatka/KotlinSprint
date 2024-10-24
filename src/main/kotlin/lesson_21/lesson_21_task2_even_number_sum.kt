package lesson_21

fun List<Int>.evenNumberSum(x:List<Int>):Int{
var summ = 0
    x.map { if (x.indexOf(it) % 2 != 0) summ+=it }
    return summ
}

fun main() {
    val list = listOf<Int>(1, 5, 7, 18, 11, 22)
    val summ = list.evenNumberSum(list)
    println(summ)
}