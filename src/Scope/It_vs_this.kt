package Scope

fun main(){

  var l1=getmydata {
      it.length
      println(it)
  }

   var l2= getmydata1 {
        this.length
       println(this)
    }



}


fun  getmydata(str: (String) -> Unit) {
    str.invoke("Hello")

}

fun  getmydata1(str: String.() -> Unit) {
    str.invoke("Hello")
}
