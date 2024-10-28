package lesson_20

data class Robot(
    val name: String,
    val phrases: MutableList<String> = mutableListOf("Привет", "Как дела", "Пока", "Что делаешь", "Чмок"),
    val reversePhrases: MutableList<String> = mutableListOf("Привет", "Как дела", "Пока", "Что делаешь", "Чмок"),
) {
    fun say() {
        println(reversePhrases.random())
    }

    fun setModifier(lyambda: (String) -> String) {
        for (i in 0..phrases.size - 1) {
            reversePhrases[i] = lyambda(phrases[i])
        }
    }
}

fun main() {
    val robot1 = Robot("Жорик")

    val reverseWord: (String) -> String
    reverseWord = {
        var x: String = ""
        val newPhrase = it.split("")
        for (i in it.length downTo 1) {
            x += newPhrase[i]
        }
        x
    }
    robot1.say()
    robot1.setModifier(reverseWord)
    robot1.say()
}



