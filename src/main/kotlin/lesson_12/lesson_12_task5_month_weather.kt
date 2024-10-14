package lesson_12

import kotlin.random.Random

data class WeatherDay6(
    val temperatureDay: Int,
    val temperatureNight: Int,
    val isPrecipitation: Boolean
) {

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
    val monthWeather: MutableList<WeatherDay6> = mutableListOf()
    val allDayTemperatures: MutableList<Int> = mutableListOf()
    val allNightTemperatures: MutableList<Int> = mutableListOf()
    val allInPrecipitation: MutableList<Boolean> = mutableListOf()

    for (i in 1..30) {
        var newDay = WeatherDay6(
            temperatureDay = (20..30).random(),
            temperatureNight = (10..20).random(),
            isPrecipitation = Random.nextBoolean()
        )
        monthWeather.add(newDay)
        allDayTemperatures.add(newDay.temperatureDay)
        allNightTemperatures.add(newDay.temperatureNight)
        allInPrecipitation.add(newDay.isPrecipitation)
    }

    val averageDayTemperature = allDayTemperatures.average()
    val averageNightTemperature = allNightTemperatures.average()
    val allPrecipitation = allInPrecipitation.filter { it == true }

    println(averageDayTemperature)
    println(averageNightTemperature)
    println(allPrecipitation.size)

}