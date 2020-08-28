package com.harry.companions


interface IdProvider{
    fun getId(): String
}

private class Entity(private val id: String) {

    companion object Factory: IdProvider {
        override fun getId(): String {
            return Math.random().toString()
        }

        private const val id = "34"


        fun create() = Entity(id);

        fun new() = Entity(getId())
    }

    override fun toString(): String {
        return "${hashCode()} - $id"
    }
}


fun main() {
//    val ent = Entity.Factory.create()

    val ent = Entity.create();

    println(ent)

    val ent2 = Entity.new()

    println(Entity.getId())

    println(ent2)
}