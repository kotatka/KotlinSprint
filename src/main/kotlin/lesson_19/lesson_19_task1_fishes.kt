package lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    print("Рыбы, которые вы можете добавить в свой аквариум: ")
    for (i in Fish.entries) print("$i, ")
}