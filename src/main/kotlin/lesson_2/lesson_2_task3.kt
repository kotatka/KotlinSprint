package lesson_2

fun main() {
    val constForTime = 60
    val hourDeparture = 9
    val minuteDeparture = 39
    val minutesInTrip = 457
    val allMinutesArrival = hourDeparture * constForTime + minuteDeparture + minutesInTrip
    val hourArrival = allMinutesArrival / constForTime
    val minuteArrival = allMinutesArrival % constForTime
    println("%02d:%02d".format(hourArrival, minuteArrival))
}