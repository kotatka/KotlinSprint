package lesson_19

import lesson_11.Category

enum class Categories() {
    CLOATHES,
    STATIONARY,
    TOYS,
    FOOD,
}

fun getCategories(categories: Categories): String {
    when (categories) {
        Categories.CLOATHES -> return "Одежда"
        Categories.STATIONARY -> return "Канцелярские товары"
        Categories.TOYS -> return "Игрушки"
        Categories.FOOD -> return "Еда"
        else -> return "Другая категория"
    }
}


class Product(
    val name: String,
    val id: Int,
    val categories: Categories,
) {
    fun printProduct() {
        println("Название товара: $name \nid товара: $id\nКатегория товара: ${getCategories(categories)}\n")
    }
}

fun main() {
    val product1 = Product("Кепка", 1, Categories.CLOATHES)
    val product2 = Product("Пистолет", 2, Categories.TOYS)
    val product3 = Product("Апельсин", 3, Categories.FOOD)
    val product4 = Product("Карандаш", 4, Categories.STATIONARY)

    product1.printProduct()
    product2.printProduct()
    product3.printProduct()
    product4.printProduct()
}