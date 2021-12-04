package LinkList

fun main() {
    var myLinkList = Node("0",Node("1", Node("2", Node("3"))))
    var mlist = myLinkList.toString()
    print(mlist)
    myLinkList.reverseLinkList()
}


data class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        if (next != null) {
            return "$value->${next?.toString()}"
        } else {
            return "$value"
        }
    }

    fun reverseLinkList(){

        next?.reverseLinkList()
        if(next!=null){
            print("->")
        }
            print(value)

    }

}