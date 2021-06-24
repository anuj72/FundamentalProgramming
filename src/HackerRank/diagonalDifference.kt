package HackerRank
//https://www.hackerrank.com/challenges/diagonal-difference
fun main(){
    val even: IntArray = intArrayOf(2, 4, 6)
    val odd: IntArray = intArrayOf(1, 3, 5)
    val odd1: IntArray = intArrayOf(1, 3, 5)
    val lala: Array<IntArray> = arrayOf(even, odd,odd1)
   var digonalOneSum=0
    var digonalTwoSum=0
    for(i in 0..lala.size-1){
        for(j in 0..lala.size-1){

               if(i==j){
                   digonalOneSum += lala[i][j]
               }
                if(i+j==lala.size-1){
                    digonalTwoSum += lala[i][j]
                }

        }
    }
    var diff= Math.abs(digonalTwoSum-digonalOneSum)
    print("diff is $diff")




}