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
    tokenAutorization = autorization(userLogin, userPassword)
    val shopingCart = printCart(tokenAutorization)
    if (shopingCart == "null") println("Ошибка Авторизации")
    else println("Ваша корзина: $shopingCart")
}

fun autorization(login: String, password: String): String {
    var createToken = ""
    var x = 'c'
    val intervalForRand = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    if ((login == USER_LOGIN) && (password == USER_PASSWORD)) {
        for (i in 1..32) {
            x = intervalForRand.random()
            createToken += x
        }
    } else createToken = "null"
    return createToken
}

fun printCart(token: String): String {
    val shopingCart: String
    if (token != "null") shopingCart = SHOPPING_CART
    else shopingCart = "null"
    return shopingCart
}