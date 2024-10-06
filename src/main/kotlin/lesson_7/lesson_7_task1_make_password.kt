package lesson_7

fun main() {

    var generatePassword = ""

    for (i in 1..6) {
        if ((i % 2) == 0) generatePassword = generatePassword + ('a'..'z').random()
        else generatePassword = generatePassword + (0..9).random()
    }
    println(generatePassword)
}