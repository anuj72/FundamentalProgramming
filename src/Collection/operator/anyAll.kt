package Collection

fun main(){
    data class user(val name:String,var email:String)
    var myUserList= mutableListOf<user>()
    myUserList.add(user("anuj","anuj@gmail.com"))
    myUserList.add(user("shahdab","shahdab@gmail.com"))

    //find if myUserList has name anuj
  var checkMyName=  myUserList.any{it.name=="anuj"}
    println(checkMyName)

    //to check everywhere name is anuj
    var checkMyNameEveryWhere=  myUserList.all{it.name=="anuj"}
    println(checkMyNameEveryWhere)

    var checkMyNameNone=  myUserList.none{it.name=="anuj"}
    println(checkMyNameNone)
    var mylist= emptyArray<user>()

    var vacoushTruth=mylist.all { it.name.length<3 }
    println(vacoushTruth.toString()+"vacoushTruth")

}