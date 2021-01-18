import java.math.BigInteger

/*
A good meal is a meal that contains exactly two different food items with a sum of deliciousness equal to a power of two.

You can pick any two different foods to make a good meal.

Given an array of integers deliciousness where deliciousness[i] is the deliciousness of the i​​​​​​th​​​​​​​​ item of food, return the number of different good meals you can make from this list modulo 109 + 7.

Note that items with different indices are considered different even if they have the same deliciousness value.



Example 1:

Input: deliciousness = [1,3,5,7,9]
Output: 4
Explanation: The good meals are (1,3), (1,7), (3,5) and, (7,9).
Their respective sums are 4, 8, 8, and 16, all of which are powers of 2.
Example 2:

Input: deliciousness = [1,1,1,3,3,3,7]
Output: 15
Explanation: The good meals are (1,1) with 3 ways, (1,3) with 9 ways, and (1,7) with 3 ways.
*/


fun main(){
    var farray= mutableListOf<List<Int>>()
    var nums= arrayOf(1,3,5,7,9)
    var hst= hashSetOf<List<Int>>()
    fun powerOfTwoGeneral(n: Int): Boolean {
        var n = n
        while (n % 2 == 0) {
            n = n / 2
        }
        return n == 1
    }
    for(i in nums.indices){
        for(j in i+1..nums.size-1){
            var lst= mutableListOf<Int>()

            var sum=nums[i]+nums[j]
            if(sum!=0){
                if(powerOfTwoGeneral(sum)!!){
                    lst.add(nums[i])
                    lst.add(nums[j])
                    farray.add(lst)


                }
            }


        }
    }
    print("farray is $farray")



}




/*
object PowerOfTwoMain {
    @JvmStatic
    fun main(args: Array<String>) {
        println("128 is power of two : " + powerOfTwoGeneral(128))
        println("64 is power of two : " + powerOfTwoBitwise(64))
        println("22 is power of two : " + powerOfTwoBitwise(22))
        println("22 is power of two : " + powerOfTwoGeneral(22))
    }

    // Approach 1
    fun powerOfTwoGeneral(n: Int): Boolean {
        var n = n
        while (n % 2 == 0) {
            n = n / 2
        }
        return if (n == 1) {
            true
        } else {
            false
        }
    }

    // Approach 2
    fun powerOfTwoBitwise(n: Int): Boolean {
        return n and n - 1 == 0
    }
}*/
