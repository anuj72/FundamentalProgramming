package Collection
data class Person(val name:String,val age:Int,val licance:Boolean=false)
    fun main(){
        val fgroup= listOf(Person("anuj",2),Person("abhi",2),Person("abhash",2,true))
        var canTravel = fgroup.any { it.licance }
        print("kkkkkkk"+canTravel)
       var num= listOf(1,2,3,9,10,4,4,4,5,6,6,7,4,4,4,6)
        //remove reprted element
        var snum=num.toHashSet().toList()
        var snum1=num.toSet().toList()
        var snum2=LinkedHashSet(num).toList()
        var snum3=num.distinct()
       // print("kkkkkkk"+snum)
      //  print("kkkkkkk"+snum1)
       // print("kkkkkkk"+snum2)
      //  print("kkkkkkk"+snum3)



    }

