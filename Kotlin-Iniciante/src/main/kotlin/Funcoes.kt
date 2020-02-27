fun main(){

    val a = 10.0
    val b = 20.0
    val c = 30.0


    calcula(a,b,c)

    println(hello("Vinicius"))
    println(soma(a,b))
    println(sub(a,b))
}


fun calcula(a: Double, b: Double, c: Double){
    println("O calculo e: ${a+b*c*2}")

}

fun hello(nome: String): String{
    return "Olá, $nome"
}

fun soma(a:Double, b:Double) = a + b
fun sub(a:Double, b:Double) = a - b