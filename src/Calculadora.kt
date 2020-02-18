
fun main (args: Array<String>){

    println("Digite o valor de X:")
    val x = readLine()?.toInt()!!  // --- ? assegura que x não é nulo, só converte se a entrada do usuário não é null

    println("Digite o valor de X:")
    val y = readLine()?.toInt()!!  // --- !! considere o valor inteiro como não nulo

    val z = (x+y)

    println("Resultado = $z")
}