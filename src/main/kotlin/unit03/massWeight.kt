package unit03

fun main(){
    var userObjectMass: Double?
    while (true) {
        print("Please enter Object Mass: ")
        userObjectMass = readln().toDoubleOrNull()
        if (userObjectMass != null && userObjectMass>0.0)
            break
    }

    val constantValue: Double = 9.8
    val objectWeight: Double = userObjectMass!! * constantValue

    println("The Object Weight is $objectWeight").also {
        when (objectWeight) {
            in 0.0..9.999  -> println("The Object is too light.")
            in 10.0..1000.0 -> println("The Object is neither too light or too heavy.")
            else -> println("The Object is too heavy.")
        }
    }
}