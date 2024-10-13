package lesson_11

data class Ingridient(
    val nameIngridient: String,
    val photoIngridient: String,
)

data class Recept(
    val nameRecept: String,
    val dishPhoto: String,
    var ingridientsRecept: MutableList<Ingridient> = mutableListOf(),
    var inFavorite: Boolean = false,
) {
    fun addIngridient(newIngridient: Ingridient) {
        ingridientsRecept += mutableListOf(newIngridient)
    }

    fun deleteIngridient(findNameIngridient: String) {
        val findIngridient = ingridientsRecept.find { it.nameIngridient == findNameIngridient }
        ingridientsRecept.remove(findIngridient)
    }

    fun addFavorite() {
        inFavorite = true
    }

    fun removeFavorite() {
        inFavorite = false
    }
}

data class Category(
    val nameCategory: String,
    val photoCategory: String,
    var receptsCategory: MutableList<Recept> = mutableListOf()
) {
    fun addRecept(newRecept: Recept) {
        receptsCategory += mutableListOf(newRecept)
    }

    fun deleteRecept(findNameRecept: String) {
        val findRecept = receptsCategory.find { it.nameRecept == findNameRecept }
        receptsCategory.remove(findRecept)
    }
}

fun main() {
    val ingridient1 = Ingridient(
        nameIngridient = "Курица",
        photoIngridient = "Фото курицы",
    )

    val ingridient2 = Ingridient(
        nameIngridient = "Вермишель",
        photoIngridient = "Фото вермишели",
    )

    val ingridient3 = Ingridient(
        nameIngridient = "Морковь",
        photoIngridient = "Фото моркови",
    )

    val ingridient4 = Ingridient(
        nameIngridient = "Вода",
        photoIngridient = "Фото воды",
    )

    val ingridient5 = Ingridient(
        nameIngridient = "Соль",
        photoIngridient = "Фото соли"
    )

    val recept1 = Recept(
        nameRecept = "Куриный суп",
        dishPhoto = "Фото куриного супа",
        ingridientsRecept = mutableListOf(ingridient1, ingridient2, ingridient3, ingridient4)
    )

    println(recept1)

    recept1.addFavorite()
    recept1.addIngridient(ingridient5)

    println(recept1)

    recept1.deleteIngridient("Соль")
    recept1.removeFavorite()

    println(recept1)

    val category1 = Category(
        nameCategory = "Супы",
        photoCategory = "Фото супа",
        receptsCategory = mutableListOf()
    )

    category1.addRecept(recept1)
    println(category1)
    category1.deleteRecept("Куриный суп")
    println(category1)
}

