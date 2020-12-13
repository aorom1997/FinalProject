package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class GameS2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_s2)

        val buttonBack11= findViewById<ImageButton>(R.id.backButton11)
        buttonBack11.setOnClickListener {
            val intent = Intent( this , SpeedMode::class.java)
            startActivity(intent);
        }

        val imgButton21= findViewById<ImageButton>(R.id.imageButton21)
        imgButton21.setOnClickListener {
            val intent = Intent( this , GameS1::class.java)
            startActivity(intent);
        }
    }
}