package HackerRank
import java.math.BigInteger
//https://www.hackerrank.com/challenges/mini-max-sum
fun main(){
    var arr:Array<Int> = arrayOf(256741038,623958417, 467905213, 714532089, 938071625)
    arr.sort()
    var min:BigInteger=BigInteger("0")
    var max:BigInteger=BigInteger("0")

    var p1:List<List<Int>> =arr.toList().windowed(arr.size-1)
    var minarr=p1.first()
    var maxarr=p1.last()
    minarr.forEach {
        min += it.toBigInteger()
    }
    maxarr.forEach {
        max += it.toBigInteger()
    }

    print("$min and $max")



}