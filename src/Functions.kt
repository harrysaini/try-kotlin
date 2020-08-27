


fun  getGreetings(): String {
    return "Hello world"
}

fun sayHello() {
    println(getGreetings())
}

fun getMessage() = "My message"

fun greet(greeting: String,vararg names: String) {
    names.forEach { name ->
        println("$greeting $name")
    }
}

fun sayHello(name: String) {
    greet("Hello", name)
}



fun main() {
    sayHello()
    println(getMessage())
    sayHello("ram")
    greet("hello", "Kuti", "kotlin", "abc")

    val arr = arrayOf("ram", "shyam", "dham")

    greet("hi", *arr)
}