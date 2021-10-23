package Collection.operator

fun main(){
    var arr= listOf("👽","🏦","🎂","🥑","🚨","👽","🏦","🎂","🥑","🚨")
    var myarr=arr.chunked(3)

    var myarr1=arr.slice(0..2)
    var myarr2=arr.windowed(3)
    println(myarr)
    println(myarr1)
    println(myarr2)
    println(myarr2.flatten())

    //results
    /*[[👽, 🏦, 🎂], [🥑, 🚨, 👽], [🏦, 🎂, 🥑], [🚨]]
    [👽, 🏦, 🎂]
    [[👽, 🏦, 🎂], [🏦, 🎂, 🥑], [🎂, 🥑, 🚨], [🥑, 🚨, 👽], [🚨, 👽, 🏦], [👽, 🏦, 🎂], [🏦, 🎂, 🥑], [🎂, 🥑, 🚨]]
    [👽, 🏦, 🎂, 🏦, 🎂, 🥑, 🎂, 🥑, 🚨, 🥑, 🚨, 👽, 🚨, 👽, 🏦, 👽, 🏦, 🎂, 🏦, 🎂, 🥑, 🎂, 🥑, 🚨]*/
}