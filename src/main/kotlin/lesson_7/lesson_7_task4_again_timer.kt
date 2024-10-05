package lesson_7

fun main() {
    println("Напишите сколько секунд вам нужно засечь")
    val userSeconds = readln().toInt()

    for (i in userSeconds downTo 1) {
        println("Осталось секунд до конца: $i")
        Thread.sleep(1000)
    }

    println("Время вышло.")
}