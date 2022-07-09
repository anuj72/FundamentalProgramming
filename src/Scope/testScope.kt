package Scope

fun main(){
    var str="Hello"

    //transform and return value
    var num1=str.let { it.reversed() }
    var num2=str.run { this.reversed() }

    // can do operation on same value but can not return
    var num3=str.apply { this.reversed() }
    var num4=str.also { it.reversed() }
    var num5= with(str){ this.reversed() }


    println(num1)
    println(num2)
    println(num3)
    println(num4)
    println(num5)

    /*olleH
    olleH
    Hello
    Hello
    olleH*/


}