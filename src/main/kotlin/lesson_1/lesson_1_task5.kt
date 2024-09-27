package lesson_1
const val FOR_TIME = 60
fun main() {
    val seconds = 6480
    val minutes = seconds / FOR_TIME
    val hour = (minutes / FOR_TIME)
    val remSeconds = seconds % FOR_TIME
    val remMinutes = minutes % FOR_TIME
    println("%02d:%02d:%02d".format(hour, remMinutes, remSeconds))

}