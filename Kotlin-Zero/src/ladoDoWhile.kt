
fun main(args: Array<String>){

    val numeros = arrayListOf<Int>()

    var tamanho = 0

    do{
        numeros.add(tamanho++)

        println("Tamanho ${numeros.size}")
    }while(numeros.size != 10)
}