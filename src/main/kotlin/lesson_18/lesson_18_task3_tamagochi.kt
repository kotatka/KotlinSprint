package lesson_18

open class Animal(val name: String) {
    open fun sleep() {
        println("$name -> Спит")
    }

    open fun eat() {
        println("")
    }
}

class Fox(
    name: String,
    val food: String = "Ягоды",
) : Animal(name) {
    override fun eat() {
        println("$name -> Ест $food")
    }
}

class Dog(
    name: String,
    val food: String = "Кости",
) : Animal(name) {
    override fun eat() {
        println("$name -> Ест $food")
    }
}

class Cat(
    name: String,
    val food: String = "Рыба",
) : Animal(name) {
    override fun eat() {
        println("$name -> Ест $food")
    }
}

fun main() {
    val fox1 = Fox("Лисик")
    val dog1 = Dog("Шарик")
    val cat1 = Cat("Матроскин")

    val animals = listOf<Animal>(fox1, dog1, cat1)
    animals.forEach { it.eat() }
}