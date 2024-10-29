package lesson_14

class ChildMessage(
    id: Int,
    message: String,
    authorName: String,
    parentId: Int?,
) : ParentMessage(id, message, authorName, parentId) {
    override fun toString(): String {
        return "    $authorName:$message"
    }
}

open class ParentMessage(
    val id: Int,
    val message: String,
    val authorName: String,
    val parentId: Int? = null,
) {
    override fun toString(): String {
        return "$authorName:$message"
    }
}

data class Chat(
    val allMessages: MutableList<ParentMessage> = mutableListOf<ParentMessage>()
) {
    fun addMessage(authorName: String, message: String) {
        val messageId = allMessages.size + 1
        allMessages.add(ParentMessage(messageId, message, authorName))
    }

    fun addThreadMessage(authorName: String, message: String, parentId: Int) {
        val messageId = allMessages.size + 1
        allMessages.add(ChildMessage(messageId, message, authorName, parentId))
    }

    fun printChat() {
        val group = allMessages.groupBy { it.parentId }
        for (i in 0..allMessages.size - 1) {
            if (i + 1 in group.keys) println("${allMessages[i]}")
            if (i + 1 in group.keys) {
                val x = group[i + 1]
                for (i in 0..x?.size!! - 1) {
                    println(x[i])
                }
            }
        }
    }
}

fun main() {
    val chat = Chat()
    chat.addMessage("Даня", "Привет")
    chat.addMessage("Дима", "Как дела, парни")
    chat.addThreadMessage("Костя", "Привет Даня", 1)
    chat.addMessage("Коля", "УРА!")
    chat.addThreadMessage("Темный Лорд", "Прив", 1)
    chat.addThreadMessage("Конь", "Тыгы-дык", 4)
    chat.addThreadMessage("Котик", "Мур", 2)
    chat.printChat()
}



