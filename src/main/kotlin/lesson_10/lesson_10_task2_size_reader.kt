package lesson_10

const val MIN_LENGHT = 4

fun main() {
    println("Введите логин")
    val userLogin = readln()

    println("Введите пароль")
    val userPassword = readln()

    val loginLenght = lenghtReader(userLogin)
    val passwordLenght = lenghtReader(userPassword)

    val checkPassword = lengtchCheck(passwordLenght)
    val checkLogin = lengtchCheck(loginLenght)

    if ((checkLogin == true) || (checkPassword == true))
        println("Логин или пароль недостаточно длинные")
}

fun lenghtReader(name: String): Int = name.count()

fun lengtchCheck(name: Int): Boolean {
    val resultCheck = (name < MIN_LENGHT)
    return resultCheck
}
