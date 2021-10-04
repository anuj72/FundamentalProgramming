package Constructor

fun main(){
   var reverseName= Primary("Anuj").getReverse()
    print(reverseName)
}


class Primary(var name :String){
  fun  getReverse():String{
    return  name.reversed()
  }
}