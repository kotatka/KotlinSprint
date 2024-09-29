package lesson_4

const val WEIGHT_CARGO_MIN = 35
const val WEIGHT_CARGO_MAX = 100
const val VOL_CARGO_MAX = 100

fun main() {
    val weightCargo1 = 20
    val volCargo1 = 80
    val weightCargo2 = 50
    val volCargo2 = 100
    var isAverage = (weightCargo1 > WEIGHT_CARGO_MIN) && (weightCargo1 <= WEIGHT_CARGO_MAX) && (volCargo1 < VOL_CARGO_MAX)

    println("Груз с весом $weightCargo1 кг и объемом $volCargo1 л соответствует категории 'Average':$isAverage")

    isAverage = (weightCargo2 > WEIGHT_CARGO_MIN) && (weightCargo2 <= WEIGHT_CARGO_MAX) && (volCargo2 < VOL_CARGO_MAX)

    println("Груз с весом $weightCargo2 кг и объемом $volCargo2 л соответствует категории 'Average':$isAverage")
}