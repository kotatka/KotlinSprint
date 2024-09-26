package lesson_3

fun main(){
    val numForTable = 5
    val multiplicationTable = """
        $numForTable*1=${numForTable*1}
        $numForTable*2=${numForTable*2}
        $numForTable*3=${numForTable*3}
        $numForTable*4=${numForTable*4}
        $numForTable*5=${numForTable*5}
        $numForTable*6=${numForTable*6}
        $numForTable*7=${numForTable*7}
        $numForTable*8=${numForTable*8}
        $numForTable*9=${numForTable*9}
    """.trimIndent()
    println(multiplicationTable)
}