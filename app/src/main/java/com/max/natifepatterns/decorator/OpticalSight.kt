package com.max.natifepatterns.decorator

class OpticalSight(gun: Gun) : GunDecorator(gun) {

    override val damage: Int
        get() = super.damage + 5

    override fun description(): String {
        return super.description() + descriptionWithOpticalSight()
    }

    private fun descriptionWithOpticalSight(): String {
        return " with Optical Sight"
    }
}