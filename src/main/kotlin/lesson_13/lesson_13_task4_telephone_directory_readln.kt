package lesson_13

data class TelephoneDirectoryList5(
    val nameUser: String,
    val telephoneNumber: Long,
    val nameCompany: String? = null,
)

data class TelephoneBook(
    val nameBook: String,
    val telephoneList: MutableList<TelephoneDirectoryList5> = mutableListOf(),
)
{
    fun printBook() {
        println(telephoneList)
    }
}

fun main() {
    val telephoneBook1 = TelephoneBook(
        nameBook = "Телефонная книга"
    )
    println("Сколько пользователей вам нужно добавить?")
    val userChoise = readln().toInt()
    for (i in 1..userChoise) {
        println("Введите имя")
        val nameUser = readln()

        println("Введите номер телефона")
        val telephoneNumber = readln().toLongOrNull()
        if (telephoneNumber == null) {
            println("Вы не ввели номер телефона")
            continue
        }

        println("Введите компанию")
        var nameCompany = readln()
        if (nameCompany.isEmpty()) nameCompany = "null"
        val newUser = TelephoneDirectoryList5(
            nameUser = nameUser,
            telephoneNumber = telephoneNumber,
            nameCompany = nameCompany,
        )
        telephoneBook1.telephoneList.add(newUser)
    }
    telephoneBook1.printBook()
}