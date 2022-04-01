package com.max.natifepatterns.factory.fender

import com.max.natifepatterns.factory.AcousticGuitar
import com.max.natifepatterns.factory.BassGuitar
import com.max.natifepatterns.factory.ElectricGuitar
import com.max.natifepatterns.factory.GuitarFactory

class FenderGuitarFactory: GuitarFactory {

    override fun createAcousticGuitar(): AcousticGuitar {
        return FenderAcousticGuitar()
    }

    override fun createElectricGuitar(): ElectricGuitar {
        return FenderElectricGuitar()
    }

    override fun createBassGuitar(): BassGuitar {
        return FenderBassGuitar()
    }
}