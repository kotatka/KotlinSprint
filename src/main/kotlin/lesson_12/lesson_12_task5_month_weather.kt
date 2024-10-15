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

    for (i in 1..30) {
        var newDay = WeatherDay6(
            temperatureDay = (20..30).random(),
            temperatureNight = (10..20).random(),
            isPrecipitation = Random.nextBoolean()
        )
        monthWeather.add(newDay)
    }

    val allDayTemperatures: List<Int> = monthWeather.map { it.temperatureDay }
    val allNightTemperatures: List<Int> = monthWeather.map { it.temperatureNight }.toList()
    val allIsPrecipitation: List<Boolean> = monthWeather.map { it.isPrecipitation }.toList()
    val allTruePrecipitation: List<Boolean> = allIsPrecipitation.filter { it == true }

    println("Средняя температура днём: ${allDayTemperatures.average()}")
    println("Средняя температура ночью: ${allNightTemperatures.average()}")
    println("Количество дней с осадками: ${allTruePrecipitation.size}")

}