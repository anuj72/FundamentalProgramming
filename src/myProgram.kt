class Solution {
    fun combinationSum(candidates: IntArray, target: Int) {
        var l = candidates[0];
        var m = candidates[1];
        var n = candidates[2];

       
        for (i in 1..5) {
            for (j in 1..5) {
                for (k in 1..5) {
                    for (o in 1..5) {
                        for (p in 1..5) {
                            var q=0
                            var r=0
                            var s=0
                            var t=0
                            var u=0
                         if(i==4){
                             q=1
                         }else{q=i}
                        if(j==4){
                                r=1
                          }else{r=i}
                         if(k==4){
                                s=1
                            }else{s=i}
                            if(o==4){
                                t=1
                            }else{t=i}
                            if(p==4){
                                u=1
                            }else{u=i}



                                print("$q$r$s$t$u,")




                        }


                    }


                }
            }
        }
    }
}
fun main(){
    Solution().combinationSum( intArrayOf(1,2,3),5)
}