/*Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

The replacement must be in place and use only constant extra memory.



Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
Example 4:

Input: nums = [1]
Output: [1]*/


fun main(){
  var nums = arrayOf(1,2,3)
  var i = nums.size - 1
  while (i > 0) {
    if (nums[i] > nums[i-1]) {
      val next = findNextInt(nums, i-1)
      val temp = nums[i-1]
      nums[i-1] = nums[next]
      nums[next] = temp
      nums.sort(i, nums.size)
      return
    }
    i--
  }

  nums.reverse()

}

private fun findNextInt(nums: Array<Int>, i: Int): Int {
  val v = nums[i]
  var minDiff = Int.MAX_VALUE
  var minIndex = i + 1
  for (j in i+1 until nums.size) {
    if (nums[j] > v && nums[j] - v < minDiff) {
      minDiff = nums[j] - v
      minIndex = j
    }
  }

  return minIndex

}



















