package com.harry.factories

import java.util.*

enum class EntityType {
    EASY, MEDIUM, HARD;

    fun getFormattedValue(): String {
        return name.toLowerCase().capitalize()
    }
}


object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedValue()
            EntityType.HARD -> "Hardiboy"
        }

        return Entity(id, name)
    }
}


class Entity(private val id: String, private val name: String) {

    override fun toString(): String {
        return "${hashCode()} - $id - $name"
    }
}


fun main() {
    println(EntityType.MEDIUM.toString()  == "MEDIUM")

    println(EntityType.MEDIUM.toString())

    val ent = EntityFactory.create(EntityType.HARD)

    println(ent)

    val ent2 = EntityFactory.create(EntityType.EASY)

    println(ent2)

    val ent3 = EntityFactory.create(EntityType.MEDIUM)

    println(ent3)
}