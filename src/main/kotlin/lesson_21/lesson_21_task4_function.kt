package lesson_21

import java.io.File
import java.io.FileWriter

fun main() {
val file = File("textFile1")
    file.createNewFile()
    file.writeToFile("Кошечка")
    file.writeToFile("СоБаКа")
}

fun File.writeToFile(word:String) {
FileWriter(this, false).use {
    it.write(word.toLowerCase())
}
}