package lesson_4

const val IS_DAMAGE_SHIP = false
const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val QUANTITY_OF_PROVISIONS = 50
const val IS_FAVORABLE_WEATHER = true

fun main() {
    println("Укажите, есть ли у корабля повреждения. 'true' - если есть, 'false' - если нет")
    val isDamageShip = readln().toBoolean()

    println("Укажите количество экипажа")
    val numberOfCrew = readln().toInt()

    println("Укажите количество ящиков провизии")
    val quantityOfProvisions = readln().toInt()

    println("Укажите благоприятность метеусловий.  'true' - если благоприятнаые, 'false' - если неблагопирятные")
    val isFavorableWeather = readln().toBoolean()

    println(
        "Готовность корабля к плаванию:" +
                "${
                    ((isDamageShip == IS_DAMAGE_SHIP) && (numberOfCrew <= MAX_NUMBER_OF_CREW) && (numberOfCrew >= MIN_NUMBER_OF_CREW) &&
                            (quantityOfProvisions > QUANTITY_OF_PROVISIONS) && (isFavorableWeather == IS_FAVORABLE_WEATHER)) ||
                            ((numberOfCrew == MAX_NUMBER_OF_CREW) && (isFavorableWeather == IS_FAVORABLE_WEATHER) && (quantityOfProvisions > QUANTITY_OF_PROVISIONS))
                }"
    )
}