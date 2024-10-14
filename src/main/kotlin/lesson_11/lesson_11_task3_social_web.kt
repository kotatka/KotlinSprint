package lesson_11

data class Member(
    val nickname: String,
    val avatar: String,
    var status: String,
)


class Room(
    val coverRoom: String,
    val nameRoom: String,
    var members: MutableList<Member> = mutableListOf(),
) {
    fun addMember(newMember: Member) {
        members.add(newMember)
    }

    fun changeStatusMember(nicknameMember: String, newStatus: String) {
        val findMember = members.find { it.nickname == nicknameMember }
        findMember?.status = newStatus
    }
}

fun main() {
    val member1 = Member(
        nickname = "Даниил",
        avatar = "Фото Даниила",
        status = "Выключен микрофон",
    )

    val member2 = Member(
        nickname = "Тёмный Лорд",
        avatar = "Фото тёмного лорда",
        status = "Говорит",
    )

    val member3 = Member(
        nickname = "Токсичный тип",
        avatar = "Противное фото",
        status = "Говорит"
    )


    val room1 = Room(
        coverRoom = "Фото с пони",
        nameRoom = "Сообщество любителей пони",
        members = mutableListOf(member1)
    )
    println(room1.members)
    room1.addMember(member2)
    println(room1.members)

    room1.addMember(member3)
    room1.changeStatusMember("Токсичный тип", "Заблокирован")

    println(room1.members)
}

