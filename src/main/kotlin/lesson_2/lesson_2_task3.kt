package lesson_2

fun main(){
    val hourDeparture = 9
    val minuteDeparture = 39
    val minutesInTrip = 457
    val allMinutesArrival = hourDeparture*60 + minuteDeparture + minutesInTrip
    val hourArrival = allMinutesArrival/60
    val minuteArrival = allMinutesArrival%60
    print("%02d".format(hourArrival))
    print(":")
    print("%02d".format(minuteArrival))
}