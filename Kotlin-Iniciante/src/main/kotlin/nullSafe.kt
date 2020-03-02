fun main(){

    val str: String? = null // String? pode ser vazia
    println(str?.length) // tratamento para acesso tem que levar o ?

    if(str != null)
        println(str.length) // vai sem ?, porque já fiz uma validação != null

    println(str!!.length) // !!  -- "assume o risco de erro"

    //Test().meuNome() // chamada para testar em java
}