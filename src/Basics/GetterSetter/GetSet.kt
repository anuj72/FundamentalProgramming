package Basics.GetterSetter

fun main(){
  var  mname= GetSet()
    mname.name="anuj"
    print(mname.name)

}

class GetSet (){
    var name:String?=null
   set(value) {
       field=value
     //  print("name is $value")
   }
    get() {
       // print("return name is $field")
        return field
    }

}