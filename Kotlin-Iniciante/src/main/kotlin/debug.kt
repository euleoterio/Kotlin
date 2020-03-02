fun meuNome(nome: String){
    println("Olá, $nome!")
}

fun meuNomeIdade(nome: String, idade: Short){
   println("Olá, $nome! Tenho $idade anos.")
}

fun letraIndice(nome: String, indice: Int): Char{
    return nome[indice]
}

fun main(){
    meuNome("Vinicius")
    meuNomeIdade("Vinicius", 23)
    letraIndice("Vinicius", 0)

    val str = "asd"
    //str.toInt()
}