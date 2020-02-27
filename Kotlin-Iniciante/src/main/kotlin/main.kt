fun main(){

    println("Hello World")

    //imutaveis
    val nome= "Vinicius"
    //mutaveis
    var idade: Int = 23
    var char: Char = 'v'

    println("Double: Max: "+ Double.MAX_VALUE + "- Double Min: " + Double.MIN_VALUE)
    println("Float: Max: "+ Float.MAX_VALUE + "- Float Min: " + Float.MIN_VALUE)
    println("Long: Max: "+ Long.MAX_VALUE + "- Long Min: " + Long.MIN_VALUE)
    println("Int: Max: "+ Int.MAX_VALUE + "- Int Min: " + Int.MIN_VALUE)
    println("Short: Max: "+ Short.MAX_VALUE + "- Short Min: " + Short.MIN_VALUE)
    println("Byte: Max: "+ Byte.MAX_VALUE + "- Byte Min: " + Byte.MIN_VALUE)


    //strings

    val frase = "Kotlin"
    val caracteristica = "show!"

    println("$frase $caracteristica")

    val text = """Kotlin facilita
        |posso utilizar dessa
        |forma e ele vai entender
        |que é um texto
    """.trimMargin()

    println(text)
}