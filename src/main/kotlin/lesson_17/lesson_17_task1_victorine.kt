package lesson_17

class Victorine {
    val question = "Как зовут Пушкина?"
        get() = field
    var answer = "Александр"
        get() = field
        set(value: String) {
            field = value
        }
}

fun main() {
    val question1 = Victorine()

    println(question1.question)
    println(question1.answer)
}