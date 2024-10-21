package lesson_16

class User(
    val nickName: String = "",
    private val userPassword: String = "",
) {
    fun validate(password: String): Boolean = (password == userPassword)
}

fun main() {
    val user1 = User("Daniil", "asdasd")

    println("Введите пароль")
    val inputPassword = readln()

    val checkPass = user1.validate(inputPassword)
    println("Верность пароля: $checkPass")
}