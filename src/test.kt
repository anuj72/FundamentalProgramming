fun main() {
    var nums= intArrayOf(1,2,3,4,5)

    printVarArgs( *nums)
}

fun printVarArgs(vararg list: Int) {
    list.forEach {
        println("nums are $it")
    }
}

