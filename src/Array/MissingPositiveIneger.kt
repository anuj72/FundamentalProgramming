/*

41. First Missing Positive
Hard

5006

918

Add to List

Share
Given an unsorted integer array nums, find the smallest missing positive integer.

Follow up: Could you implement an algorithm that runs in O(n) time and uses constant extra space.?



Example 1:*/



fun main(){

var nums = arrayOf(3,4,-1,1)
    //-1 1 3 4
nums.sort()

    for((i,j) in nums.withIndex()){

        if((nums[i+1]-nums[i])>1 &&  (nums[i+1]+nums[i])>0){

        }
    }














}