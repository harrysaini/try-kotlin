package com.harry.hofs


fun printFilteredList(list: List<String>, predicate: (s: String) -> Boolean) {
    println("-------")
    list.forEach{
        if (predicate(it)){
            println(it)
        }
    }
}

val predicate: (s: String) -> Boolean = {
    it.startsWith("j")
}

fun getEndPredicate(): (s: String) -> Boolean {
    return {
        it.endsWith("t")
    }
}

fun main() {
    val names = listOf("java", "kotlin", "string", "javascript")

    printFilteredList(names, predicate)


    printFilteredList(names){
        it.startsWith("s")
    }

    printFilteredList(names, getEndPredicate())
}