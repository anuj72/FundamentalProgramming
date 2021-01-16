
fun main(){
    var nums=  HashSet<List<Int>>()
    var arr1= listOf(1,2,34,4)
    var arr2= listOf(1,2,34,4,98)
    var arr3= listOf(1,21,341,4,98)
    var arr4= listOf(1,2,34,4)
    nums.add(arr1)
    nums.add(arr2)
    nums.add(arr3)
    nums.add(arr4)

    print("${nums.toList()} is hashset num")
}