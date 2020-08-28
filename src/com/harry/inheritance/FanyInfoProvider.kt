package com.harry.inheritance

import com.harry.classes.Person
import com.harry.interfaces.BasicInfoProvider
import com.harry.interfaces.PersonInfoProvider

class FancyInfoProvider: BasicInfoProvider() {


    override val sessionPrefix: String
        get() = "fancy_"


    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("fancy printing above")
    }

    override val providerInfo: String
        get() = super.providerInfo
}


fun main() {
//    val provider: FancyInfoProvider = FancyInfoProvider()
//
//    provider.printInfo(Person())
//
//    println(provider.getSession())



    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "annonymous"

        fun getSession() = "id"
    }

    provider.printInfo(Person())

    println(provider.getSession())


}