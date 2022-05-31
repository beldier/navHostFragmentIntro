package com.example.navhostfragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DestinationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)

        val receivedMessage = intent.getStringExtra("messageValue")
        val text = findViewById<TextView>(R.id.messageReceived)
        text.text = receivedMessage
    }
}