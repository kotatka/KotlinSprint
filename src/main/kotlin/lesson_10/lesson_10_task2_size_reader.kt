package lesson_10

const val MIN_LENGHT = 4

fun main() {
    println("Введите логин")
    val userLogin = readln()
    println("Введите пароль")
    val userPassword = readln()
    val loginLenght = lenghtReader(userLogin)
    val passwordLenght = lenghtReader(userPassword)
    if ((loginLenght < MIN_LENGHT) || (passwordLenght < MIN_LENGHT))
        println("Логин или пароль недостаточно длинные")
}

fun lenghtReader(name: String): Int = name.count()
