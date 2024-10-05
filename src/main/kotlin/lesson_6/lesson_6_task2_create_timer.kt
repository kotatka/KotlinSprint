package lesson_6

const val CONVERT_MILLISECONDS: Long = 1000

fun main() {
    println("Введите сколько секунд вам необходимо засечь")
    val userSeconds: Long = readln().toLong()

    val userMilliseconds: Long = userSeconds * CONVERT_MILLISECONDS

    Thread.sleep(userMilliseconds)

    println("прошло $userSeconds секунд")
}