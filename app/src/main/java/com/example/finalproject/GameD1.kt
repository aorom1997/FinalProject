package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class GameD1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_d1)

        val buttonBack13= findViewById<ImageButton>(R.id.backButton13)
        buttonBack13.setOnClickListener {
            val intent = Intent( this , SpeedMode::class.java)
            startActivity(intent);
        }

        val imgButton7= findViewById<ImageButton>(R.id.imageButton7)
        imgButton7.setOnClickListener {
            val intent = Intent( this , GameD2::class.java)
            startActivity(intent);
        }
    }
}