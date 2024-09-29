package lesson_5

const val LOGIN_OF_AUTARIZATION: String = "Zaphod"
const val PASSWORD_OF_AUTARIZATION: String = "PanGalactic"

fun main() {
    println(
        """
Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold".
 [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.
  Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. 
  [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные...""".trimMargin()
    )

    println("Введите Login")
    val userLogin = readln().toString()
    println("Введите пароль")
    val userPassword = readln().toString()

    val checkLogin: Boolean = if (userLogin == LOGIN_OF_AUTARIZATION) true
    else false
    val checkPassword: Boolean = if (userPassword == PASSWORD_OF_AUTARIZATION) true
    else false

    if ((checkLogin == true) && (checkPassword == true))
        println(
            """[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь "Zaphod",
            | вам разрешено входить на борт корабля "Heart of Gold". Хотя мне всё равно... 
            | Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] 
            | Надеюсь, вам понравится пребывание здесь больше, чем мне.""".trimMargin()
        )
    else println("Неверные данные, попробуйте снова")
}