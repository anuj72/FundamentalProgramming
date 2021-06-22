




fun main(){
    var candidates= intArrayOf(2,3,6,7)
            var target = 7
    val ans = MutableList(0){MutableList(0){0}}
    comb(ans, candidates, target, 0, MutableList(0){0})
   print(ans)
}


fun comb(ans: MutableList<MutableList<Int>>, candidates: IntArray, target: Int, index: Int, tmp: MutableList<Int>): Unit{
    if (target<0){
        return
    }
    else if (target==0){
        if (!ans.contains(tmp)){
            ans.add(MutableList(tmp.size){i->tmp[i]})
        }
    }
    else{
        for (i in index until candidates.size){
            val newTmp = MutableList(tmp.size){it->tmp[it]}
            newTmp.add(candidates[i])
            comb(ans, candidates, target-candidates[i], i, newTmp)
        }
    }
}
