package com.farionik.easycodeapp999

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {
            Toast.makeText(it.context, "Click on view", Toast.LENGTH_SHORT).show()
        }

        val button = findViewById<Button>(R.id.button)
    }
}