package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val buttonBack2= findViewById<ImageButton>(R.id.backButton2)
        buttonBack2.setOnClickListener {
            val intent = Intent( this , MainActivity::class.java)
            startActivity(intent);
        }
    }
}