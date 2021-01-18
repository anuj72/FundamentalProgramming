
fun main(){

    /*[-3, 0, 1, 2]closest is 1*/
var nums= arrayOf(0,2,1,-3)
    var target=0
    var min = Integer.MAX_VALUE
    var output = 0
    nums.sort()
    for (i in 0..nums.size- 2){
        var low = i+1
        var high = nums.size-1
        while(low<high){
            var sum = nums[i] + nums[low]+nums[high]
            when {
                sum > target ->{
                    high--
                }
                sum < target ->{
                    low++
                }
                else ->{
                    low++
                    high--
                }
            }
            var res = Math.abs(target - sum)
            if (res < min ){
                output = sum
                min = res}

        }
    }



    print("closest is $output")



}