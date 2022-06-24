package HackerRank

import kotlin.math.min

fun main() {
    var scores = arrayOf(9, 10, 5, 20, 20, 4, 5, 2, 25, 1)
    var minScore = Int.MAX_VALUE
    var maxScore = Int.MIN_VALUE
    var minCount = 0
    var maxCount = 0
    for (i in 0 until scores.size - 1) {
        if (scores[i] > scores[i + 1] && scores[i + 1] < minScore) {
            minScore = scores[i + 1]
            minCount++

        } else if (scores[i] < scores[i + 1] && scores[i + 1] > maxScore) {
            maxScore = scores[i + 1]
            maxCount++
        }
    }
    println(minCount)
    println(maxCount)

}