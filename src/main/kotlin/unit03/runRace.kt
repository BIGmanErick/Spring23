package unit03
fun main(){
    println("Please enter three names with time it took for them to finish the race.")
    var nameOne: String?
    var nameTwo: String?
    var nameThree: String?
    var nOneTime: Double?
    var nTwoTime: Double?
    var nThreeTime: Double?

    while (true){
        print("Please enter Name 1: ")
        nameOne = readlnOrNull()
        if (nameOne != null)
            break
    }
    while (true){
        print("Please enter a time in minutes for $nameOne: ")
        nOneTime = readln().toDoubleOrNull()
        if (nOneTime != null)
            break
        }
    while (true){
        print("Please enter Name 2: ")
        nameTwo = readlnOrNull()
        if (nameTwo != null)
            break
    }
    while (true){
        print("Please enter a time in minutes for $nameTwo: ")
        nTwoTime = readln().toDoubleOrNull()
        if (nTwoTime != null)
            break
    }
    while (true){
        print("Please enter Name 3: ")
        nameThree = readlnOrNull()
        if (nameThree != null)
            break
    }
    while (true){
        print("Please enter a time in minutes for $nameThree: ")
        nThreeTime = readln().toDoubleOrNull()
        if (nThreeTime != null)
            break
    }

    val runTimes: Map<String, String?> = mapOf("$nOneTime" to nameOne, "$nTwoTime" to nameTwo, "$nThreeTime" to nameThree)
    println("Runners sorted by the fastest race time: ${runTimes.toSortedMap()}")
}