package unit02
fun main(){
    val myAge : Int = 21
    var averageAge : Double = 21.0
    averageAge = (( myAge + 30.0)/2.0).also{println(it)}

    val testNumber: Int
    testNumber = 47
    val evenOdd: Int = testNumber % 2
    println(evenOdd)


    var answer : Int = 0

    answer = 1
    answer = answer + 10
    answer = answer *10
    answer = answer *1000


    println(answer)

}