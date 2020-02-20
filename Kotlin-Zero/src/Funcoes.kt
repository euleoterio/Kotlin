
fun main(args: Array<String>){

    val resultado = somar(10,9)
    println("Resultado = $resultado")

    val result = sub(10,9)
    println("Resultado = $result")

    val resultados = mult(10,9)
    println("Resultado = $resultados")

}


//fun somar(x: Int, y: Int): Int{
//    return x+y
//}

fun somar(x: Int, y: Int) = x+y
fun mult(x: Int, y: Int)= x*y
fun sub(x: Int, y: Int) = x-y