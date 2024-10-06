package lesson_7

fun main() {
    println("Введите число")
    val userNum = readln().toInt()
    for (i in 0..userNum step 2)
        print("$i; ")
}