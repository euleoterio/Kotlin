fun main(){

    val str = "Vinicius Euleoterio"

    for(c in str){
        print("$c ")
    }

    for (i in 0..100 step 5){ //step 2, de 2 em 2
        if(i != 80)
            print("$i,")
    }
    ""
    for (j in 100 downTo 0){
        print("$j,")
    }
}