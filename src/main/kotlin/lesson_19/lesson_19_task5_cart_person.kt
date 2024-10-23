package lesson_19

enum class Gender(val gender: String) {
    MAN("Мужской"),
    WOMAN("Женский"),
    ANOTHER("Неопределенный"),
}

data class Person(
    val name: String,
    val genderPersonal: String,
)

fun main() {
    var genderPerson: Gender
    val personList = mutableListOf<Person>()
    for (i in 1..5) {
        println("Введите имя человека:")
        val namePerson = readln()
        println("Введите пол человека, доступно всего 2 выбора: \"Мужской\" или \"Женский\"")
        val userChoiceGender = readln()
        when (userChoiceGender) {
            "Мужской" -> genderPerson = Gender.MAN
            "Женский" -> genderPerson = Gender.WOMAN
            else -> genderPerson = Gender.ANOTHER

        }
        val person1 = Person(name = namePerson, genderPersonal = genderPerson.gender)
        println(person1.name)
        println(person1.genderPersonal)
        personList.add(person1)
    }
    println(personList)
}