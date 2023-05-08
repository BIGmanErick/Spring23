package unit05
fun fibonacci(number: Int): Int {
    if (number <= 2) {
        return 1
    }
    var prev1 = 1
    var prev2 = 1
    var fib = 0
    for (i in 3..number) {
        fib = prev1 + prev2
        println(fib)
        prev2 = prev1
        prev1 = fib
    }
    return fib
}
fun main(){
    fibonacci(10)
}