package ej7

fun main() {
    println(multiplicar(2))

    val op: (Int,Int) -> Int = {a,b -> a+b}
    println(op(1,2))
}


fun multiplicar(num: Int): Int{
    return num*2
}