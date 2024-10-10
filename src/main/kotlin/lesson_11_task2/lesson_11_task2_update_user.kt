package lesson_11_task2

fun main() {
    val user1 = User2(
        id = 1,
        login = "daniil",
        password = "asdasd",
        mail = "daniil@mail.ru"
    )

    user1.inputBio()
    user1.changePassword()
    user1.outputInformation()
}