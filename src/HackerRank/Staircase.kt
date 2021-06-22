package HackerRank

fun main() {
    var n = 6
    for (i in 0 until n) {
        for (j in i until n-1) {
            print(" ")
        }
        for (l in 0 until i+1 ) {
            print("0")

        }
        print("\n")
    }
}