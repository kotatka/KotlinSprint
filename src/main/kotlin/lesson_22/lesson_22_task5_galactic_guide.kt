package lesson_22

data class GalacticGuide(
    val namePlaceOrEvent:String,
    val descriptionPlaceOrEvent:String,
    val dataAndTimeEvent: String,
    val distancePlaceOrEvent: Double,
)

fun main() {
    val place1 = GalacticGuide("Альфа Центавра", "Тройная звёздная система в созвездии Центавра", "Не актуально", 4.36   )

    println("Название места или события: ${place1.component1()}")
    println("Описание места или события: ${place1.component2()}")
    println("Дата и время ивента: ${place1.component3()}")
    println("Расстояние до места или события в световых годах: ${place1.component4()}")
}