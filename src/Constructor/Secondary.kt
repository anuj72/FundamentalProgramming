package Constructor


fun main(){}

open class Secondary {
    constructor(name: String)  {}
    constructor(name: String,lastName:String)  {}

}

class ExtendSecondary: Secondary {
    constructor(name: String):super(name)  {}
    constructor(name: String,lastName:String):super(name,lastName)  {}
}