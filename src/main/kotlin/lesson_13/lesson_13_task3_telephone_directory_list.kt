package lesson_13

data class TelephoneDirectoryList(
    val nameUser: String,
    val telephoneNumber: Long,
    val nameCompany: String? = null,
) {
    fun printDirectory() {
        nameCompany ?: ("<Не указано>")
        println("Имя:$nameUser, Номер:$telephoneNumber, Компания:$nameCompany")
    }
}

fun main() {


    val listContacts = mutableListOf(
        TelephoneDirectoryList("Даня", 789456123),
        TelephoneDirectoryList("Денис", 123456789),
        TelephoneDirectoryList("Оля", 88005553535, "null"),
        TelephoneDirectoryList("Марина", 159753654, "Яндекс"),
        TelephoneDirectoryList("Ярослав", 77777777, "Сбербанк"),
    )


    val numbersCompanies = listContacts.filter { it.nameCompany != null }
    numbersCompanies.forEach { println(it) }

}