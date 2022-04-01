package com.max.natifepatterns.decorator

class Rifle: Gun {

    override val damage: Int
        get() = 10

    override fun description(): String {
        return "Rifle"
    }
}