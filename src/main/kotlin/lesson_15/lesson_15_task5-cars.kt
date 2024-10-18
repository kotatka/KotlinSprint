package lesson_15

interface CarMove {
    fun CarLoadingPassenger()
    fun CarMove()
    fun CarUnloadingPassenger()
}

interface CargoCarNewActions {
    fun CarLoadingCargo()
    fun CarUnloadingCargo()
}

abstract class Car : CarMove {
    abstract val name: String
    abstract val maxPassengers: Int
}

class PassengerCar(
    override val name: String,
    override val maxPassengers: Int = 3,
) : Car() {
    override fun CarLoadingPassenger() {
        println("Сколько человек требуется загрузить в $name?")
        val userPassengerChoise = readln().toInt()

        if (userPassengerChoise !in 0..maxPassengers)
            println("Ошибка, вы ввели некорректное количество пассажиров")
        else
            println("$name загрузила человек: $userPassengerChoise")
    }

    override fun CarMove() {
        println("$name едет.")
    }

    override fun CarUnloadingPassenger() {
        println("$name: Произведена выгрузка всех пассажиров")
    }

}

class CargoCar(
    override val name: String,
    override val maxPassengers: Int = 1,
    val maxCargo: Int = 2,
) : Car(), CargoCarNewActions {

    override fun CarLoadingPassenger() {
        println("Сколько человек требуется загрузить в $name?")
        val userPassengerChoise = readln().toInt()

        if (userPassengerChoise !in 0..maxPassengers)
            println("Ошибка, вы ввели некорректное количество пассажиров")
        else
            println("$name: произошла загрузка человек: $userPassengerChoise")
    }

    override fun CarMove() {
        println("$name едет.")
    }

    override fun CarUnloadingPassenger() {
        println("$name: Произведена выгрузка всех пассажиров")
    }


    override fun CarLoadingCargo() {
        println("Сколько тонн груза требуется загрузить в $name?")
        val userCargoChoise = readln().toInt()

        if (userCargoChoise !in 0..maxCargo)
            println("Ошибка, вы ввели некорректное количество груза")
        else println("$name: Произошла загрузка тонн груза - $userCargoChoise")

    }

    override fun CarUnloadingCargo() {
        println("$name: Произведена выгрузка всего груза")
    }
}

fun main() {
    val car1 = PassengerCar("Ласточка Дани")
    val car2 = PassengerCar("Крутая БМВ")
    val car3 = CargoCar("Камаз")

    car1.CarLoadingPassenger()
    car2.CarLoadingPassenger()
    car3.CarLoadingPassenger()
    car3.CarLoadingCargo()

    car1.CarMove()
    car2.CarMove()
    car3.CarMove()

    car1.CarUnloadingPassenger()
    car2.CarUnloadingPassenger()
    car3.CarUnloadingCargo()
    car3.CarUnloadingPassenger()
}

