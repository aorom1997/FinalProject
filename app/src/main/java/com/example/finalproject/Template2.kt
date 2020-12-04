package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Template2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_template2)


        val buttonBack= findViewById<ImageButton>(R.id.backButton)
        buttonBack.setOnClickListener {
            val intent = Intent( this , MainActivity::class.java)
            startActivity(intent);
        }
    }
}