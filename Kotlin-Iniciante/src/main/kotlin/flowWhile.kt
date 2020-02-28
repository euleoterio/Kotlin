fun main(){

    var index: Int = 0

    while(index < 100){
        println(index)
        index ++

        if(index == 50)
            break

    }



    do{
        println(index)
        index--
    }while (index > 0)

}