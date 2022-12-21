package com.tutorials.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtView = findViewById<TextView>(R.id.textName)
        val btnView = findViewById<Button>(R.id.clickMe)
        var timesClicked = 0
        btnView.setOnClickListener {
            timesClicked += 1
            txtView.text = timesClicked.toString()
            Toast.makeText(this, "Hey this is toast!", Toast.LENGTH_SHORT).show()
        }

    }
}