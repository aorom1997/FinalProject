package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class GameA2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_a2)

        val buttonBack10= findViewById<ImageButton>(R.id.backButton10)
        buttonBack10.setOnClickListener {
            val intent = Intent( this , SpeedMode::class.java)
            startActivity(intent);
        }

        val imgButton12= findViewById<ImageButton>(R.id.imageButton12)
        imgButton12.setOnClickListener {
            val intent = Intent( this , GameA1::class.java)
            startActivity(intent);
        }
    }
}