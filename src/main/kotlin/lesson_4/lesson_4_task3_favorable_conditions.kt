package lesson_4

const val IS_SUN_WEATHER: Boolean = true
const val IS_OPEN_AWNING: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val BAD_SEASON: String = "winter"

fun main() {
    val isSunny: Boolean = true
    val isOpenAwningToday: Boolean = true
    val airHumidityToday: Int = 20
    val seasonToday: String = "winter"
    val isTrueCondiditon = (IS_SUN_WEATHER == isSunny) && (IS_OPEN_AWNING == isOpenAwningToday) &&
            (AIR_HUMIDITY == airHumidityToday) && (BAD_SEASON != seasonToday)

    println("Благоприятные ли условия сейчас для роста бобовых? $isTrueCondiditon")
}