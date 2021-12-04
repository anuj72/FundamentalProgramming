package VeryBesics

fun main(){
    var num= 1132311
  var remStr=""
   var mynum=num
    while (num>0){
       var rem=num%10
        num /= 10
      remStr=remStr+rem
    }
    print(remStr)
    if(remStr.trim()==mynum.toString()){
        println("no is palindrom")
    }

}