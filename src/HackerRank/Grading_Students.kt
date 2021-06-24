package HackerRank
//https://www.hackerrank.com/challenges/grading
fun main() {
    var grades = arrayOf(73, 67, 38, 33)
    var fgrades = mutableListOf<Int>()
    grades.forEach {
        if (it >= 38) {
            var rem = it % 5
            if (rem < 3) {
                fgrades.add(it)

            } else {
                fgrades.add(it + (5 - rem))
            }
        } else {
            fgrades.add(it)
        }

    }
    print(fgrades.toIntArray())
}