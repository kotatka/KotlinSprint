package lesson_13

data class TelephoneDirectoryList6(
    val nameUser: String,
    val telephoneNumber: Long?,
    val nameCompany: String? = null,
)

fun main() {
    println("Введите имя")
    val nameUser = readln()

    println("Введите номер телефона")
    var telephoneNumberCheck: String = readln()
    var telephoneNumber: Long = 0

    try {
        telephoneNumber = telephoneNumberCheck.toLong()
    } catch (e: Exception) {
        println("Exception in thread \"main\" java.lang.NumberFormatException")
        return
    }

    println("Введите название компании")
    val nameCompany = readln()

    val user1 = TelephoneDirectoryList6(
        nameUser = nameUser,
        telephoneNumber = telephoneNumber,
        nameCompany = nameCompany,
    )

    println(user1)
}