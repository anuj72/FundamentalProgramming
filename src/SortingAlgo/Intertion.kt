package SortingAlgo


fun  main() {
    var arr = arrayOf(4, 3, 1, 2, 5)
    for (i in 1 until arr.size) {
        val temp: Int = arr[i]
        var j = i - 1
        while (j >= 0 && arr[j] > temp) {
            swapmyNum(j,arr)
            j--
        }
        print(arr.toList().toString()+"temp")
        arr[j + 1] = temp
        print("\n")
        print(arr.toList().toString())
    }
    //  print(arr.toList().toString())

}

fun swapmyNum(j: Int, arr: Array<Int>) {
    arr[j+1] = arr[j]
}



