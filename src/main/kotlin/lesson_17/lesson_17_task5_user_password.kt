package lesson_17

class User(login: String, password: String) {
    var login = login
        get() = field
        set(value) {
            if (value != field) {
                println("Успешная смена логина")
                field = value
            }
        }
    var password = password
        get() = field.replaceRange(startIndex = 0, endIndex = field.length, replacement = "*".repeat(field.length))
        set(value) {
            if (value != field) println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user1 = User("Даниил", "asdasd")
    println(user1.login)
    println(user1.password)

    user1.login = "Даня"
    user1.password = "qweasdzxcasdq"

    println(user1.login)
    println(user1.password)
}