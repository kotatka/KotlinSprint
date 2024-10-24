package lesson_21

fun main() {
    val skills = mapOf("Сила" to 100, "Ловкость" to 99, "Интеллект" to 96, "Выносливость" to 112)
    val maxCategory = skills.maxCategory(skills)
    println("Сильнейшая характеристика - $maxCategory")
}

fun Map<String, Int>.maxCategory(x: Map<String, Int>): String {
    val sortedMap = x.toList().sortedByDescending { (_, value) -> value }.toMap()
    val sortedKeys = sortedMap.keys.toList()
    val maxCategory = sortedKeys[0]
    return maxCategory
}





