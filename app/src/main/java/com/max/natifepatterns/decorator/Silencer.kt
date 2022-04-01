package com.max.natifepatterns.decorator

class Silencer(gun: Gun): GunDecorator(gun) {

    override val damage: Int
        get() = super.damage + 3

    override fun description(): String {
        return super.description() + descriptionWithSilencer()
    }

    private fun descriptionWithSilencer(): String {
        return " with Silencer"
    }
}