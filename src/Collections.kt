
fun main() {
//    val things = arrayOf("I", "Rock", "paper", "scissor");

    val things = listOf("I", "Rock", "paper", "scissor")
    println(things.size)
    println(things[0])
    println(things.get(0))

    printAll(things)

    printAllSecondWay(things)


    val map = mapOf(1 to "A", 2 to "b")

   map.forEach { t, u -> print("$t -> $u \n")  }
}

private fun printAll(things: List<String>) {
    for (thing in things) {
        println(thing)
    }
}


private fun printAllSecondWay(things: List<String>) {
    things.forEach { thing ->
        println(thing)
    }

    things.forEachIndexed{ index, thing ->
        println("$thing is at index $index")
    }
}

