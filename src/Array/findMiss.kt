package Array

fun main() {
    var nums = listOf(1, 2, 3, 8, 9, 20)
  var sortnums=  nums.sortedDescending()

 for(i in sortnums.last()..sortnums.first()){
   //println(i)
     if(i in nums){

     }else{
         println(i)
     }
 }


 /*  nums.forEach {

   }*/


}