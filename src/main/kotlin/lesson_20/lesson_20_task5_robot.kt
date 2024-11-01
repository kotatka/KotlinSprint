package lesson_20

data class Robot(
    val name: String,
    val phrases: MutableList<String> = mutableListOf("Привет", "Как дела", "Пока", "Что делаешь", "Чмок"),
    var setModify: Boolean = false,
) {
    fun say(lyambda: (String) -> String) {
        var phrase = phrases.random()
        if (setModify == false) println(phrase)
        else println(lyambda(phrase))
    }

    fun setModifier() {
        if (setModify == false) setModify = true
        else setModify = false
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
    robot1.say(reverseWord)
    robot1.setModifier()
    robot1.say(reverseWord)
}



