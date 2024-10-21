package lesson_16

class Order(
    val numberOrder: Int,
    private var statusOrder: String = "Заказ создан",
) {
    private fun changeStatus(newStatus: String) {
        statusOrder = newStatus
    }

    fun applicationToTheManager(newStatus: String) {
        changeStatus(newStatus)
    }
}

fun main() {
    val order1 = Order(1)
    order1.applicationToTheManager("Заказ в работе")
}