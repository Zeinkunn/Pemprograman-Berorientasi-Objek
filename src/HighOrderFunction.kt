import javax.xml.transform.Transformer

fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = { value: String -> value.toUpperCase() }
    println(hello("Prabowo", lambdaUpper))

    println(hello("Prabowo", { value: String -> value.toLowerCase() }))

    val result1 = hello("Prabowo", { value: String -> value.toLowerCase()})
    val result2 = hello("Prabowo", { value: String -> value.toLowerCase() })
}