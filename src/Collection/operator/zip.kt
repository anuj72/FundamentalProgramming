package Collection.operator

fun main(){
    var name= listOf("abc","def","ghi")
    var id= listOf("1","2","3")
    var mlist=id.zip(name)
    var mlist1=id.zip(name){name,id->
        println("$name,$id")
    }

    println(mlist)

  /*  [(1, abc), (2, def), (3, ghi)]*/

    var listnum= listOf(1,2,5)
    //diff of each element
   var listdiff= listnum.zipWithNext(){a,b->Math.abs(a-b) }
    print(listdiff)




}