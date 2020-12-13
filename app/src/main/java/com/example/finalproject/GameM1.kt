package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class GameM1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_m1)

        val buttonBack6= findViewById<ImageButton>(R.id.backButton6)
        buttonBack6.setOnClickListener {
            val intent = Intent( this , SpeedMode::class.java)
            startActivity(intent);
        }

        val imgButton15= findViewById<ImageButton>(R.id.imageButton15)
        imgButton15.setOnClickListener {
            val intent = Intent( this , GameM2::class.java)
            startActivity(intent);
        }
    }
}