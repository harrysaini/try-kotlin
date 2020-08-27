fun main() {
    println("hello world")

    variables()

    conditionals()
}


fun variables() {
    val name: String = "Nate";

    var greeting = "hello";

    print("$name $greeting \n");

    greeting = "hi"

    print("$name $greeting \n")
}

var greeting: String? = null;

fun  conditionals() {
    greeting = if (greeting != null) greeting else "hi"

    if(greeting != null) {
        println(greeting)
    }

    greeting = null

    val str: String? = when(greeting) {
        null -> {
            print("abc")
            print("Hello")
            "Hi world"

        }
        else -> greeting
    }

    println(str)
}