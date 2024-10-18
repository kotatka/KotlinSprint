package lesson_15

abstract class User {
    abstract val nickname: String
    abstract val id: Int

    abstract fun readMessage()
    abstract fun printMessage()
}

class SimpleUser(
    override val nickname: String,
    override val id: Int,
) : User() {
    override fun readMessage() {
        println("$nickname читает сообщения.")
    }

    override fun printMessage() {
        println("$nickname отправил сообщение.")
    }
}

class AdminUser(
    override val nickname: String,
    override val id: Int,
) : User() {
    override fun readMessage() {
        println("$nickname читает сообщения.")
    }

    override fun printMessage() {
        println("$nickname отправил сообщение.")
    }

    fun deleteMessage() {
        println("$nickname удаляет сообщение")
    }
}

fun main() {
    val simpleUser1 = SimpleUser("Даниил", 2)
    val adminUser1 = AdminUser("Главный", 1)

    simpleUser1.printMessage()
    adminUser1.readMessage()
    adminUser1.printMessage()
    adminUser1.deleteMessage()
}
