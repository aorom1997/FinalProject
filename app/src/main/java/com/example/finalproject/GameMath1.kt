package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class GameMath1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_math1)

        val buttonBack8= findViewById<ImageButton>(R.id.backButton8)
        buttonBack8.setOnClickListener {
            val intent = Intent( this , SpeedMode::class.java)
            startActivity(intent);
        }

        val imgButton23= findViewById<ImageButton>(R.id.imageButton23)
        imgButton23.setOnClickListener {
            val intent = Intent( this , GameMath2::class.java)
            startActivity(intent);
        }
    }
}