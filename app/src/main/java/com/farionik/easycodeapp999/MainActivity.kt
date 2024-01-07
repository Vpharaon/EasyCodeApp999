package com.farionik.easycodeapp999

import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity {

    private val TAG: String = "vf"

    constructor() {
        Log.i(TAG, "MainActivity constructor")
    }

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "onCreate: MainActivity ${savedInstanceState.hashCode()}")

        count = savedInstanceState?.getInt(TAG) ?: 0

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = count.toString()
        textView.setOnClickListener {
            Toast.makeText(it.context, "Click on view", Toast.LENGTH_SHORT).show()
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            count++
            textView.text = count.toString()
            Toast.makeText(it.context, "Click on button", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if (newConfig.uiMode and Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES) {
            Log.i(TAG, "onConfigurationChanged: device night mode")
        } else {
            Log.i(TAG, "onConfigurationChanged: device default mode")
        }
    }
    
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState: ${outState.hashCode()}")
        outState.putInt(TAG, count)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: ")
    }
}