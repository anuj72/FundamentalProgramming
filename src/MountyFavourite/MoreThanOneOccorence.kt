package MountyFavourite

fun main() {
    var arr = arrayOf("anand", "anuj", "abhinandan", "akhil")
    var farr=ArrayList<String>()
    arr.forEach {str1->
        var len=  str1.count{ c -> c == 'a' }
        if(len>1){ farr.add(str1) }
    }
    print(farr)



}