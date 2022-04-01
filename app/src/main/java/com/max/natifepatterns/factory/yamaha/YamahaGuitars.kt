package com.max.natifepatterns.factory.yamaha

import android.util.Log
import com.max.natifepatterns.Constants
import com.max.natifepatterns.factory.AcousticGuitar
import com.max.natifepatterns.factory.BassGuitar
import com.max.natifepatterns.factory.ElectricGuitar

class YamahaAcousticGuitar : AcousticGuitar {

    override fun play() {
        Log.e(Constants.TAG, "Sounds like Yamaha acoustic guitar")
    }
}

class YamahaElectricGuitar : ElectricGuitar {

    override fun play() {
        Log.e(Constants.TAG, "Sounds like Yamaha electric guitar")
    }
}

class YamahaBassGuitar : BassGuitar {

    override fun play() {
        Log.e(Constants.TAG, "Sounds like Yamaha bass guitar")
    }
}