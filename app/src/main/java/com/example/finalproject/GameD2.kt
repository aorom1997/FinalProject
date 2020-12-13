package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class GameD2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_d2)

        val buttonBack7= findViewById<ImageButton>(R.id.backButton7)
        buttonBack7.setOnClickListener {
            val intent = Intent( this , SpeedMode::class.java)
            startActivity(intent);
        }

        val imgButton20= findViewById<ImageButton>(R.id.imageButton20)
        imgButton20.setOnClickListener {
            val intent = Intent( this , GameD1::class.java)
            startActivity(intent);
        }
    }
}