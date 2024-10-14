package lesson_12

const val FROM_K_TO_C = 273

class WeatherDay3 {
    var temperatureDay: Int = 12
    var temperatureNight: Int = 9
    var isPrecipitation = false
    fun printWeather() {
        println(
            """Температура днём = ${temperatureDay}
            |Температура ночью = ${temperatureNight}
            |Наличие осадков в течении суток = $isPrecipitation
        """.trimMargin()
        )
    }
}

fun main() {
    val day4 = WeatherDay3()
    day4.temperatureDay = 290 - FROM_K_TO_C
    day4.temperatureNight = 282 - FROM_K_TO_C
    day4.isPrecipitation = false
    day4.printWeather()
}