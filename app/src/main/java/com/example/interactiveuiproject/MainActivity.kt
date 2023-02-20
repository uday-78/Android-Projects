package com.example.interactiveuiproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

/*Orientation means all the button and widgets will come below one another*/
class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonRead = findViewById<Button>(R.id.btnRead)
        val layout = findViewById<LinearLayout>(R.id.Linearlayout)

        buttonRead.setOnClickListener {
            //change the background colour to Read mode
            layout.setBackgroundColor(R.color.yellow)
        }
        buttonDark.setOnClickListener {
            layout.setBackgroundColor(R.color.black)
        }

    }
}