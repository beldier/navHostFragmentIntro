package com.example.navhostfragmentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        val button = findViewById<Button>(R.id.actionButton)
        val text = findViewById<EditText>(R.id.editText)
        button.setOnClickListener{
            val intent = Intent(this, DestinationActivity::class.java)
            val message : String = text.text.toString()
            intent.putExtra ("messageValue",message)
            startActivity(intent)
        }
    }

    companion object{
        const val KEY_MESSAGE = "messageValue"
    }
}