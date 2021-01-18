//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2]
//Explanation: Your function should return length = 2, with the first two elements of nums being 2.
//It doesn't matter what you leave beyond the returned length. For example if you return 2 with nums = [2,2,3,3] or nums = [2,2,0,0], your answer will be accepted.

fun main(){
    var nums= arrayOf(3,2,2,3,6,6)
    var data=2
    var hashdata= mutableListOf<Int>()
    for((j,i) in nums.withIndex()){
        if(i==data){
            nums[j]==0
            print(i.toString())
        }else{
            hashdata.add(i)
        }
    }
    print(nums.toList())




}