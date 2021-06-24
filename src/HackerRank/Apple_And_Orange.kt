package HackerRank
//https://www.hackerrank.com/challenges/apple-and-orange/problem
fun main() {
    // range of home
    var s: Int = 7
    var t: Int = 10
    //apple
    var a: Int = 4
    //orange
    var b: Int = 12

    var homeApple: Int = 0
    var homeOrange: Int = 0

    var apples = arrayOf(2, 3, -4)
    var oranges = arrayOf(3, -2, -4)
    var fa_array = apples.map { it + a }.toTypedArray()
    var fo_array = oranges.map { it + b }.toTypedArray()

    fo_array.forEach {
        if(it in s..t){
            homeOrange++
        }
    }
    fa_array.forEach {
        if(it in s..t){
           homeApple++
        }
    }


    print("$homeApple\n$homeOrange")
}