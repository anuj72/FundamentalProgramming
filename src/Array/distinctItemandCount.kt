package Array

fun main(){
    var nums= arrayOf(2,2,2,4,5,6,7,7,7,8,8,8)
  var nums1= nums.toHashSet().toList()


 /* var mynum=  nums.distinct()
    print(mynum)
    var myMap= hashMapOf<Int,Int>()
  mynum.forEach { mit->
      var count=0
      nums.forEach {

          if(it==mit){
              count++
          }
      }
      myMap.set(mit,count)
  }
    print(myMap)*/


  /*  var nums= arrayOf(2,2,2,4,5,6,7,7,7,8,8,8)
   var stringnum= nums.joinToString("")
    print(stringnum)
    var num1=nums.distinct()
   var hashmap= hashMapOf<Int,Int>()
    num1.forEach {
        var patternt=Regex("$it")
      var count= patternt.findAll(stringnum).count()
        hashmap.put(it,count)

    }
    print(hashmap)
*/


}