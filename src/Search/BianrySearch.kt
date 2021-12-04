package Search

fun main(){
    var mynum= listOf(1,2,3,4,55,56,66,677)
    var fele=56
    var first=0
    var last=mynum.size-1
    var pos=-1

    while (first<last){
        var  mid= (first+last)/2
        if(mynum[mid]==fele){
            pos=mid
            break
        }else if(mynum[mid]<fele){
            first= mid+1
        }else if(mynum[mid]>fele){
           last= mid-1
        }
    }
        print(pos)


}







