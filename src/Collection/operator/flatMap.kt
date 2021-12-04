package Collection.operator

fun main(){

  var mlist=  listOf("abc","def","ghi").flatMap {
        it.toList()
    }
    print(mlist)
}