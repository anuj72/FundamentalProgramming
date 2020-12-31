
    
 
    
    fun main(){
        var l=4
        var arr= arrayOf(1,2,3,4,5,6,7,8,9)
        var sortedArr =interpolationSearch(arr,l)
        var linear=linearSearch(arr,l)
        var binary=binarySearch(arr,l)
    }

    fun linearSearch(arr: Array<Int>, l: Int) {

        arr.forEachIndexed { index, i ->
            if(i==l){
                print("num find at index $index" )
            }
        }
    }


    fun binarySearch(arr: Array<Int>, l: Int) {
        var length=arr.size

        var high=length-1
        var low=0
       var  mid=(high+low)/2
        while (high>low){

            if(arr[mid]==l){
                print("Num Found $mid")
                return
            }
            if(arr[mid]<l){
                low=mid
                high=high
            }else{
                low=low
                high=mid }
            mid=(low+high)/2
        }




    }


    fun interpolationSearch(arr: Array<Int>, l: Int) {
     var low=0
        var heigh=arr.size-1
      var  ival= (((l-arr[low])*(heigh-low))/(arr[heigh]-arr[low]))
         print("found at $ival")
    }




