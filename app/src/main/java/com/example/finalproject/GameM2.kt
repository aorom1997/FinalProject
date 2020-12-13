package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class GameM2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_m2)

        val buttonBack12= findViewById<ImageButton>(R.id.backButton12)
        buttonBack12.setOnClickListener {
            val intent = Intent( this , SpeedMode::class.java)
            startActivity(intent);
        }

        val imgButton18= findViewById<ImageButton>(R.id.imageButton18)
        imgButton18.setOnClickListener {
            val intent = Intent( this , GameM1::class.java)
            startActivity(intent);
        }
    }
}