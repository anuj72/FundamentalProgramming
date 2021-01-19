/*
34. Find First and Last Position of Element in Sorted Array
Medium

4787

184

Add to List

Share
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

Follow up: Could you write an algorithm with O(log n) runtime complexity?



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

*/


fun main(){
    var nums= arrayOf(5,7,7,8,8,10)
    var target=6
    var postionArray=ArrayList<Int>()
    var firstLast=ArrayList<Int>()
    for(i in 0..nums.size-1){
        if(nums[i]==target){
            postionArray.add(i)
        }
    }
    when{
        postionArray.isEmpty()->{
            firstLast.add(-1)
            firstLast.add(-1)
        }
        postionArray.size==1->{
            firstLast.add(postionArray[0])
            firstLast.add(postionArray[0])
        }
        else->{
            firstLast.add(postionArray[0])
            firstLast.add(postionArray[postionArray.size-1])
        }
    }
    print(firstLast)


}















