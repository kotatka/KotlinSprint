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
    var forumMembers: MutableList<ForumMember> = mutableListOf(),
    var forumMessages: MutableList<ForumMessage> = mutableListOf(),
) {
    fun createNewUser(newNameUser: String): ForumMember {
        var id = 0
        var findId: ForumMember?
        do {
            id++
            findId = forumMembers.find { it.userId == id }
        } while (findId != null)

        forumMembers.add(ForumMember(id, newNameUser))
        return ForumMember(id, newNameUser)
    }

    fun createNewMessage(inputUserId: Int, newMessage: String): ForumMessage {
        val checkUserId = forumMembers.find { it.userId == inputUserId }
        if (checkUserId != null) forumMessages.add(ForumMessage(inputUserId, newMessage))
        return when (checkUserId) {
            null -> throw IllegalArgumentException("Такого пользователя нет")
            else -> ForumMessage(inputUserId, newMessage)
        }
    }


}


fun main() {
    val userName1 = "Даня"
    val forum1 = Forum(
        forumName = "Имя форума",
    )

    forum1.createNewUser(userName1)
    println(forum1.forumMembers)

    val userName2 = "Степа"

    forum1.createNewUser(userName2)
    println(forum1.forumMembers)

    forum1.createNewMessage(1, "Привет всем")
    println(forum1.forumMessages)
}