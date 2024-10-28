package lesson_21

fun main() {
    val skills = mapOf("Сила" to 100, "Ловкость" to 99, "Интеллект" to 96, "Выносливость" to 112)
    val maxCategory = skills.maxCategory()
    println("Сильнейшая характеристика - $maxCategory")
}

fun Map<String, Int>.maxCategory(): String {
    val maxCategory = this.maxByOrNull { (_, value) -> value }
    return maxCategory!!.key
}