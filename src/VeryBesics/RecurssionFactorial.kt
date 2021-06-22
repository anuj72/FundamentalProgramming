
fun main(){
    var n=9

    var factorial=fact(n)
    var addAll=AddUntil(9)
    print(addAll)
}

fun AddUntil(i: Int): Int {
    if(i==0){
        return 0
    }else{
        return AddUntil(i-1)+i
    }
}

fun fact(n: Int): Int {
    return if (n == 1) n else n*fact(n-1)

}
