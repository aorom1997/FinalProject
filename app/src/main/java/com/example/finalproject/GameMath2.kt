package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class GameMath2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_math2)

        val buttonBack14= findViewById<ImageButton>(R.id.backButton14)
        buttonBack14.setOnClickListener {
            val intent = Intent( this , SpeedMode::class.java)
            startActivity(intent);
        }

        val imgButton24= findViewById<ImageButton>(R.id.imageButton24)
        imgButton24.setOnClickListener {
            val intent = Intent( this , GameMath3::class.java)
            startActivity(intent);
        }
    }
}