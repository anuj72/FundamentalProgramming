package Array

fun main(){
    var arr1= mutableListOf(1,2,3,4,5,6,7,8,9)
    var noRotat=10

   var noRotation=noRotat%arr1.size
    for(i in 0 until noRotation){
     var  last=  arr1.last()
        arr1.add(0,last)
        arr1.removeAt(arr1.lastIndex)
    }
    print(arr1)

}