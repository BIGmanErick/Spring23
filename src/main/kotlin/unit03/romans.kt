package unit03

import kotlin.system.exitProcess

fun main() {
    print("Enter a number between 1 and 10: ")

    var userNumber: Int? = readln().toIntOrNull()
    if (userNumber==null){
    println("Error: Please enter a number between 1 and 10.")
    exitProcess(status = 0)}

    when (userNumber) {

        1 -> println("The Roman Numeral is, I")
        2 -> println("The Roman Numeral is, II")
        3 -> println("The Roman Numeral is, III")
        4 -> println("The Roman Numeral is, IV")
        5 -> println("The Roman Numeral is, V")
        6 -> println("The Roman Numeral is, VI")
        7 -> println("The Roman Numeral is, VII")
        8 -> println("The Roman Numeral is, VIII")
        9 -> println("The Roman Numeral is, IX")
        10 -> println("The Roman Numeral is, X")
        else -> println("The Number you entered was not between 1 and 10.")
    }


}
