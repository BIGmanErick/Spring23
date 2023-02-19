package unit02
fun main(args: Array<String>){

    print("Number of cookies you ate: ")

    var cookiesAte = readln()!!
    var numberCookiesAte: Int = cookiesAte.toInt()

    val cookieCal = 75

    var totalCaloriesAte = (numberCookiesAte) * (cookieCal)


    println("You ate: $totalCaloriesAte calories.")

}