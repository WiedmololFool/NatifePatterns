package com.max.natifepatterns.factory

interface GuitarFactory {

    fun createAcousticGuitar(): AcousticGuitar

    fun createElectricGuitar(): ElectricGuitar

    fun createBassGuitar(): BassGuitar

}