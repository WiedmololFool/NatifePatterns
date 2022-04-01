package com.max.natifepatterns.decorator

class Pistol : Gun {

    override val damage: Int
        get() = 5

    override fun description(): String {
        return "Pistol"
    }
}