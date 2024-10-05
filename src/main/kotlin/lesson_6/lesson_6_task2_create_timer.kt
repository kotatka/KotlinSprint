package lesson_6

fun main() {
    println("Введите сколько секунд вам необходимо засечь")
    val userSeconds = readln().toInt()

    var i = userSeconds

    while (i > 0) {
        i--
        Thread.sleep(1000)
    }

    println("прошло $userSeconds секунд")
}