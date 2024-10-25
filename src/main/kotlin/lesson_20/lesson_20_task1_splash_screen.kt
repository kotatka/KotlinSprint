package lesson_20

fun main() {
    val userName = "Даниил"
    val SplashScreen: () -> Unit
    SplashScreen = { println("С наступающим Новым Годом, $userName") }
    SplashScreen()
}