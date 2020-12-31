   fun main(){
       var arr= mutableListOf<String>()
     arr.add(0,"asaaas")
       arr.add(1,"asaaas")
       arr.add(2,"asaaas")

     arr.forEachIndexed {
         index, s -> print("$index index value is $s")
         print("\n")
        }


       var hashmp=HashMap<Int,String>()
       hashmp[0]="anuj"
       hashmp[1]="anuj1"
       hashmp[2]="anuj2"
       hashmp[3]="anuj3"
       hashmp.keys.forEach {
           print(hashmp[it])
           print("\n")
       }



       var h=10;
       var m=0
       var angle=(60*h-11*m)/2
       if(angle>180){
           angle=360-angle
       }
       print("angle is $angle")

  
    }
