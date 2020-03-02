fun endereco(rua: String = "", cidade: String, estado: String, cep: String, numero: Int = 0) { //valores podem não existir na chamada
    println("Rua: $rua, $numero")
    println("Cidade: $cidade, $estado - $cep")
}

fun media(vararg notas: Float){ //não limita a quantidade de notas

    if(notas.isNotEmpty()){
        var soma = 0f

        for(nota in notas){
            soma += nota
        }
        println("A média é: ${soma/notas.size}")
    }

}

fun <T> media(vararg valores: T){

    for (valor in valores){
        println(valor)
    }
}
fun main(){
    //endereco(cidade = "Poa", estado = "RS", cep = "123")

    //media(8f,9f,7f)
    //media(8.4f,9f,7f)

    media(1,4f,"", false, "c")
}