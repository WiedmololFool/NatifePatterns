package com.max.natifepatterns.adapter

class SocketAdapter(private val americanSocket: AmericanSocket) : EuroSocket {

    override fun getPower() {
        americanSocket.getPower()
    }
}