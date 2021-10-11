package MountyFavourite


fun main(){
    var str="qja<<kk!!q#$1"
    var myHashmap=HashMap<Int,String>()
    var marray=ArrayList<String>()
    var farray= mutableListOf<String>()
    str.forEachIndexed { index, char->
        if(char.toString() in "a".."z"){
         marray.add(char.toString())
        }else{
         myHashmap.set(index,char.toString())
        }
    }
   farray= marray.reversed().toMutableList()
    myHashmap.keys.forEach{
        farray.add(it,myHashmap[it].toString())
    }
    print(farray.toString())



}