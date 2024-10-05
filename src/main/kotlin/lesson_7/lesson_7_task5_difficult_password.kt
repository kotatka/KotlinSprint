package lesson_7

const val MIN_PASSWORD_LENGHT = 6

fun main() {
    val randSimvols1 = ('A'..'Z')
    val randSimvols2 = ('a'..'z')
    val randSimvols3 = ('0'..'9')
    val randSimvols = randSimvols1 + randSimvols2 + randSimvols3
    println(randSimvols)
    val sizeRandSimvols = randSimvols.size - 1

    var userMaxLength: Int
    var userPassword = ""

    var x: Char
    var parSim1:Int
    var parSim2:Int
    var parSim3:Int

    do {
        println("Задайте длину пароля, минимальная длина - 6 символов")
        userMaxLength = readln().toInt()
    } while (userMaxLength < MIN_PASSWORD_LENGHT)

    do {
        parSim1 = 0
        parSim2 = 0
        parSim3 = 0
        userPassword = ""

        for (i in 1..userMaxLength) {
            x = randSimvols[(0..sizeRandSimvols).random()]
            userPassword = userPassword + x

            if (x in randSimvols1) parSim1++
            else if (x in randSimvols2) parSim2++
            else parSim3++
        }
    } while ((parSim1 == 0) || (parSim2 == 0) || (parSim3 == 0))

    println(userPassword)
}