package lesson_2

fun main(){
    val salWorker = 30000
    val salIntern = 20000
    val sumWorker = 50
    val sumIntern = 30
    val costWorker = salWorker*sumWorker
    val costAll = costWorker+salIntern*sumIntern
    val costAverage = costAll/(sumIntern+sumWorker)
    println(costWorker)
    println(costAll)
    println(costAverage)
}