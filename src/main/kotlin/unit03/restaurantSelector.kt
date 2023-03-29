package unit03
fun main(){
    // Initialize restaurant data
    val restaurants = listOf(
        mapOf("name" to "Joe's Gourmet Burgers", "vegetarian" to false, "vegan" to false, "glutenFree" to false),
        mapOf("name" to "Main Street Pizza Company", "vegetarian" to true, "vegan" to false, "glutenFree" to true),
        mapOf("name" to "Corner Café", "vegetarian" to true, "vegan" to true, "glutenFree" to true),
        mapOf("name" to "Mama's Fine Italian", "vegetarian" to true, "vegan" to false, "glutenFree" to false),
        mapOf("name" to "The Chef's Kitchen", "vegetarian" to true, "vegan" to true, "glutenFree" to true)
    )

    // Ask for dietary restrictions
    println("Is anyone in your party a vegetarian? ")
    val isVegetarian: Boolean = readlnOrNull()?.equals("yes", ignoreCase = true) ?: false

    println("Is anyone in your party a vegan? ")
    val isVegan: Boolean = readlnOrNull()?.equals("yes", ignoreCase = true) ?: false

    println("Is anyone in your party gluten-free? ")
    val isGlutenFree = readlnOrNull()?.equals("yes", true) ?: false

    // Filter restaurant options based on dietary restrictions
    val restaurantOptions: List<Map<String, Any>> = restaurants.filter { restaurant ->
        (!isVegetarian || restaurant["vegetarian"] == true) &&
        (!isVegan || restaurant["vegan"] == true) &&
        (!isGlutenFree || restaurant["glutenFree"] == true)
    }

    // Display restaurant options
    println("Here are your restaurant choices based on your party's dietary restrictions:")
    restaurantOptions.forEach { restaurant ->
        println("${restaurant["name"]}")
    }

}