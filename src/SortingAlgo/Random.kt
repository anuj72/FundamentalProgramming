package SortingAlgo

fun main() {
    var num = arrayOf(7, 4, 10, 8, 3, 1)
    for(i in num.indices){
        var lists = splitList(i, num)
        print(lists.list1)
        print(lists.list2)
        print("\n")
    }



}

fun splitList(i: Int, num: Array<Int>): myData {
    var list1 = mutableListOf<Int>()
    var list2 = mutableListOf<Int>()
    for (j in 0..i) {
        list1.add(num[j])
    }
    for (j in i + 1..num.size - 1) {
        list2.add(num[j])
    }
    return myData(
        list1, list2
    )
}


data class myData(val list1: MutableList<Int>, val list2: MutableList<Int>)
