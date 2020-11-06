package com.tugastengahsemester.akbardinullah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_masuk = findViewById<Button>(R.id.msk_button)
        btn_masuk.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent);
        }
    }
}