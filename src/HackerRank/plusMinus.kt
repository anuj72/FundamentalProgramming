import java.text.DecimalFormat


fun main(){
    var arr= arrayOf(1,1,0,-1,-1)
    var positive=0
    var negative=0
    var zeros=0

    for(i in arr){
        when{
            (i==0)->{
             zeros++
            }
            (i>0)->{
            positive++
            }
            (i<0)->{
             negative++
            }
        }
    }
    val df = DecimalFormat("#.#####")
    df.format(0.912385)
    var positiveRatio: Double = (positive).toDouble()/(positive+negative+zeros)
    var negativeRatio: Double=(negative).toDouble()/(positive+negative+zeros)
    var   zerosRatio: Double=(zeros).toDouble()/(positive+negative+zeros)

    print("$positiveRatio")
    print("$negativeRatio")
    print("$zerosRatio")




}