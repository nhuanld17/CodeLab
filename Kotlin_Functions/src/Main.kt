fun main(args: Array<String>) {
    println("Hello World!")
    val isUnit = println("This is an expression")
    println(isUnit)

    println()

    val temperature = 10
    val isHot = if (temperature > 5) true else false
    println(isHot)

    println()

    val message = "The water temperature is ${ if (temperature > 5) "too warm" else "Ok"}"
    println(message)


}