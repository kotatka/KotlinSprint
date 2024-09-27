package lesson_1
const val For_Time = 60
fun main() {
    val seconds = 6480
    val minutes = seconds / For_Time
    val hour = (minutes / For_Time)
    val remSeconds = seconds % For_Time
    val remMinutes = minutes % For_Time
    println("%02d:%02d:%02d".format(hour, remMinutes, remSeconds))

}