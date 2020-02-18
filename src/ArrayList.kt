
fun main(args: Array<String>){

    val cores = arrayListOf<String>("vermelha","branca")

    cores.add("azul")
    cores.add("roxa")

    cores.forEach{
        println(it)
    }

    println("")
    cores.remove("branca")
    cores.forEach{
        println(it)
    }

    val tamanho = cores.size
    println(tamanho)

    cores.addAll(arrayOf("a", "b")) // add conjunto de dados
    cores.forEach{
        println(it)
    }

    println()
    val ultimoItem = cores.last() //cores[cores.size-1]
    println(ultimoItem)

}