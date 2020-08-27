package com.harry.classes

fun main() {
    val person = Person("ram", "dev")

    println(person.firstName)
    println(person.lastName)


    val person2 = Person()

    println(person2.firstName)
    println(person2.lastName)

//    person2.firstName = "das"

    person2.nickName = "ramu"

    person2.nickName = "babu"

    println(person2.nickName)


    person2.printInfo()
    person.printInfo()
}