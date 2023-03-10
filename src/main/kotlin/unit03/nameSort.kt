package unit03
fun main(){
    println("Please enter three names")
    var nameOne: String?
    var nameTwo: String?
    var nameThree: String?

    while (true) {
        print("Enter the first name: ")
        nameOne = readlnOrNull()
        if (nameOne != null)
            break
    }
    while (true) {
        print("Enter the second name: ")
        nameTwo = readlnOrNull()
        if (nameTwo != null)
            break
    }
    while (true){
        print("Enter the third name: ")
        nameThree = readlnOrNull()
        if (nameThree != null)
            break
    }

    val allNames: ArrayList<String> = arrayListOf<String>("$nameOne", "$nameTwo", "$nameThree")
    println("All three names sorted in alphabetical order: ${allNames.sorted()} ")

}