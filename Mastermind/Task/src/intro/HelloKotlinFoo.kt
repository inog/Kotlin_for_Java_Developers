package intro

fun main(args:Array<String>){

    println("First, ${foo()}, second ${foo()}")
}

fun foo(): String {
    println("Calculation foo...")
    return "foo"
}
