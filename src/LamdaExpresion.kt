fun main() {

    val contohLambda: (String, String) -> String = {
        firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Presiden", "Indonesia")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Mie Ayam Cicak"))

    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Bakso 99 Kurang satu"))
}