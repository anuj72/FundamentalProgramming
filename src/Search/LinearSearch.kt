package Search

fun main(){
    var mynum= listOf(1,2,3,4,55,56,6,677)
    var pos:Int?=search(55,mynum)
    print(pos)

}

fun search(p: Int, mynum: List<Int>):Int? {
    var pos: Int? =null
    mynum.forEachIndexed { index, i ->
        if(i==p){
            pos= index
        }
    }
    return pos
}
