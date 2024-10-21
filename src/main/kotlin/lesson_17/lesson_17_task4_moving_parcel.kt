package lesson_17

class Parcel(val number: Int, location: String) {
    var movingNums: Int = 0
    var location: String = location
        get() = field
        set(value) {
            if (value != field) {
                movingNums++
                field = value
            }
        }
}

fun main() {
    val parcel1 = Parcel(1, "Москва")
    println(parcel1.movingNums)
    println(parcel1.location)

    parcel1.location = "Санкт-Петербург"
    println(parcel1.movingNums)
    println(parcel1.location)

    parcel1.location = "Воронеж"
    println(parcel1.movingNums)
    println(parcel1.location)

    parcel1.location = "Воронеж"
    println(parcel1.movingNums)
    println(parcel1.location)

    parcel1.location = "Санкт-Петербург"
    println(parcel1.movingNums)
    println(parcel1.location)
}
