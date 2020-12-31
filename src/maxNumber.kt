fun main(){
    var number =876839
     var list= mutableListOf<Int>()
    while(number!=0){
        var j= number%10
        number /= 10
       /* print("$j and $number")
        print("\n")*/
       list.add(j)
    }
  var flist= ""
    for(i in 9 downTo 0){
        for(j in list){
            if(j==i){
                print(j)
                flist=flist+j.toString()
                print("\n")
            }
        }

    }
    print("fum is ${flist.toString()}")

}