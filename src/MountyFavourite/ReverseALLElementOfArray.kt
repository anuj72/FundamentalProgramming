package MountyFavourite
//shahdab fav
fun main(){
    var arr = arrayOf("anand", "anuj", "abhinandan", "akhil","aman")
    var farr = ArrayList<String>()
    //sol1
    val marr3 = arr.map{it.reversed()}
    print(marr3)


    //sol2
    arr.forEach { str->
        var mystr=""
        for(i in str.length-1 downTo  0){
            mystr += str[i] }
          farr.add(mystr)
     }
    print(farr.toString())

//sol3
    var farr1 = ArrayList<String>()
    arr.map {
        var str=it
        var mystr=""
        for(i in str.length-1 downTo  0){
            mystr += str[i] }
        farr1.add(mystr)
    }
    print(farr1.toString())


}

