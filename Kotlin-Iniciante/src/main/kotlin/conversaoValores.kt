import java.lang.NumberFormatException

fun teste(n1: Int) {

}

fun main() {

    val n1: Double = Double.MAX_VALUE
    val b1: Byte = 100

    println(b1.toShort())
    println(b1.toLong())
    println(b1.toFloat())
    println(b1.toDouble())

    println("19".toInt())
    println("19".toFloat())
    println("19".toDouble())


    try {
        println("String".toInt())
    } catch (e: NumberFormatException) {
        println("Esse valor não é um número")
    } catch (e: Exception) {
        println("Algo de errado ocorreu")
    } finally {
        println("Sempre executa o finally, dando erro ou não")
    }


}