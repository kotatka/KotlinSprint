package lesson_11

data class ForumMember(
    val userId: Int,
    val userName: String
)

data class ForumMessage(
    val authorId: Int,
    val message: String
)

data class Forum(
    val forumName: String,
    var forumMembers: MutableMap<Int, String> = mutableMapOf(),
    var forumMessages: MutableList<ForumMessage> = mutableListOf(),
    var numsMembers: Int = 0,
) {
    fun createNewUser(newNameUser: String): ForumMember {
        numsMembers++
        var id = numsMembers
        forumMembers.put(id, newNameUser)
        return ForumMember(id, newNameUser)
    }

    fun createNewMessage(inputUserId: Int, newMessage: String): ForumMessage {
        val checkUserId = forumMembers.containsKey(inputUserId)
        if (checkUserId != false) forumMessages.add(ForumMessage(inputUserId, newMessage))
        return when (checkUserId) {
            false -> throw IllegalArgumentException("Такого пользователя нет")
            else -> ForumMessage(inputUserId, newMessage)
        }
    }

    fun printThread() {
        val allIdMembers = forumMessages.map { it.authorId }.toList()
        val allMessage = forumMessages.map { it.message }.toList()
        for (i in 1..allIdMembers.size) {
            val author = forumMembers.get(key = allIdMembers[i - 1])
            println("$author: ${allMessage[i - 1]}")
        }
    }


}


fun main() {
    val forum1 = Forum(
        forumName = "Имя форума",
    )

    val userName1 = "Даня"
    forum1.createNewUser(userName1)

    val userName2 = "Степа"
    forum1.createNewUser(userName2)

    forum1.createNewMessage(1, "Привет всем")
    forum1.createNewMessage(2, "И тебе привет")

    forum1.printThread()
}
