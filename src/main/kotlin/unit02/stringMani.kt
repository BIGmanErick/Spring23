/* Erick Aguinaga, stringManipulator, 02.22.23 */
package unit02
fun main() {
    print("Enter your favorite city: ")
    val userFavoriteCity: String = readln()
    println("Number of characters: " + userFavoriteCity.length)

    println(userFavoriteCity.uppercase())

    println(userFavoriteCity.lowercase())

    println(userFavoriteCity.first())

}




