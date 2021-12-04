package SortingAlgo

fun main(){
    var myarray= arrayOf(1,7,2,3,6,4)
    for(j in 0..myarray.size-2){
    for(i in 0..myarray.size-2){
        if(myarray[i]>myarray[i+1]){
            var c=myarray[i]
            var d=myarray[i+1]
            myarray[i]=d
            myarray[i+1]=c
        }

    }
    }
    print(myarray.toList())

}