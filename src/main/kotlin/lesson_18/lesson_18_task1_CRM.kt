package lesson_18

class Order {
    fun printOffer(
        numberOffer: Int,
        productOffer: String,
    ) {
        println("Заказан товар: $productOffer")
    }

    fun printOffer(
        numberOffer: Int,
        productOffer: List<String>,
    ) {
        println("Заказаны товары: $productOffer")
    }
}

fun main() {
    val order1 = Order()
    order1.printOffer(1, "Зубная щетка")
    val order2 = Order()
    order2.printOffer(2, listOf("Апельсин", "Яблоко", "Банан"))
}