package lesson_22

data class Cat(
    val name: String,
    val age: Int,
    val gender: String,
)

fun main() {
    val cat1 = Cat("Мурка", 10, "Женский")
    val (name1, age1, gender1) = cat1

    println("Имя - $name1")
    println("Возраст - $age1")
    println("Пол - $gender1")
}