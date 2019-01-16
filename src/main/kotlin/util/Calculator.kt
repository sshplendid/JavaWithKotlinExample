package util

class Calculator {

    companion object {
        fun sum(a: Int, b: Int): Int = a + b
        fun sub(a: Int, b: Int): Int {
            return a - b
        }
    }
}

fun main(args: Array<String>) {
    println(Calculator.sum(2, 2))
}
