package unit03
fun main(args: Array<String>) {
    var userWeight: Double?
    while (true) {
        print("Please enter your Weight in Pounds: ")
        userWeight = readln().toDoubleOrNull()
        if (userWeight != null && userWeight>0.0)
            break
    }
    var userHeight: Double?
    while (true) {
        print("Please enter your Height in Inches: ")
        userHeight = readln().toDoubleOrNull()
        if (userHeight != null && userHeight>0.0)
            break
    }
    val heightExponent: Double = 2.0
    val finalHeight: Double = Math.pow(userHeight!!, heightExponent)

    val userBMI: Double = (userWeight!! * 703)/(finalHeight)
    val userDescription: String = ("Your BMI is $userBMI.")
    println(userDescription).also {
        when (userBMI) {
            in 0.0..18.499 -> println("According to your BMI, you are considered underweight.")
            in 18.5..25.0 -> println("According to your BMI, you are considered to be at optimal weight.")
            else -> println("According to your BMI, you are considered overweight.")
        }
    }
}