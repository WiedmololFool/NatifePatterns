package com.max.natifepatterns.singleton

class SingletonKotlin private constructor() {

    var value: String = ""

    companion object {

        @Volatile
        private var INSTANCE: SingletonKotlin? = null

        fun getInstance(): SingletonKotlin? {
            if (INSTANCE == null) {
                synchronized(this) {
                    if (INSTANCE == null) {
                        INSTANCE = SingletonKotlin()
                    }
                }
            }
            return INSTANCE
        }
    }
}
