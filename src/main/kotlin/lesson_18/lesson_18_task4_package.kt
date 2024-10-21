package lesson_18

open class Package(val length:Int){
   open fun areaCalculated():Int = length*length*6
}

class rectangularPackage(
    length: Int,
    val width: Int,
    val height: Int,
): Package(length){
    override fun areaCalculated(): Int = (2*length*width)+(2*length*height)+(2*width*height)
}

fun main() {
    val package1 = Package(5)
    val package2 = rectangularPackage(5,6,6)

    val area1 = package1.areaCalculated()
    val area2 = package2.areaCalculated()

    println("Площадь первой посылки: $area1")
    println("Площадь второй посылки: $area2")
}