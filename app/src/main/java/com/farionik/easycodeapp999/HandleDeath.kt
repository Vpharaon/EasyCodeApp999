package com.farionik.easycodeapp999

interface HandleDeath {

    fun firstOpening()

    fun wasDeathHappened(): Boolean

    fun deathHappened()

    class Base : HandleDeath {

        private var deathHappened = true
        override fun firstOpening() {
            deathHappened = false
        }

        override fun wasDeathHappened(): Boolean {
            return deathHappened
        }

        override fun deathHappened() {
            deathHappened = true
        }
    }
}