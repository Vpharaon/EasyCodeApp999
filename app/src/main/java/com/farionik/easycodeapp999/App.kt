package com.farionik.easycodeapp999

import android.app.Application
import android.os.Process
import android.util.Log

class App : Application {

    private val TAG = "vf"

    constructor() {
        Log.i(TAG, "contructor: application")
    }

    override fun onCreate() {
        super.onCreate()

        Log.i(TAG, "onCreate: application ${Process.myPid()}")
    }
}