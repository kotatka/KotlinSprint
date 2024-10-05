package lesson_6

fun main() {
    println("Введите свой логин для регистрации")
    val userTrueLogin = readln()
    println("Введите свой пароль для регистарции")
    val userTruePassword = readln()
    do {
        println("Введите свой логин для авторизации")
        val userEnterLogin = readln()
        println("Введите свой пароль для авторизации")
        val userEnterPassword = readln()
    } while ((userEnterPassword != userTruePassword) || (userEnterLogin != userTrueLogin))
    println("Авторизация прошла успешно")
}