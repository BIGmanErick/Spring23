package unit02
fun main(args: Array<String>){
    print("Principle Amount: ")

    var userPrinciple = readln()!!
    var userPrincipleAmount: Double = userPrinciple.toDouble()

    print("Annual Interest Rate: ")

    var userAnnual: String = readln()!!
    var userAnnualRate: Double = userAnnual.toDouble()

    print("Number of times per year Interest is compounded: ")

    var userInterestPerYear: String = readln()!!
    var userNumberOfInterestPerYear: Double = userInterestPerYear.toDouble()

    print("Total Number of Years: ")

    var userYears: String = readln()!!
    var userTotalYears : Double = userYears.toDouble()
    val constant1: Double = 1.0

    var exponent: Double = userNumberOfInterestPerYear * userTotalYears
    var baseTotalAmountOfMoney: Double = ((((userAnnualRate) / (userNumberOfInterestPerYear)) + constant1 ))

    var totalAmountOfMoney: Double = Math.pow(baseTotalAmountOfMoney, exponent)
    var finalTotalAmount: Double = userPrincipleAmount * totalAmountOfMoney

    println("The total amount of money expected to earned is $finalTotalAmount.")


}