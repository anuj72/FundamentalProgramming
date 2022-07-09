package Basics.Oops

class Encapsulation  {

   private var name:String?=null
   private var rollno:String?=null

      @JvmName("getName1")
      fun getMYName():String{
          return name.toString()
      }

    @JvmName("setName1")
    fun setName(myName :String){
        name=myName
    }

}



fun main(){
    var obj=Encapsulation()
    obj.setName("anuj")
    print(obj.getMYName())
}