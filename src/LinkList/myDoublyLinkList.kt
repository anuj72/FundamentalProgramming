package LinkList

import java.util.*

fun main(){
    var mdlist = DoublyLinkedList()
    mdlist.addAtHead("aa")
    mdlist.addAtIndex("bb",1)
    mdlist.addAtTail("ccc")
   print(mdlist.head?.element)

    mdlist.head?.next?.element


}



class DoublyLinkedList {
    var length = 0
    var head:Node? = null
    var tail:Node? = null

    inner class Node(var element: Any?){
        var prev: Node? = null
        var next:Node? = null
    }

    fun addAtHead(element: Any?){
        val h = this.head
        val newNode = Node(element)
        newNode.next = this.head
        head = newNode
        if (h == null) tail = newNode else h.prev = newNode
        this.length++
    }

    fun addAtTail(element: Any?){
        var h = this.head
        val newNode = Node(element)
        newNode.next = null
        while (h?.next != null){
            h = h.next
        }
        h?.next = newNode
        newNode.prev = h
        tail = newNode
        this.length++
    }

    fun get(index: Int): Any?{
        if (index >= this.length || index < 0) return -1
        var curr = 0
        var h = this.head
        while (curr < index){
            h = h?.next
            curr++
        }
        return h!!.element
    }

    fun addAtIndex(element: Any?, index: Int){
        if (index > this.length || index < 0) return
        if (index == 0) addAtHead(element)
        if (index == length) addAtTail(element)
        val newNode = Node(element)
        var h = this.head
        var curr = 0
        while (curr < index-1){
            h = h?.next
            curr++
        }
        val nextNode = h?.next
        newNode.next = nextNode
        nextNode?.prev = newNode
        h?.next = newNode
        newNode.prev = h
        this.length++
    }

    fun deleteAtIndex(index: Int){
        if (index >= length || index < 0) return
        var h = head
        var curr = 0
        while (curr < index){
            h = h?.next
            curr++
        }
        val hPrev = h?.prev
        val hNext = h?.next
        hPrev?.next = hNext
        hNext?.prev = hPrev
        length--
    }
}