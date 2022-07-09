package Basics.Oops

import sun.rmi.runtime.Log

interface Inharitance  {

    fun open()

    fun close(){

    }
}

class  myChild():myInharitance(){
    override fun open() {
        print("mmmmmmmmm"+"open")
    }

    override fun close() {
        super.close()
        print("mmmmmmmmm"+"close")
    }

}


open class  myInharitance():Inharitance{

    fun myfun(){
        myClickListner(this)
    }
    override fun open() {
       print("click work")
    }



}

fun main(){
   myInharitance().myfun()

}



fun myClickListner(click:Inharitance){
    click.open()

}
