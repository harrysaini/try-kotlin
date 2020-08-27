package com.harry.classes

//class Person(_firstName:String, _lastName: String) {
//
//    val firstName: String = _firstName
//    val lastName: String = _lastName
//
//
//}


//class Person(_firstName:String, _lastName: String) {
//
//
//    init {
//        println("init 1")
//    }
//
//    val firstName: String = _firstName
//    val lastName: String = _lastName
//
//    constructor(): this("Peter", "Parker") {
//        println("secondary")
//    }
//
//    init {
//        println("init 2")
//    }
//
//}


class Person(val firstName:String = "Peter", val lastName: String = "parker") {

 var nickName: String? = null
    set(value: String?) {
        println("setting niklname to $value")
        field = value
    }
    get() {
        println("the retinr value is $field")
        return field
    }

 fun printInfo() {
     println("$firstName $lastName - ${nickName ?: ""}")
 }
}