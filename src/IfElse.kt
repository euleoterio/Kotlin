
fun main(args: Array<String>){

//    println("Digite um numero")
//    val x = readLine()?.toInt()!!
//
//    if((x % 2) == 0){
//       println("É par")
//    }else{
//        println("É impar")
//        println()
//    }


    println("Digite sua nota:")
    val x = readLine()?.toInt()!!

    if(x <= 6){
        println("Reprovado")
    }else if(x > 6){
        println("Aprovado")
    }

}