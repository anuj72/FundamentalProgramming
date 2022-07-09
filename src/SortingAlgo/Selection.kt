package SortingAlgo

fun main() {

    var num = arrayOf(7, 4, 10, 8, 3, 1)



    for (j in 0..num.size - 1) {
        var min = Int.MAX_VALUE
        var pos = 0
    for (i in j..num.size - 1) {
        if (min > num[i]) {
            min = num[i]
            pos = i
        }
       // print(min)
    }
        swapNum(num, j, pos)
    }


    print(num.toList().toString())

}

fun swapNum(num: Array<Int>, i: Int, pos: Int) {
    var val1 = num[pos]
    var val2 = num[i]
    num[pos] = val2
    num[i] = val1
}
