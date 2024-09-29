package lesson_2

const val PERCENT_CONST1 = 100

fun main() {
    val sumDeposit = 70000
    val interestRate = 16.7
    val durationOfDeposite = 20
    val finalSum: Double = sumDeposit * (1 + (interestRate / PERCENT_CONST1)) * durationOfDeposite

    println("%.3f".format(finalSum))
}