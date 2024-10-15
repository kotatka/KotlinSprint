package lesson_12

const val FROM_K_TO_C = 273

class WeatherDay3(temperatureDay: Int, temperatureNight: Int, isPrecipitation: Boolean) {
    val temperatureDay = temperatureDay
    val temperatureNight = temperatureNight
    val isPrecipitation = isPrecipitation
    val temperatureDayCel = temperatureDay - FROM_K_TO_C
    val temperatureNightCel = temperatureNight - FROM_K_TO_C
    fun printWeather() {
        println(
            """Температура днём = $temperatureDayCel
            |Температура ночью = $temperatureNightCel
            |Наличие осадков в течении суток = $isPrecipitation
        """.trimMargin()
        )
    }
}

fun main() {
    val day4 = WeatherDay3(290, 280, true)
    day4.printWeather()
}