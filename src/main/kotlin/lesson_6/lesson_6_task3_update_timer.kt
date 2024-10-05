package lesson_6

fun main() {
    println("Введите сколько секунд вам необходимо засечь")
    var userSeconds = readln().toInt()

    while (userSeconds > 0) {
        println("Осталось секунд: ${userSeconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}