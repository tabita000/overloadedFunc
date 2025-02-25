// You are going to accept customer information from a user. You will ask them if they are a residential or business
//customer. If they are a residential customer you will accept their name and phone number. If they are a business
// customer you will accept their business name, contact name, and phone number.

fun customer(name: String, phone: Int): String {
    return "Residential Customer: $name, $phone"
}

fun customer(businessName: String, businessContact: String, businessPhone: Int): String {
    return "Business Customer: $businessName, Contact: $businessContact, Phone: $businessPhone"
}

fun main() {
    var looping = true
    while (looping) {
        println("\nPlease enter the number of your choice: ")
        println("1. Business customer")
        println("2. Residential customer")
        println("3. Exit")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> {
                println("Please enter the number of your business name:")
                val businessName = readlnOrNull().toString()

                println("Please enter contact name: ")
                val businessContact = readlnOrNull().toString()

                println("Please enter phone number: ")
                val businessPhone  = readlnOrNull().toString().toInt()
                println("\nBusiness Contact details: \n${customer(businessName, businessContact, businessPhone)}")

            }

            2 -> {
                println("Please enter your name:")
                val name = readlnOrNull().toString()

                println("Please enter your phone number:")
                val phone = readlnOrNull()?.toIntOrNull() ?: 0
                println("\nResidential customer contact details: \n${customer(name, phone)}")
            }

            3 -> {
                println("K BYE!")
                looping = false
            }
            else -> println("Invalid input. Please enter 1, 2, 0r 3. ")
        }
    }
}

//EXAMPLE FROM LECTURE
// fun addSomeNumbers(x: Int, y: Int): Int {
//    var ans = x + y
//     return ans
//}
//
//fun addSomeNumbers(x: Int, y: Int, z: Int): Int {
//    var ans = x + y + z
//    return ans
//}
//
// fun main() {
//     var z = addSomeNumbers(2,3)
//     println(z)
// }