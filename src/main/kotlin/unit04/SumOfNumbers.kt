package unit04

fun main() {
    // Initialize variable x to 0
    var x: Int? = 0
    // Initialize variable sum to 0
    var sum: Int? = 0

    // Ask user for positive nonzero integer
    print("Please enter a positive, nonzero, number: ")
    var userInput: Int = readln().toInt()

    // Use loop to get sum of all Int from 1 up to user Input value
        while (x!! <= userInput)
            for (i in 1..userInput){
                sum = i
                sum += i
                x++
            }
            println(sum!!)


        }
