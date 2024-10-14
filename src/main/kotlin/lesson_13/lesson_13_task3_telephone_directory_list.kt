package lesson_13

data class TelephoneDirectoryList(
    val nameUser: String,
    val telephoneNumber: Long,
    val nameCompany: String? = null,
) {
    fun printDirectory() {
        if (nameCompany == null) println("Имя:$nameUser, Номер:$telephoneNumber, Компания:<Не указано>")
        else println("Имя:$nameUser, Номер:$telephoneNumber, Компания:$nameCompany")
    }
}

fun main() {
    val telephoneUser1 = TelephoneDirectoryList(
        nameUser = "Даня",
        telephoneNumber = 789456123,
    )
    val telephoneUser2 = TelephoneDirectoryList(
        nameUser = "Денис",
        telephoneNumber = 123456789,
    )
    val telephoneUser3 = TelephoneDirectoryList(
        nameUser = "Оля",
        telephoneNumber = 88005553535,
        nameCompany = "\"null\""
    )
    val telephoneUser4 = TelephoneDirectoryList(
        nameUser = "Марина",
        telephoneNumber = 159753654,
        nameCompany = "Яндекс",
    )
    val telephoneUser5 = TelephoneDirectoryList(
        nameUser = "Ярослав",
        telephoneNumber = 77777777,
        nameCompany = "Сбербанк",
    )

    val listContacts =
        listOf<TelephoneDirectoryList>(telephoneUser1, telephoneUser2, telephoneUser3, telephoneUser4, telephoneUser5)
    println(listContacts)
}