package Map

class Data(val items : List<String>)

val dataObjects = listOf(
    Data(listOf("a", "b", "c")),
    Data(listOf("1", "2", "3"))
)

val items: List<String> = dataObjects
    .flatMap { it.items } //[a, b, c, 1, 2, 3]

val items2: List<List<String>> = dataObjects
    .map {  it.items } //[[a, b, c], [1, 2, 3]]