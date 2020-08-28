package com.harry.sealed

import java.util.*

enum class EntityType {
    EASY, MEDIUM, HARD, HELP;

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
            EntityType.HARD -> "HaRd"
            EntityType.HELP -> type.name
        }

        return when(type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.HELP -> Entity.Help
        }

    }
}


sealed class Entity {

    object Help: Entity() {
        val name = "Help"
    }

    data class Easy(private val id: String, private val name: String): Entity()
    data class Medium(private val id: String, private val name: String): Entity()
    data class Hard(private val id: String, private val name: String, private val multiplier: Float ): Entity()
}


fun main() {
    val entity: Entity = EntityFactory.create(EntityType.EASY)

    println(entity)

    val msg = when(entity){
        Entity.Help -> "help"
        is Entity.Easy -> "easy"
        is Entity.Medium -> "medium"
        is Entity.Hard -> "hard"
    }

    println(msg)
}