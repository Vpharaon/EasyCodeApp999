package com.farionik.easycodeapp999

import android.app.Application
import android.os.Process
import android.util.Log

class App : Application {

    private val handleDeath = HandleDeath.Base()
    private val TAG = "vf"

    constructor() {
        Log.i(TAG, "contructor: application")
    }

    override fun onCreate() {
        super.onCreate()

        Log.i(TAG, "onCreate: application ${Process.myPid()}")
    }

    fun activityCreated(firstOpening: Boolean) {
        if (firstOpening) {
            handleDeath.firstOpening()
            Log.i(TAG, "activityCreated: very first opening")
        } else {
            if (handleDeath.wasDeathHappened()) {
                Log.i(TAG, "activityCreated: death happened")
            } else {
                Log.i(TAG, "activityCreated: just activity recreated")
            }
        }
    }
}