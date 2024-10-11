package lesson_10

fun main() {
    println("Введите длину пароля, которая вам нужна")
    val lengthPassword = readln().toInt()
    val userPassword = generatePassword(lengthPassword)
    println(userPassword)
}

fun generatePassword(lenght: Int): String {
    val nums = ('0'..'9')
    val simbols = (' '..'/')
    var password = ""
    var x: Char

    for (i in 1..lenght) {
        if (i % 2 == 0) {
            password += simbols.random()

        } else {

            x = nums.random()
            password += x

        }
    }
    return password
}