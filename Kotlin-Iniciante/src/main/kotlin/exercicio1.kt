fun main(){
    var text = "Vinicius"
    println("A string $text possui ${numChar(text)} caracteres")
}

fun numChar(str:String): Int{
    return str.length
}