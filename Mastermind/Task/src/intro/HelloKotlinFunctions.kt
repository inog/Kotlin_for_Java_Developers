package intro

fun main(args:Array<String>){
    println( max(5,3))
    println( maxx(345,31232))
    join()
    displaySeperator('3',5)
    println()
    displaySeperator(size=3, character = '5') //named arguments
    println()
    println("1. " + sum())
    println("2. " + sum(1))
    println("3. " + sum(b=2))
    println("4. " + sum(c=3))
    println("5. " + sum(a=1,b=3))
    println("6. " + sum(a=1,c=3))
    println("7. " + sum(b=3,c=3))
    println("8. " + sum(c=1,a=3,b=3))



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

//how many argument combinations are possible
fun sum(a: Int = 0,b:Int = 0, c:Int = 0) :Int = a + b + c
