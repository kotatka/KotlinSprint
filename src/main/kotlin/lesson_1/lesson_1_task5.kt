package lesson_1

fun main() {
    val constForTime = 60
    val seconds = 6480
    val minutes = seconds / constForTime
    val hour = (minutes / constForTime)
    val remSeconds = seconds % constForTime
    val remMinutes = minutes % constForTime
    println("%02d:%02d:%02d".format(hour, remMinutes, remSeconds))

}