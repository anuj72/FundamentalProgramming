
import java.util.stream.Collectors
import java.util.Arrays

import java.util.ArrayList






//    Share
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
// Example 1:
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Output: Because nums[0] + nums[1] == 9, we return [0, 1].
//    Example 2:
//
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]
//    Example 3:





//    class Solution {
//        fun twoSum(nums: IntArray, target: Int): IntArray {
//            var farray=ArrayList<Int>()
//            for(i in 0..nums.size-1){
//                for(j in 0..nums.size-1){
//                    if(i==j){
//
//                    }else {
//                     var sum=  nums.get(i)+nums.get(j)
//                        if(sum==target){
//                            print(sum)
//                            print("\n")
//                            farray.add(i)
//                        }
//                    }
//
//                }
//            }
//            print(farray)
//            return  farray.toIntArray()
//
//        }
//    }
//    Solution().twoSum(intArrayOf(2,7,11,15),9)






//    4. Median of Two Sorted Arrays
//    Hard
//
//    8841
//
//    1363
//
//    Add to List
//
//    Share
//    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//    Follow up: The overall run time complexity should be O(log (m+n)).
//
//
//
//    Example 1:
//
//    Input: nums1 = [1,3], nums2 = [2]
//    Output: 2.00000
//    Explanation: merged array = [1,2,3] and median is 2.
//    Example 2:
//
//    Input: nums1 = [1,2], nums2 = [3,4]
//    Output: 2.50000
//    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
//    Example 3:
//
//    Input: nums1 = [0,0], nums2 = [0,0]
//    Output: 0.00000
//    Example 4:
//
//    Input: nums1 = [], nums2 = [1]
//    Output: 1.00000
//    Example 5:
//
//    Input: nums1 = [2], nums2 = []
//    Output: 2.00000
//
//
//    Constraints:
//
//    nums1.length == m
//    nums2.length == n
//    0 <= m <= 1000
//    0 <= n <= 1000
//    1 <= m + n <= 2000
//    -106 <= nums1[i], nums2[i] <= 106
//    Accepted
//    827,336
//    Submissions
//    2,694,227

  /*  class Solution {
        fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            var mean:Double= 0.0
            var l1=nums1.size
            var l2=nums2.size
            if(nums1.size==0&&nums2.size==0){
                return 0.0
            }else if(nums1.size==0){
                if((nums2.size)%2==0){
                    return ((nums2[l1/2].toDouble() + nums2[l1/2+1])/2)
                }else {
                    return nums2[l1/2+1].toDouble()
                }
            }else if(nums2.size==0){
                if((nums1.size)%2==0){
                    return ((nums1[l2/2].toDouble() + nums1[l2/2+1])/2)
                }else {
                    return nums1[l2/2+1].toDouble()
                }

            }else{
                if((l1+l2)%2==0){
                    var mid=  (l1+l2)/2
                    if(mid==l1){
                        return ((nums1[mid-1].toDouble()+nums2[0].toDouble())/2)
                    }else{
                        if(mid>l1){
                            return ((nums2[mid-l1].toDouble()+nums2[mid-l1-1].toDouble())/2)

                        }else{
                            return (nums2[mid].toDouble()+nums2[mid+1])
                        }
                    }

                }else{
                  var mid=  (l1+l2)/2
                    if(mid>l1){
                        return nums2[mid-l1-1].toDouble()

                    }else{
                        return nums1[mid].toDouble()

                    }

                }
            }

        }
    }




 var s=Solution().findMedianSortedArrays(intArrayOf(1,2,3,4), intArrayOf(5,6,7,8))
    print(s)*/






    /*  class Solution {
          fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
               var l1=nums1.size
               var l2=nums2.size
               var total=(l1+l2)
               var mergeArray=ArrayList<Int>()
               var mean=0.0
               if(l1==0&& l2==0){
                  return 0.0
                }else{
               for(i in nums1){ mergeArray.add(i) }
                  for(j in nums2){ mergeArray.add(j) }
                   mergeArray.sort()
                   if(total%2==0){
                      mean= ((mergeArray[(total/2)-1]+mergeArray[(total/2)]).toDouble()/2)
                   }else{
                    mean= mergeArray[(total/2)].toDouble()
                   }
                  return mean
              }


          }
      }


      Solution().findMedianSortedArrays(intArrayOf(1,2,4,3), intArrayOf())*/




