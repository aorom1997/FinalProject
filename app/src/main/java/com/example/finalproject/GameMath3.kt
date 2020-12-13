package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class GameMath3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_math3)

        val buttonBack15= findViewById<ImageButton>(R.id.backButton15)
        buttonBack15.setOnClickListener {
            val intent = Intent( this , SpeedMode::class.java)
            startActivity(intent);
        }

        val imgButton29= findViewById<ImageButton>(R.id.imageButton29)
        imgButton29.setOnClickListener {
            val intent = Intent( this , GameMath1::class.java)
            startActivity(intent);
        }
    }
}