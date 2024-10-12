package lesson_10

const val MIN_LENGHT = 4

fun main() {
    println("Введите логин")
    val userLogin = readln()

    println("Введите пароль")
    val userPassword = readln()

    val checkPassword = toCheckLenght(userPassword.length)
    val checkLogin = toCheckLenght(userLogin.length)

    if ((checkLogin) || (checkPassword))
        println("Логин или пароль недостаточно длинные")
}


fun toCheckLenght(name: Int): Boolean = (name < MIN_LENGHT)

