package lesson_13

data class TelephoneDirectoryList5(
    val nameUser: String,
    val telephoneNumber: Long,
    val nameCompany: String? = null,
)

fun printBook(nameBook: MutableList<TelephoneDirectoryList5>) {
    println(nameBook)
}

fun main() {
    val telephoneBook: MutableList<TelephoneDirectoryList5> = mutableListOf()
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
        if (nameCompany?.length == 0) nameCompany = "null"
        val newUser = TelephoneDirectoryList5(
            nameUser = nameUser,
            telephoneNumber = telephoneNumber,
            nameCompany = nameCompany,
        )
        telephoneBook.add(newUser)
    }
    printBook(telephoneBook)
}