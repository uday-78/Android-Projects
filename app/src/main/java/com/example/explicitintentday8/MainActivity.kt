package com.example.explicitintentday8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent= findViewById<Button>(R.id.button)
        btnIntent.setOnClickListener {
            //Here by clicking the button we have to open new screen or activity
            intent= Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}