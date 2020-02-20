
fun main(args: Array<String>){

    val frutas = arrayListOf<String>("Banana","Manga","Uva")

    /*
    val fList = frutas.onEach {
        it.toUpperCase()
    }

    fList.forEach{
        println(it)
    }*/

    frutas.forEach{nomeFruta ->
        println(nomeFruta.toUpperCase())
    }
    
}