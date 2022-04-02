package com.max.natifepatterns.singleton

class SingletonKotlin private constructor() {

    companion object {

        private var instance: SingletonKotlin? = null

        @Volatile
        var value: String = ""

        operator fun invoke() = synchronized(this) {
            if (instance == null) {
                instance = SingletonKotlin()
            }
            instance
        }
    }
}
