package unit04
fun main(){
    //Ask user to input string, then store input into variable
    print("Please enter a string. ")
    val userString: String? = readlnOrNull()

    //Ask user to enter a Character and store input into variable
    println("Please enter a character to count for in your string: ")
    val userChar: Char? = readln().firstOrNull()

    //initialize variable of Character count to 0
    var charCount: Int = 0

    for (i in userString!!) if (userChar!!.equals(i, ignoreCase = true))
        charCount++
    print("Your character entered was counted $charCount times in your string.")
}