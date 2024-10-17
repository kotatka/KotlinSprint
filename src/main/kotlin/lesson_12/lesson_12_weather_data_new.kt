package lesson_12

const val FROM_K_TO_C = 273

class WeatherDay3(temperatureDay: Int, temperatureNight: Int, isPrecipitation: Boolean) {
    val temperatureDay = temperatureDay - FROM_K_TO_C
    val temperatureNight = temperatureNight - FROM_K_TO_C
    val isPrecipitation = isPrecipitation
    fun printWeather() {
        println(
            """Температура днём = $temperatureDay
            |Температура ночью = $temperatureNight
            |Наличие осадков в течении суток = $isPrecipitation
        """.trimMargin()
        )
    }
}

fun main() {
    val day4 = WeatherDay3(290, 280, true)
    day4.printWeather()
}