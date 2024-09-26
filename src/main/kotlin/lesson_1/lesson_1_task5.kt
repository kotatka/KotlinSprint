package lesson_1

fun main(){
    val seconds = 6480
    var minutes = seconds/60
    var hour = (minutes/60)
    var remSeconds = seconds%60
    var remMinutes = minutes%60
    print("%02d".format(hour))
    print(":")
    print("%02d".format(remMinutes))
    print(":")
    print("%02d".format(remSeconds))

}