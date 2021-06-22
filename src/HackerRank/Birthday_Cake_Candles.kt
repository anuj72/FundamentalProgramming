package HackerRank

fun main(){
    var candles= arrayOf(4,4,1,3)
    candles.sortDescending()
    var count=0
    var max= candles[0]
    candles.forEach {
        if(it==max){
            count++
        }
    }
    print("$max $count")
}