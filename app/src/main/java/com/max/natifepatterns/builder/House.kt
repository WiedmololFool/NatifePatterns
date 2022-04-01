package com.max.natifepatterns.builder

data class House(
    val windows: Int,
    val doors: Int,
    val rooms: Int,
    val hasGarage: Boolean,
    val hasPool: Boolean
) {

    class Builder() {

        private var windows = 6
        private var doors = 3
        private var rooms = 2
        private var hasGarage = false
        private var hasPool = false

        fun buildWindows(value: Int): Builder {
            this.windows = value
            return this
        }

        fun buildDoors(value: Int): Builder {
            this.doors = value
            return this
        }

        fun buildRooms(value: Int): Builder {
            this.rooms = value
            return this
        }

        fun buildGarage(): Builder {
            this.hasGarage = true
            return this
        }

        fun buildPool(): Builder {
            this.hasPool = true
            return this
        }

        fun build(): House {
            return House(
                windows = windows,
                doors = doors,
                rooms = rooms,
                hasGarage = hasGarage,
                hasPool = hasPool
            )
        }
    }
}