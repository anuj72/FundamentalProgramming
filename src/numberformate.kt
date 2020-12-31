
    fun printMaxNum(num: Int): Int {
        val count = IntArray(10)
        val str = Integer.toString(num)
        for (element in str)
            count[element - '0']++
        var result = 0
        var multiplier = 1
        for (i in 0..9) {
            while (count[i] > 0) {
                result += i * multiplier
                count[i]--
                multiplier *= 10
            }
        }
        return result
    }
    fun main(args: Array<String>) {
        val num = 38293367
        println(printMaxNum(num))
    }
