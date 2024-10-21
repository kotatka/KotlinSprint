package lesson_15

import javax.xml.crypto.Data

abstract class WeatherStationStats {
    abstract val numDay: Int
    abstract val parametr: Any
}

data class Temperature(override val numDay: Int, override val parametr: Int) : WeatherStationStats()

data class PrecipitationAmount(override val numDay: Int, override val parametr: Boolean) : WeatherStationStats()

data class WeatherServer(
    val data: MutableList<WeatherStationStats> = mutableListOf<WeatherStationStats>()
) {
    fun linkWithServer(par: WeatherStationStats) {
        println(par)
    }
}

fun main() {
    val temperature1 = Temperature(1, 13)
    val weatheServer1 = WeatherServer(data = mutableListOf(temperature1))
    val precipitationAmount1 = PrecipitationAmount(1, true)

    weatheServer1.data.add(precipitationAmount1)

    weatheServer1.linkWithServer(temperature1)
    weatheServer1.linkWithServer(precipitationAmount1)
}

//val x = parametr::class.simpleName