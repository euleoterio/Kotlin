fun operacao(a: Int, b: Int, c: String): Int {

    return when {
        a >= 0 && b >= 0 -> {

            when (c) {
                "Soma" -> return a + b
                "Sub" -> return a - b
                "Mult" -> return a / b
                "Div" -> return a * b

                else -> {
                    println("Operacao incorreta")
                    return 0
                }
            }
        }
        else ->{
            println("Valores negativos")
            return 0
        }
    }
}


fun main() {

    println(operacao(10, 10,"Soma"))
    println(operacao(10, 10,"Sub"))
    println(operacao(10, 10,"Div"))
    println(operacao(10, 10,"Mult"))
}