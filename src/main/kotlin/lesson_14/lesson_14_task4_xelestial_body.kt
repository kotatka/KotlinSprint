package lesson_14

open class CelestialBody(
    val name: String,
)

class Planet(
    name: String,
    val isLanding: Boolean,
    val isAtmosphere: Boolean,
    val sputniks: MutableList<Sputnik> = mutableListOf(),
) : CelestialBody(name)

class Sputnik(
    name: String,
    val isLanding: Boolean,
    val isAtmosphere: Boolean,
) : CelestialBody(name)

fun main() {
    val sputnik1 = Sputnik(
        name = "Луна",
        isLanding = false,
        isAtmosphere = false,
    )
    val sputnik2 = Sputnik(
        name = "Элпис",
        isLanding = true,
        isAtmosphere = false,
    )
    val planet1 = Planet(
        name = "Пандора",
        isLanding = true,
        isAtmosphere = true,
        sputniks = mutableListOf(sputnik1, sputnik2)
    )

    println("Планета ${planet1.name} и её спутники: ${planet1.sputniks.map { it.name }}")
}