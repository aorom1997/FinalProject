package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSpeed= findViewById<Button>(R.id.SpeedMode)
        buttonSpeed.setOnClickListener {
            val intent = Intent( this , SpeedMode::class.java)
            startActivity(intent);
        }

        val buttonSetttings= findViewById<Button>(R.id.Settings)
        buttonSetttings.setOnClickListener {
            val intent = Intent( this , Settings::class.java)
            startActivity(intent);
        }

        val buttonGame= findViewById<Button>(R.id.Tower)
        buttonGame.setOnClickListener {
            val intent = Intent( this , TowerPlaceholder::class.java)
            startActivity(intent);
        }

        val buttonTemplate= findViewById<Button>(R.id.Test1)
        buttonTemplate.setOnClickListener {
            val intent = Intent( this , Template1::class.java)
            startActivity(intent);
        }

        val buttonTemplate2= findViewById<Button>(R.id.Test2)
        buttonTemplate2.setOnClickListener {
            val intent = Intent( this , Template2::class.java)
            startActivity(intent);
        }


    }
}