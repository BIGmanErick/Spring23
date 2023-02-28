 package unit03

 import kotlin.system.exitProcess

 fun main() {
     print("Please enter the month you were born (in numeric form) : ")
     var birthMonth: Int? = readln().toIntOrNull()
     if (birthMonth == null) {
         println("Error: Please enter the month in numeric form.")
         exitProcess(status = 0)
     }
     when (birthMonth) {
         in 1..12 -> null
         else -> println("Please enter a valid month.").also {exitProcess(status = 0) }


         }

     print("Please enter the day you were born (in numeric form) : ")
     var dayOfBirth: Int? = readln().toIntOrNull()
     if (dayOfBirth == null) {
         println("Error: Please enter the day you were born in numeric form.")
         exitProcess(status = 0)
     }

     print("Please enter the year you were born (two-digits) : ")
     var yearOfBirth: Int? = readln().toIntOrNull()
     when (yearOfBirth) {
         null -> println("Error: Please enter only two-digits.").also { exitProcess(status = 0)}
         in 0..99 -> null
         else -> println("Please enter only two-digits for the birth year.").also { exitProcess(status = 0)}
     }

     var monthAndDay: Int = birthMonth * dayOfBirth
     if (monthAndDay == yearOfBirth) {
         println("The Date ($birthMonth/$dayOfBirth/$yearOfBirth) is Magic!")
     } else {
         println("The Date ($birthMonth/$dayOfBirth/$yearOfBirth) is Not Magic.")
     }


 }