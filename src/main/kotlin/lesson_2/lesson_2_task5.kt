package lesson_2


fun main(){
    val sumDeposit = 70000
    val interestRate = 16.7
    val durationOfDeposite = 20
    val finalSum:Double = sumDeposit*(1+(interestRate/100))*durationOfDeposite
    println("%.3f".format(finalSum))
}