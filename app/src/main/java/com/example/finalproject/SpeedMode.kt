package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SpeedMode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speed_mode)

        val buttonBack3= findViewById<ImageButton>(R.id.backButton3)
        buttonBack3.setOnClickListener {
            val intent = Intent( this , MainActivity::class.java)
            startActivity(intent);
        }

        val buttonAddition= findViewById<Button>(R.id.Addition)
        buttonAddition.setOnClickListener {
            val intent = Intent( this , GameA1::class.java)
            startActivity(intent);
        }

        val buttonSubtraction= findViewById<Button>(R.id.subtraction)
        buttonSubtraction.setOnClickListener {
            val intent = Intent( this , GameS1::class.java)
            startActivity(intent);
        }

        val buttonMultiplication= findViewById<Button>(R.id.multiplication)
        buttonMultiplication.setOnClickListener {
            val intent = Intent( this , GameM1::class.java)
            startActivity(intent);
        }

        val buttonDivision= findViewById<Button>(R.id.division)
        buttonDivision.setOnClickListener {
            val intent = Intent( this , GameD1::class.java)
            startActivity(intent);
        }

        val buttonMath= findViewById<Button>(R.id.math)
        buttonMath.setOnClickListener {
            val intent = Intent( this , GameMath1::class.java)
            startActivity(intent);
        }
    }
}