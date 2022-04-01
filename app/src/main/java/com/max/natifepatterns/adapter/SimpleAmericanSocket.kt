package com.max.natifepatterns.adapter

import android.util.Log
import com.max.natifepatterns.Constants

class SimpleAmericanSocket: AmericanSocket {

    override fun getPower() {
        Log.e(Constants.TAG, "get 110 volt")
    }
}