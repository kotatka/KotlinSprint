package lesson_12

class WeatherDay3() {
    var temperatureDay: Int = 12
    var temperatureNight: Int = 9
    var inPrecipitation = false
    fun printWeather() {
        println(
            """Температура днём = ${temperatureDay - 272}
            |Температура ночью = ${temperatureNight - 272}
            |Наличие осадков в течении суток = $inPrecipitation
        """.trimMargin()
        )
    }
}

fun main() {
    val day4 = WeatherDay3()
    day4.temperatureDay = 290
    day4.temperatureNight = 282
    day4.inPrecipitation = false
    day4.printWeather()
}