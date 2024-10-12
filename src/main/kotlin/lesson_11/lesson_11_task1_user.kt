package lesson_11

fun main() {

    val user1 = User(
        id = 1,
        login = "daniil",
        password = "asdasd",
        mail = "daniil@mail.ru",
    )

    val user2 = User(
        id = 2,
        login = "kristina",
        password = "dsadsa",
        mail = "kristina@gmail.com",
    )

    println("Данные user1:")

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)

    println()

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)