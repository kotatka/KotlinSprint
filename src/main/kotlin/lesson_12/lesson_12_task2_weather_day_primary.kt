package lesson_12

class WeatherDay2(temperatureDay: Int, temperaturesNight: Int, inPrecipitation: Boolean) {
    var temperatureDay = temperatureDay
    var temperatureNight = temperaturesNight
    var inPrecipitation = inPrecipitation
    fun printWeather() {
        println(
            """Температура днём = $temperatureDay
            |Температура ночью = $temperatureNight
            |Наличие осадков в течении суток = $inPrecipitation
        """.trimMargin()
        )
    }
}

fun main() {
    val day3 = WeatherDay2(22, 13, true)
    day3.printWeather()
}