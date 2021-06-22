

fun main(){
    var nums = arrayOf(-2,-1,-1,1,1,2,2)
    var target=0
    nums.sort()
    var farray= hashSetOf<ArrayList<Int>>()
    for(i in 0..nums.size-2){

        for(j in i+1..nums.size-2){

           var min=j+1
           var max=nums.size-1


            while (max>min){
                var sum = nums[i]+nums[j]+nums[min]+nums[max]
                if(sum<target){
                    min++
                }else if(sum>target){
                    max--
                }else if(sum==target){
                    var array=ArrayList<Int>()
                    array.add( nums[i])
                    array.add( nums[j])
                    array.add( nums[min])
                    array.add( nums[max])
                    array.sort()
                    farray.add(array)
                    min++
                    max--
                }
            }

        }

    }
    print(farray.toList())



}