package unit02

fun main() {
    var totalSales : Double = 4600000.0
    val eastCoastSales : Double = 0.62
    var eastCoastSPrediction = (totalSales)*(eastCoastSales)

    print("The East Coast division will generate $$eastCoastSPrediction this year if the company has $$totalSales" +
            " in sales this year.")

}