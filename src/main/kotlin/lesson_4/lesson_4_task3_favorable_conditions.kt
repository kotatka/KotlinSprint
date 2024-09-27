package lesson_4

const val SUN_WEATHER: Boolean = true
const val OPEN_AWNING: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val BAD_SEASON: String = "winter"

fun main() {
    val weatherToday: Boolean = true
    val openAwningToday: Boolean = true
    val airHumidityToday: Int = 20
    val seasonToday: String = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(SUN_WEATHER == weatherToday) && (OPEN_AWNING == openAwningToday) && (AIR_HUMIDITY == airHumidityToday) && (BAD_SEASON != seasonToday)}")
}