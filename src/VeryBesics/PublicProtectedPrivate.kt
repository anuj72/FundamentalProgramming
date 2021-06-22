package VeryBesics

open class PublicProtectedPrivate {
    private var name="anuj"
    public var rollno="1410032"
    protected var college="kiet"

   fun name(){}
}

fun main(){
   var rollno= PublicProtectedPrivate().rollno
    print(rollno)
}



class  abc:PublicProtectedPrivate(){
    fun test(){
        print(college)
        //print(name) not valid due to protected
    }
}