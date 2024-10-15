package lesson_13

data class TelephoneDirectory(
    val nameUser: String,
    val telephoneNumber: Long,
    val nameCompany: String?,
)

fun main() {
    val telephone1 = TelephoneDirectory(
        nameUser = "Даниил",
        telephoneNumber = 77777777,
        nameCompany = null,
    )

    println(telephone1)
}