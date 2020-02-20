import java.util.*

fun main(args: Array<String>){

    println("Digite um palpite: ")
    val palpite = readLine()?.toInt()!!

    val random = Random()
    val dado = random.nextInt( 6)+1 //limita de 0 a 5 e soma 1

    println("Palpite: $palpite")
    println("Dado: $dado")

    when(palpite == dado){ //retorna true ou false
        true -> println("Acertou")
        false -> println("Errou")
    }
}