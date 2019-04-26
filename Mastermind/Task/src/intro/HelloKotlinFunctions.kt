package intro

fun main(args:Array<String>){
    println( max(5,3))
    println( maxx(345,31232))
}

// block body
fun max(a:Int , b:Int): Int {
    return if (a > b)  a else b
}

// expression body
fun maxx(a:Int , b:Int) = if (a > b) a else b
