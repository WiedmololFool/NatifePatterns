package com.max.natifepatterns.factory.gibson

import android.util.Log
import com.max.natifepatterns.Constants
import com.max.natifepatterns.factory.AcousticGuitar
import com.max.natifepatterns.factory.BassGuitar
import com.max.natifepatterns.factory.ElectricGuitar

class GibsonAcousticGuitar: AcousticGuitar {

    override fun play() {
        Log.e(Constants.TAG, "Sounds like Gibson acoustic guitar")
    }
}

class GibsonElectricGuitar: ElectricGuitar{

    override fun play() {
        Log.e(Constants.TAG, "Sounds like Gibson electric guitar")
    }
}

class GibsonBassGuitar: BassGuitar {

    override fun play() {
        Log.e(Constants.TAG, "Sounds like Gibson bass guitar")
    }
}

