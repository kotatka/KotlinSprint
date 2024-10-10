package lesson_10

const val MIN_LENGHT = 4

fun main() {
    println("Введите логин")
    val userLogin = readln()

    println("Введите пароль")
    val userPassword = readln()

    val checkPassword = toCheckLenght(toReadLenght(userPassword))
    val checkLogin = toCheckLenght(toReadLenght(userLogin))

    if ((checkLogin == true) || (checkPassword == true))
        println("Логин или пароль недостаточно длинные")
}

fun toReadLenght(name: String): Int = name.count()

fun toCheckLenght(name: Int): Boolean = (name < MIN_LENGHT)

