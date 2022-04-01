package com.max.natifepatterns.factory.fender

import android.util.Log
import com.max.natifepatterns.Constants
import com.max.natifepatterns.factory.AcousticGuitar
import com.max.natifepatterns.factory.BassGuitar
import com.max.natifepatterns.factory.ElectricGuitar

class FenderAcousticGuitar: AcousticGuitar {

    override fun play() {
      Log.e(Constants.TAG, "Sounds like Fender acoustic guitar")
    }
}

class FenderElectricGuitar: ElectricGuitar{

    override fun play() {
        Log.e(Constants.TAG, "Sounds like Fender electric guitar")
    }
}

class FenderBassGuitar: BassGuitar {

    override fun play() {
        Log.e(Constants.TAG, "Sounds like Fender bass guitar")
    }
}

