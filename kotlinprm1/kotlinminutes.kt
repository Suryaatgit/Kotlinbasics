private fun myFunction(name: String) {
    println("hola, $name")
}

private fun nullornot() {
    var instagramBio: String? = "stout"
    if (instagramBio != null) {
        println(instagramBio.toUpperCase())
    }
    else {
        println("String is null")
    }
    //alternative method
    println(instagramBio?.toUpperCase())
}

fun main() {
    //variables
    println("Hello world")
    val firstname = "Raul"
    var weight = 160
    val myVariable: Double = 2.5

    //operators
    val s1 = "call me,"
    val s2 = "maybe"
    val combined = s1 + s2
    println(combined)

    //string manipulation
    val myString = "kotlin"
    println(myString[0])
    println(myString.length)
    println(myString.isEmpty())
    println("The string is $myString")
    val examScore = 36

    //conditionals
    if (examScore > 40) {
        println("pass")
    }
    else {
        println("fail")
    }

    //collections or dictionaries
    val names = mutableListOf<String>("Mike", "Steve", "Jesse")
    println(names[2])

    //loops
    for (x in names) {
        println(x)
    }
    for (i in 1..5) {
        println(i)
    }
    for (i in 6 until 10) {
        println(i)
    }

    //functions and function call
    myFunction("Stevil")

    //nullability
    nullornot()
}