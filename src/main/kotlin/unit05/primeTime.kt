package unit05
fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    val answer: Int = number % divisor
    return (answer == 0)
}
fun isPrime(number: Int): Boolean {
    var amountOfDivisors: Int = 0
    for (i in 2 until number) if (isNumberDivisible(number, i)) {
        amountOfDivisors++
    }
    return amountOfDivisors == 0
}
fun main(){
    println("${isPrime(5)}")
}