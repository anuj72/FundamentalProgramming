package HackerRank
//https://www.hackerrank.com/challenges/kangaroo
fun main(){
    var meet="NO"
    var x1=28
    var v1=8
    var x2=96
    var v2=2
    if(x2>x1 && v2>v1){
         meet="NO"
    }else{
        for(i in 1 until  10000){
            if(x1+v1*i==x2+v2*i){
                    meet="YES"
                    break
                } }
    }

    print(meet)

}