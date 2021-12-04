package StackQueue

import java.util.*

fun main(){
    var mstack=Stack<String>()
    mstack.push("abc")
    mstack.push("bcd")
    mstack.push("def")
    print(mstack.pop())
    print(mstack.pop())


    var myQueue:Queue<String> = LinkedList<String>()
    myQueue.add("abc")
    myQueue.add("bcd")
    print(myQueue.poll())


}

