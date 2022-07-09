package Generics

fun main(){
   // println("Hello World")
    var mData=Box()
    mData.pushData("Hello World")
    var pdata= mData.fetchData()
    println(pdata.toString())
    var isEmpty=mData.isEmpty()
    println(isEmpty)
    println("\n")
    var box1=GenericBox<String>()
    box1.push("Hello World")
    val boxData=box1.pull()
    println(boxData)
    println(box1.isEmpty())

}


class Box{
    var data:Any?=null

    fun pushData(data:Any?){
        this.data=data
    }
    fun fetchData():Any?{
        return data
    }
    fun isEmpty():Boolean{
        return data==null
    }

}


class GenericBox<T>{
    var content:T?=null

    fun push(content:T?){
        this.content=content
    }

    fun pull():T?{
        return content
    }

    fun isEmpty():Boolean{
        return content==null
    }

}



class outCase<out T> {
    private val contents = mutableListOf<T>()
    fun produce(): T = contents.last()         // Producer: OK

    //fun consume(item: T) = contents.add(item)  // Consumer: Error
    //if declare as  out it can return T but can not take T as a parameter
}

class inCase<in T> {
    private val contents = mutableListOf<T>()
  //  fun produce(): T = contents.last()         // Producer: Error
    //if declare as  out it can take T but can not return T
    fun consume(item: T) = contents.add(item)  // Consumer: OK
}


/*The List in Kotlin is a producer only. Because it's declared using the out modifier: List<out T>.
This means you cannot add elements to it as the add(element: T) is a consumer function.
Whenever you want to be able to get() as well as add() elements, use the invariant version MutableList<T>.*/
