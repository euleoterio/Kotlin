import java.util.*

fun main(args: Array<String>){

    //String[] paises = new String[] -- java
    val paises = arrayOf("Angola","Brasil", "Chile", "EUA")
    //val Paises = Array( 12, {3})

    val item = paises[2]

    println(paises[0])
    println(item)

    val tamanho = paises.count()
    println(tamanho)


    paises.reverse()
    paises.forEach {
        println("$it")
    }

    paises.sortBy { it.length } //ordena por tamanho, numero caracter
    paises.forEach {
        println("$it")
    }

    val Posicao = Arrays.binarySearch(paises, "Chile")
    println("Chile esta na posicao: $Posicao")

    val posicao = Arrays.binarySearch(paises, "Brasil")
    paises[posicao] = "BRASIL"
    println(paises[posicao])

}