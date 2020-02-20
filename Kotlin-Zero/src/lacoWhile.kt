
fun main(args: Array<String>){

    val numeros = arrayListOf<Int>()

    var tamanho = 0
    while(numeros.size != 10){
        numeros.add(tamanho++)

        println("Tamanho ${numeros.size}")
    }
}