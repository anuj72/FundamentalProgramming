







fun main(){
    //febnociee no  at 10th pos
    var num =10

    for(i in 1..10){
        var fb=feb(i)
        print("\n")
        print(fb)
    }



}

fun feb(num: Int): Int {


    return if (num==0){0}
     else if(num==1) {1}else{
     feb(num-1)+   feb(num-2)
    }

}
