package com.max.natifepatterns.decorator

abstract class GunDecorator(private val gun: Gun): Gun {

    override val damage: Int
        get() = gun.damage

    override fun description(): String {
        return gun.description()
    }
}