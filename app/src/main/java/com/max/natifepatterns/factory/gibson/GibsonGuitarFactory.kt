package com.max.natifepatterns.factory.gibson

import com.max.natifepatterns.factory.AcousticGuitar
import com.max.natifepatterns.factory.BassGuitar
import com.max.natifepatterns.factory.ElectricGuitar
import com.max.natifepatterns.factory.GuitarFactory

class GibsonGuitarFactory : GuitarFactory {

    override fun createAcousticGuitar(): AcousticGuitar {
        return GibsonAcousticGuitar()
    }

    override fun createElectricGuitar(): ElectricGuitar {
        return GibsonElectricGuitar()
    }

    override fun createBassGuitar(): BassGuitar {
        return GibsonBassGuitar()
    }
}