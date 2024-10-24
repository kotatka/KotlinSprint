package lesson_21

fun String.vovelCount(x: String): Int {
    val vovels = charArrayOf('a', 'e', 'u', 'i', 'o', 'y')
    val xChars = x.toCharArray()
    var vovelNums = 0
    xChars.forEach { if (it in vovels) vovelNums++ }
    return vovelNums
}

fun main() {
    val string = "hello"
    val vovelNums = string.vovelCount(string)
    println(vovelNums)
}