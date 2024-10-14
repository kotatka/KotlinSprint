package lesson_12

class WeatherDay5(temperatureDay: Int, temperaturesNight: Int, isPrecipitation: Boolean) {

    var temperatureDay = temperatureDay
    var temperatureNight = temperaturesNight
    var isPrecipitation = isPrecipitation

    fun printWeather() {
        println(
            """Температура днём = $temperatureDay
            |Температура ночью = $temperatureNight
            |Наличие осадков в течении суток = $isPrecipitation
        """.trimMargin()
        )
    }

    init {
        printWeather()
    }
}

fun main() {
    val day5 = WeatherDay5(22, 18, false)

}