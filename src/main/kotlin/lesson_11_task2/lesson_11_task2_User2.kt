package lesson_11_task2

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = ""
) {
    fun outputInformation() {
        println("Вывод информации пользователя: ")
        println("Логин: $login")
        println("Пароль: $password")
        println("Почта: $mail")
        println("Информация о себе: $bio")
    }

    fun inputBio() {
        println("Введите информацию о себе")
        bio = readln()
    }

    fun changePassword() {
        println("Введите ваш текующий пароль")
        val userInputPassword = readln()
        if (userInputPassword == password) {
            println("Введите новый пароль")
            password = readln()
            println("Ваш новый пароль $password")
        }
    }
}