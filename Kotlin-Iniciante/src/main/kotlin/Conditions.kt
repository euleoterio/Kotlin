fun calculaBonus(cargo: String, salario: Float): Float {

    return if (cargo == "Coordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente Junior") {
        salario * 0.5f
    } else {
        salario * 2
    }
}

//fun maiorDeIdade(idade: Int): Boolean {
//    return idade >= 18
//}

fun main() {

    println(calculaBonus("Coordenador", 1000f))
    println(calculaBonus("Gerente Junior", 1000f))
    println(calculaBonus("Gerente Senior", 1000f))
}