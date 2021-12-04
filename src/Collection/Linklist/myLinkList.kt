package Collection.Linklist

import java.util.*

fun main() {

    //single link list
    data class Node<T : Any>(
            val value: T,
            val next: Node<T>? = null
    ) {
        override fun toString(): String {
            if (next != null) {
                return "$value->$next"
            } else {
                return "$value"
            }

        }

         fun toReverseList() {
          next?.toReverseList()
             if(next!=null){
                 print("->")
             }
             print (value.toString())
        }
    }

    var mynode = Node("a", Node("b", Node("c")))
    print(mynode)
  mynode.toReverseList()




    data class DNode<T : Any>(
            val value: Any,
            val prev: DNode<T>? = null,
            val next: DNode<T>? = null
    ) {
        override fun toString(): String {

                return "$prev<-$value->$next"

        }

    }







}

