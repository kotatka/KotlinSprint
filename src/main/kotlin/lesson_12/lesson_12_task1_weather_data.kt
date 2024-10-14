package lesson_12

class WeatherDay {
    var temperatureDay = 0
    var temperatureNight = 0
    var isPrecipitation = false
    fun printWeather() {
        println(
            """Температура днём = $temperatureDay
            |Температура ночью = $temperatureNight
            |Наличие осадков в течении суток $isPrecipitation
        """.trimMargin()
        )
    }
}

fun main() {
    val day1 = WeatherDay()
    day1.temperatureDay = 22
    day1.temperatureNight = 12
    day1.isPrecipitation = false

    val day2 = WeatherDay()
    day2.temperatureDay = 16
    day2.temperatureNight = 8
    day2.isPrecipitation = true

    day1.printWeather()
    day2.printWeather()
}
