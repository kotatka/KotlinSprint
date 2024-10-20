package lesson_16

class Order(
    val numberOrder: Int,
    private var statusOrder: String = "Заказ создан",
) {
    fun applicationToTheManager(newStatus: String) {
        statusOrder = newStatus
    }

}

fun main() {
    val order1 = Order(1)
    order1.applicationToTheManager("Заказ в работе")
}