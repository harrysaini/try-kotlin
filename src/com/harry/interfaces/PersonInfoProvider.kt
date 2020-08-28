package com.harry.interfaces

import com.harry.classes.Person

interface PersonInfoProvider {

    val providerInfo: String;

    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionProvider {
    fun getSession(): String
}

open class BasicInfoProvider: PersonInfoProvider, SessionProvider {

    override val providerInfo: String
        get() = "basicProvider"

    protected open val sessionPrefix: String = "basic_";

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional")
    }

    override fun getSession(): String {
        return sessionPrefix
    }
}

fun checkTypes(provider: PersonInfoProvider) {
    if(provider !is SessionProvider) {
        println("not session")
    } else {
        println("is Session")

        print((provider as SessionProvider).getSession())

        print(provider.getSession())
    }
}

fun main() {
    val provider = BasicInfoProvider()

    provider.printInfo(Person())

    checkTypes(provider)
}