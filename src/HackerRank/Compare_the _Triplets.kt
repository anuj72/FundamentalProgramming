package HackerRank

fun main(){
    var a: Array<Int> = arrayOf(17,28,30)
    var b: Array<Int> = arrayOf(99,16,8)
   var pa:Int=0
    var pb:Int=0
    a.forEachIndexed { index, aindex ->
        if(aindex>b[index]){
          pa++
        }else if(aindex<b[index]){
            pb++
        }
    }
    print("$pa $pb")
    arrayOf(pa,pb)
}