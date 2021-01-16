/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]*/

fun main(){


    var set = HashSet<List<Int>>()

    var farray= mutableListOf<List<Int>>()
var nums = arrayOf(-1,0,1,2,-1,-4)
    nums.sort()
    for(i in 0..nums.size-2){
        var min=i+1
        var max=nums.size-1
        while(min<max){
            var sum= nums[i]+nums[max]+nums[min]
            var array= mutableListOf<Int>()
            when{
                sum==0->{
                    array.add(nums[i])
                    array.add(nums[min])
                    array.add(nums[max])
                    set.add(array)
                    min++
                    max--
                }
                sum<0->{
                    min++
                }else->{
                    max--
                }
            }
        }
    }




    print("final array is ${set.toList()}")


}