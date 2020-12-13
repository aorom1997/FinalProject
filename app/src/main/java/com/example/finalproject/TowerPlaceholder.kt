package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TowerPlaceholder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tower_placeholder)

        val buttonBack9= findViewById<ImageButton>(R.id.backButton9)
        buttonBack9.setOnClickListener {
            val intent = Intent( this , MainActivity::class.java)
            startActivity(intent);
        }
    }
}