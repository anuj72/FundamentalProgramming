package MountyFavourite

fun main() {
    //1st solution
    var arr = arrayOf("anand", "anuj", "abhinandan", "akhil","aman")
    var farr = ArrayList<String>()
    arr.forEach { str1 ->
        var len = str1.count { c -> c == 'a' }
        if (len > 1) {
            farr.add(str1)
        }
    }
    print(farr)
    //2nd solution
    var farr1 = ArrayList<String>()
    arr.forEach { str1 ->
        var len = str1.windowed(1).filter { it == "a" }.count()
        if (len > 1) {
            farr1.add(str1)
        }
    }
    print(farr1)


   //3rd solution
    val marr = arr.filter { it.windowed(1).filter { it == "a" }.count()>1}
    print(marr)


    //4th solution
    val marr1 = arr.filter { it.count { c -> c == 'a' }>1}
    print(marr1)


    //5th solution
    val marr2 = arr.filter { it.indexOf("a")!=it.lastIndexOf("a") }
    print(marr2)


    //6th solution
    val marr3 = arr.map{it.reversed()}
    print(marr2)



}