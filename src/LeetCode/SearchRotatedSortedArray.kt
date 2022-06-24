package LeetCode


//https://leetcode.com/problems/search-in-rotated-sorted-array
fun main(){
    var nums= intArrayOf(4,5,6,7,0,1,2)
    var target=0
    var index= search(nums,target)
    println(index)
}

fun search(nums: IntArray, target: Int): Int {
    var numIndex = -1

    if(target== nums[0]){
        numIndex=0
    }else if(target> nums[0]){
        for( k in 0..nums.size-1){
            if(nums[k]==target){
                numIndex=k
            }
        }

    }else if(target<nums.get(0)){
        for (k in nums.size-1 downTo 0){
            if(nums[k]==target){
                numIndex=k
            }
        }
    }
    return numIndex
}