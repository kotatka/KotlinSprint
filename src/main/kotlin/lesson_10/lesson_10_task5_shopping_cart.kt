package lesson_10

const val USER_LOGIN = "daniil"
const val USER_PASSWORD = "asdasd"
const val SHOPPING_CART = "Арбуз, Котлеты, Куриная грудка, Зажигалка, Мыло"

fun main() {
    val tokenAutorization: String
    println("Введите логин")
    val userLogin = readln()

    println("Введите пароль")
    val userPassword = readln()

    tokenAutorization = autorizate(userLogin, userPassword)

    if (tokenAutorization == "null") {
        println("Ошибка авторизации")
        return
    }

    val shopingCart = printCart(tokenAutorization)
    println(shopingCart)
}

fun autorizate(login: String, password: String): String {
    var createToken = ""

    if ((login == USER_LOGIN) && (password == USER_PASSWORD)) createToken = generateToken()
    else createToken = "null"

    return createToken
}

fun printCart(token: String): String = SHOPPING_CART

fun generateToken(): String {
    var token = ""
    var x = 'c'
    val intervalForRand = ('0'..'9') + ('a'..'z') + ('A'..'Z')

    for (i in 1..32) {
        x = intervalForRand.random()
        token += x
    }

    return token
}