/*var height= arrayOf(1,8,6,2,5,4,8,3,7)
      var maxArea=0
      for((pos1,i) in height.withIndex()){
          for((pos2,j) in height.withIndex()){

                  var mArea=0

                    if(j>i){
                    mArea=(i)*(pos2-pos1)
                        if(mArea>maxArea){
                            i
                            maxArea=mArea
                        }
                    }else{
                        mArea=(j)*(pos2-pos1)
                        if(mArea>maxArea){
                            i
                            maxArea=mArea
                        }

                    }

                }
              }


      print(maxArea)*/
fun main(){
      fun threeSum(nums: IntArray) {
          nums.sort()
        var farray= mutableListOf<List<Int>>()
         var num=2
          for(i in 0..nums.size-2){

              var low=i+1
              var heigh=nums.size-1
              while (low<heigh){
                  var sum=nums[i]+nums[low]+nums[heigh]
                  var array= mutableListOf<Int>()
                  when{

                      sum==0->{
                     array.add(nums[i])
                      array.add(nums[low])
                      array.add(nums[heigh])

                     farray.add(array)

                          low++
                          heigh--
                      }
                      sum<0->{ low++}
                      else ->{ heigh--}

                  }




              }

          }

         val distinctLists: List<List<Int>> = farray.stream().distinct().collect(Collectors.toList())

          print(distinctLists)

      }

      threeSum(intArrayOf(-2,0,1,1,2))


/*

var array=intArrayOf(1,1,2)
    var farry= mutableListOf<Int>()
    var temp=array[0]
    farry.add(array[0])
    for(i in 0..array.size-1){
        if(temp==array[i]){

        }else{
            temp=array[i]
            farry.add(array[i])

        }

    }
    for(i in farry){
        print(i)
    }
*/


      }

/*
fun threeSum(num: IntArray): List<List<Int>>? {
    val count: MutableList<List<Int>> = ArrayList()
    Arrays.sort(num)
    var k = 0
    while (k < num.size && num[k] <= 0) {
        k++
    }
    for (i in 0 until k) {
        if (i == 0 || i > 0 && num[i] != num[i - 1]) {
            val sum = 0 - num[i]
            var high = num.size - 1
            var low = i + 1
            while (low < high) {
                if (num[low] + num[high] == sum) {
                    count.add(Arrays.asList(num[i], num[low], num[high]))
                    while (low < high && num[low] == num[low + 1]) low++
                    while (low < high && num[high] == num[high - 1]) high--
                    low++
                    high--
                } else if (num[low] + num[high] < sum) {
                    low++
                } else {
                    high--
                }
            }
        }
    }
    return count
}*/


/*
    * Find the maximum difference between the values in an array such that the largest values always comes after the
    * smallest value
    * Input: {2, 3, 10, 6, 4, 8, 1}
    * Output: 8
    *  Step 1) Set min value as arr[0] -> a
    *  Step 2) set max difference as arr[1] - arr[0]; -> b
    *  Step 3) Iterate and check if the value is > minValue.
    *  Step 4) If it is greater, then get the difference between the two values & check if the difference > max difference (b). If the difference is > set this diff as max difference
    *  Step 5) If it is less than minValue, set this value as minValue
    * */

/*
fun main(){
    var arr1= arrayOf(2, 3, 10, 6, 4, 8, 1)
    var max=0
   for(i in 0..arr1.size-1) {
       for(j in i..arr1.size-1){
           var diff=arr1[j]-arr1[i]
           if(max<diff){
               max=diff
           }

       }
   }
    print(max)


//
//    val arr = intArrayOf(1, 2, 4, 6, 3, 7, 8)
//    var len=arr.size
//    var sum =((len+1)*(len+2))/2
//    var arrsum =0
//    for (i in arr){
//        arrsum += i
//    }
//    var missing=sum-arrsum
//    print(missing)
//


    var minDist = Int.MAX_VALUE
    val arr = intArrayOf(3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3)
    val n = arr.size
    val x = 3
    val y = 6
    for (i in 0 until n) {
        for (j in i + 1 until n) {
           if((arr[i]==x && arr[j]==y)||(arr[i]==y && arr[j]==x)){
               if((arr[j]-arr[i])<minDist){
                   minDist=j-i
               }
           }
        }
    }
    print(minDist)

}
*/








