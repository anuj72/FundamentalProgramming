package HackerRank

import java.text.SimpleDateFormat
import java.util.*


fun main() {
    var input = "01:00:00PM"
    var df = SimpleDateFormat("hh:mm:ssaa")
    var outputformat = SimpleDateFormat("HH:mm:ss")
    var date: Date? = null;
    var output: String? = null;
    try {
        date = df.parse(input)
        output = outputformat.format(date)
        println(output)
    } catch (e: Exception) {

    }
}