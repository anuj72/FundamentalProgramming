

fun main(){

    var obj=abc()
    obj.name="hsbchbhcb"
    obj.rollno="6512553615"

    var myreverseName= obj.let {
        it.name="abc"
        return@let (it.name).reversed()
    }
    print("reverse String"+myreverseName)


    obj.apply {
        name="jfhgdgvhs"
        rollno="785678346"
        print(name)
    }
    with(obj){
        print(name)
        print(rollno)
    }

  var   rollno=obj.run {
        this.name="myname"
        this.rollno="132"
        return@run "roll no is ${this.rollno}"
    }

    print(rollno)








}


class abc(){
    var name="Anuj"
    var rollno="1410032"
    fun iam(name:String,rollNO:String){

    }
}