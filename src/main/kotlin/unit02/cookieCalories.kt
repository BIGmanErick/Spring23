package unit02
fun main(args: Array<String>){

    print("Number of cookies you ate: ")

    var cookiesAte = readln()!!
    var numberCookiesAte: Double = cookiesAte.toDouble()

    val cookieCal = 75

    var totalCaloriesAte: Double = (numberCookiesAte) * (cookieCal)


    println("You ate: $totalCaloriesAte calories.")

}