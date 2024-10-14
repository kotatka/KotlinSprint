package lesson_13

data class TelephoneDirectoryList6(
    val nameUser: String,
    val telephoneNumber: Long,
    val nameCompany: String? = null,
)

fun main() {
    println("Введите имя")
    val nameUser = readln()

    println("Введите номер телефона")
    val telephoneNumberCheck = readln()
    val result = telephoneNumberCheck.toDoubleOrNull()

    if (result == null) {
        println("Exception in thread \"main\" java.lang.NumberFormatException: For input string: \"$telephoneNumberCheck\"")
        return
    }

    val telephoneNumber = telephoneNumberCheck.toLong()

    println("Введите название компании")
    val nameCompany = readln()

    val user1 = TelephoneDirectoryList6(
        nameUser = nameUser,
        telephoneNumber = telephoneNumber,
        nameCompany = nameCompany,
    )
    println(user1)
}