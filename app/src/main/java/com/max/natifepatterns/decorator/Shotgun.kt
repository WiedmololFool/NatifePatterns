package com.max.natifepatterns.decorator

class Shotgun : Gun {

    override val damage: Int
        get() = 20

    override fun description(): String {
        return "Shotgun"
    }
}