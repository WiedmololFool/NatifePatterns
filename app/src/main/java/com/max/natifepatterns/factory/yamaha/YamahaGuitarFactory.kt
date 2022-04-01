package com.max.natifepatterns.factory.yamaha

import com.max.natifepatterns.factory.AcousticGuitar
import com.max.natifepatterns.factory.BassGuitar
import com.max.natifepatterns.factory.ElectricGuitar
import com.max.natifepatterns.factory.GuitarFactory

class YamahaGuitarFactory : GuitarFactory {

    override fun createAcousticGuitar(): AcousticGuitar {
        return YamahaAcousticGuitar()
    }

    override fun createElectricGuitar(): ElectricGuitar {
        return YamahaElectricGuitar()
    }

    override fun createBassGuitar(): BassGuitar {
        return YamahaBassGuitar()
    }
}