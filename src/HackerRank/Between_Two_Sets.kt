package HackerRank

fun main(){
   var arr1= arrayOf(2, 4)
    var arr2= arrayOf(16,32,96)
    var numofInt=0
    var m1=arr1.max()
    var m2=arr2.min()
    if(m1!=null && m2!=null){
        for(i in m1!! .. m2!!){
         var c1= arr1.all { i %it==0 } && arr2.all { it% i ==0 }
            print(i)
            print(c1)
            if(c1){
                numofInt++
            }
        }
    }
    print(numofInt)

}