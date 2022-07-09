package AccessModefier

open class Acress(){

    private fun myName(){
        println("hello")
    }
    protected fun myRollNo(){
        println("hello")
    }
    public fun myAge(){
        //can be accessed from everywhere
        println("hello")
    }
    internal fun myMotherName(){
        println("hello")
    }
    fun test(){
        var obj = Acress()
        obj.myAge()
        obj.myName()
        obj.myRollNo()
        obj.myMotherName()

    }
}
class abc: Acress(){

    fun getValue(){
       myRollNo()

    }

}



fun main(){
 var obj= abc()
    obj.myAge()
    obj.myMotherName()
    obj.getValue()


}