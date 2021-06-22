/*35. Search Insert Position
Easy

3075

283

Add to List

Share
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:

Input: nums = [1,3,5,6], target = 0
Output: 0
Example 5:

Input: nums = [1], target = 0
Output: 0


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
Accepted
751,464
Submissions
1,757,000*/


fun main(){
    var nums= arrayOf(1,3,5,6)
    var target =5
    var mindis=Int.MAX_VALUE
    var mindisindex=0

    if(target>nums[nums.size-1]){
       /* print(nums[nums.size-1])*/
        mindisindex= nums.size
    }else{
    for((j,i )in nums.withIndex()){

            if(i<=target){
                if((target-i)==mindis){
                    mindis=target-i
                    mindisindex=j
                }
                else
                    if((target-i)==0){

                        mindisindex=j
                    }
                else
                    if((target-i)<mindis){
                        mindis=target-i
                        mindisindex=j+1
                    }

            }
        }


        }

    print(mindisindex)

    }





























