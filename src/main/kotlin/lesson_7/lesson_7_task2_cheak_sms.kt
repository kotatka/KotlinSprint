package lesson_7

fun main() {
    var numFromSms: Int
    var userNum: Int
    do {
        numFromSms = (1000..9999).random()
        println("Ваш код авторизации $numFromSms")

        println("Введите код для авторизации")
        userNum = readln().toInt()

    } while (numFromSms != userNum)

    println("Код введен верно, Добро пожаловать!")
}