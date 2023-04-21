package unit04
fun main(){
    //Ask for the starting number of organisms
    var userOrganisms: Double? = null
    while (userOrganisms == null) {
        print("Please enter starting number of organisms: ")
        val input = readln()
        try {
            userOrganisms = input.toDoubleOrNull()
            if (userOrganisms != null && userOrganisms < 2) {
                println("Invalid input. Please enter a population of at least 2.")
                userOrganisms = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a population of at least 2.")
        }
    }

    //Initiate variable for Daily Average Percentage Increase, then ask for input
    var userDailyAvgPercentage: Double? = null
    while (userDailyAvgPercentage == null){
        print("Please enter the daily average percentage increase: ")
        val percentageInput = readln()
        try {
            userDailyAvgPercentage = percentageInput.toDoubleOrNull()
            if (userDailyAvgPercentage != null && userDailyAvgPercentage < 0.0 || userDailyAvgPercentage!! > 1.0) {
                println("Invalid input. Please enter a positive percentage between 0.0 and 1.0 (ex: 0.1=10%).")
                userDailyAvgPercentage = null
            }
        } catch (e: Exception){
            println("Invalid input. Please enter a positive percentage.")
        }
    }
    //Initiate variable for amount of days to multiply, then ask for input
    var userAmountOfDays: Int? = null
    while (userAmountOfDays == null){
        print("Please enter the amount of days to multiply by: ")
        val daysInput = readln()
        try {
            userAmountOfDays = daysInput.toIntOrNull()
            if (userAmountOfDays != null && userAmountOfDays < 1){
                println("Invalid input. Please enter a number that is at least 1 or greater.")
                userAmountOfDays = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a number that is at least 1 or greater.")
        }
    }
    //Initiate variable for population count, then increase it per day by daily average percentage increase input
    var totalPopulation: Double?
    println("The starting population was $userOrganisms")

    //Loop through each day from 1 to the number of days entered by user
    for (i: Int in 1..userAmountOfDays) if (i <= userAmountOfDays) {
        totalPopulation = ((userDailyAvgPercentage * userOrganisms!!) + userOrganisms)
        println("The population after day $i was $totalPopulation")
        userOrganisms = totalPopulation
        if (i == userAmountOfDays) {
            println("The final population count is estimated to be around $totalPopulation.")
        }
    }
}