package Scope

fun main() {
    var name = "abc"
    run {
        var name = "bcd"
        println("name is $name")
    }
    var mName=  run {
        if(true) "name" else "jcj"
    }
    println("name is $mName")



}