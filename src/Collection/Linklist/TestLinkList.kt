package Collection.Linklist


fun main() {
    var nodeList = MyNode(1, MyNode(2, MyNode(3)))

    println(nodeList.toString())

    var linkList = LinkList<Int>()
    linkList.push(1)
    linkList.push(2)
    linkList.push(3)
    println(linkList.toString())

}


data class MyNode<T>(val value: T?, var next: MyNode<T>? = null) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> $next"
        } else {
            "$value"
        }
    }
}

class LinkList<T>() {
    var head: MyNode<T>? = null
    var tail: MyNode<T>? = null
    var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "list Empty"
        } else {
            head.toString()
        }
    }

    fun push(value: T) {
        //add front value
        head = MyNode(value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
    }

    fun append() {
        //add end value
    }

    fun insert() {
        //insert  between value

    }

}
