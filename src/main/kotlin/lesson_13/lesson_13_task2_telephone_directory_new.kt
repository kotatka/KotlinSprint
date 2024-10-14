package lesson_13

data class TelephoneDirectoryNew(
    val nameUser: String,
    val telephoneNumber: Long,
    val nameCompany: String? = null,
)
{
   fun printDirectory() {
       if (nameCompany==null) println("Имя:$nameUser, Номер:$telephoneNumber, Компания:<Не указано>")
       else println("Имя:$nameUser, Номер:$telephoneNumber, Компания:$nameCompany")
   }
}

fun main() {
    val telephoneUser4 = TelephoneDirectoryNew(
        nameUser = "Дима",
        telephoneNumber = 12121212,
    )
    val telephoneUser16 = TelephoneDirectoryNew(
        nameUser = "Влад",
        telephoneNumber = 14151621,
        nameCompany = "ГазПром",
    )
    telephoneUser4.printDirectory()
    telephoneUser16.printDirectory()
}