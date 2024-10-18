package lesson_15

interface Fly {
    fun takeOf()
    fun fly()
    fun landing()
}

interface Swim {
    fun swim()
}

class Fish(val name: String) : Swim {
    override fun swim() {
        println("$name плывет.")
    }
}

class Bird(val name: String) : Fly {
    override fun takeOf() {
        println("$name взлетает.")
    }

    override fun fly() {
        println("$name летит.")
    }

    override fun landing() {
        println("$name садится.")
    }
}

class SwimBird(val name: String) : Fly, Swim {
    override fun takeOf() {
        println("$name взлетает.")
    }

    override fun fly() {
        println("$name летит.")
    }

    override fun landing() {
        println("$name садится.")
    }

    override fun swim() {
        println("$name плывет.")
    }
}

fun main() {
    val fish1 = Fish("Карась")
    val bird1 = Bird("Чайка")
    val swimBird1 = SwimBird("Утка")

    fish1.swim()

    bird1.takeOf()
    bird1.fly()
    bird1.landing()

    swimBird1.swim()
    swimBird1.takeOf()
    swimBird1.fly()
    swimBird1.landing()
    swimBird1.swim()
}
