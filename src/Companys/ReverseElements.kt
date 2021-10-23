package Companys

fun main(){
    var paragraph="I am an Indian"
    var rParagraph=paragraph.split(" ").map { it.reversed() }
    var r1Paragraph=paragraph.split(" ").reversed()
    println(rParagraph.joinToString { it })
    println(r1Paragraph)




}