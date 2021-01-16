

fun main(){

    var obj=abc()
    obj.name="hsbchbhcb"
    obj.rollno="6512553615"
    obj.apply {
        name="jfhgdgvhs"
        rollno="785678346"
        print(name)
    }
    with(obj){
        print(name)
        print(rollno)
    }




}


class abc(){
    var name="Anuj"
    var rollno="1410032"
    fun iam(name:String,rollNO:String){

    }
}