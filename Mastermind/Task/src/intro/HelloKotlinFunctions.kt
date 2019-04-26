package intro

fun main(args:Array<String>){
    println( max(5,3))
    println( maxx(345,31232))
    join()
    displaySeperator('3',5)
    println()
    displaySeperator(size=3, character = '5') //named arguments
}

// block body
fun max(a:Int , b:Int): Int {
    return if (a > b)  a else b
}

// expression body
fun maxx(a:Int , b:Int) = if (a > b) a else b

// named arguments
fun join(){
    println(listOf('a','b','c').joinToString ( "","[","]" ))
}

fun displaySeperator(character: Char = '*', size: Int = 10){
    repeat(size){
        print(character)
    }
}

