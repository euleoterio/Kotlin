fun main(){

    var valor= 9
    val str = if (valor == 10) "Sim" else "Não"

    println(str)

    //Operador Elvis ?:
    val test: Int? = null
    val op: Int = test ?: 100 //se for nula, recebe 100

    println(op)
}