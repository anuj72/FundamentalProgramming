package Array

/*
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).*/


fun main(){
    var lowestsum=Int.MAX_VALUE
    var nums= arrayOf(-1,2,1,-4)
    var target =2
    var closest =Int.MAX_VALUE
    for(i in 0..nums.size-1){
        for(j in  i..nums.size-1){
            for(k in  j..nums.size-1){
                if(i==j || j==k || k==i){

                }else{
                    if((nums[i]+nums[j]+nums[k])<lowestsum){
                        lowestsum=(nums[i]+nums[j]+nums[k])
                        if(lowestsum-target<closest ){
                            if(lowestsum-target>=0){
                                closest=lowestsum
                                print(lowestsum)
                                print("\n")
                            }

                        }

                    }
                }



            }
        }

    }
    print("close sum is $closest")
}