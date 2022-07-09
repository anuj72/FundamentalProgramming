package Basics.Oops

abstract class Abstraction {
    var name ="anuj"
    open fun open(){

    }
    abstract  fun close()
}



class myabstractClass():Abstraction(){

    override fun close() {

    }
    override fun open(){
       print(name)
    }
}


fun main(){
    myabstractClass().open()
}



