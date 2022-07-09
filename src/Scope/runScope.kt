package Scope

fun main() {
    var name = "abc"
    run {
        var name = "bcd"
        println("name is $name")
    }
    var mName=  run {
        name.reversed()
    }
    println("name is $mName")


   var myReverse= name.let {
        it.reversed()
    }
    println(myReverse)





}