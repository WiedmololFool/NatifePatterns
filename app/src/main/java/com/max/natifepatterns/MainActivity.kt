package com.max.natifepatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.max.natifepatterns.adapter.Radio
import com.max.natifepatterns.adapter.SimpleAmericanSocket
import com.max.natifepatterns.adapter.SocketAdapter
import com.max.natifepatterns.builder.House
import com.max.natifepatterns.decorator.OpticalSight
import com.max.natifepatterns.decorator.Pistol
import com.max.natifepatterns.decorator.Shotgun
import com.max.natifepatterns.decorator.Silencer
import com.max.natifepatterns.factory.gibson.GibsonGuitarFactory
import com.max.natifepatterns.factory.yamaha.YamahaGuitarFactory
import com.max.natifepatterns.singleton.SingletonJava
import com.max.natifepatterns.singleton.SingletonKotlin


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SingletonJava
        Log.e(Constants.TAG, SingletonJava.getInstance("Value of Singleton Java").value )

        //SingletonKotlin
        SingletonKotlin.value = "Value of Singleton Kotlin"
        Log.e(Constants.TAG, SingletonKotlin.value )

        //Adapter
        val simpleAmericanSocket = SimpleAmericanSocket()
        val radio = Radio()
        val euroSocket = SocketAdapter(simpleAmericanSocket)
        radio.listenToMusic(euroSocket = euroSocket)

        //Builder
        val house: House = House.Builder()
            .buildDoors(10)
            .buildRooms(5)
            .buildGarage()
            .build()
        Log.e(Constants.TAG, house.toString())

        //Abstract factory
        val factory = GibsonGuitarFactory()
        factory.createAcousticGuitar().play()
        factory.createElectricGuitar().play()
        factory.createBassGuitar().play()

        //Decorator
        val pistolWithSilencer = Silencer(Pistol())
        val pistolWithSilencerAndOpticalSight = OpticalSight(pistolWithSilencer)
        val shotgun = Shotgun()
        val shotgunWithSilencer = Silencer(shotgun)
        Log.e(Constants.TAG,
            "${pistolWithSilencer.damage} ${pistolWithSilencer.description()}" )
        Log.e(Constants.TAG,
            "${pistolWithSilencerAndOpticalSight.damage} ${pistolWithSilencerAndOpticalSight.description()}" )
        Log.e(Constants.TAG,
            "${shotgun.damage} ${shotgun.description()}" )
        Log.e(Constants.TAG,
            "${shotgunWithSilencer.damage} ${shotgunWithSilencer.description()}" )
    }
}