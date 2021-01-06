

fun main(){
    var arr= arrayOf(43,1,4,46,0)
   /* var arr= arrayOf(43,1,4,46,6562,7,8,0,99,86)*/
   // bubblesort(arr)
 /* selectionshort(arr)*/
  /*  insertionshort(arr)*/
    quickshort(arr)

}

fun quickshort(arr: Array<Int>) {
   var  index=0
    var first=arr[0]
 for(i in 1 until arr.size){
     if(first<arr[i]){

     }else{

     }

 }


}




fun insertionshort(arr: Array<Int>) {
    for(j in 0 until arr.size){
        for(i in j downTo  1){
          /*  print("$i and ${i-1}")*/
            if(arr[i]<arr[i-1]){
                var a=arr[i]
                var b=arr[i-1]
                arr[i-1]=a
                arr[i]=b
            }
        }
    }

    arr.forEach {
        print(it)
        print(" ")
    }

}

fun selectionshort(arr: Array<Int>) {


    for(k in 0..arr.size-1){
        var min =arr[k]
        var minpos=k
        for(i in k..arr.size-1){
            if(min>arr[i]){
                min=arr[i]
                minpos=i
            }
        }
        var c=arr[k]
        var d= arr[minpos]
       arr[k]=d
        arr[minpos]=c


    }
    for (i in arr){
        print(i)
        print(" ")
    }



}

fun bubblesort(arr: Array<Int>) {
    var len=arr.size
    var j=0
    for(k in 0 until len-1) {
        for (i in 0 until len - 1-k) {
            if (arr[i] > arr[i + 1]) {
                var c = arr[i + 1]
                var d = arr[i]
                arr[i + 1] = d
                arr[i] = c
            } }
    }
   for(i in arr){
       print(i.toString())
       print(" ")
   }

}
