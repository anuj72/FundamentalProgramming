


fun main(){
    var names= arrayOf("akhil","anand","amanda","abhi","john","Larry")
    var filterdArrayList=ArrayList<String>()
    for(i in names){
        var count=0
        var name=i
        for(j in 0..name.length-1){


            if(name.get(j).toString() == "a"){
                count += 1
            }
        }

        if(count>=2){
            filterdArrayList.add(i)
        }

    }


    print(filterdArrayList.toString())
}