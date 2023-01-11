package com.rd.educraze

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn = findViewById<Button>(R.id.Start)
        startBtn.setOnClickListener {
            Toast.makeText(this, "Let's Start", Toast.LENGTH_LONG).show()
        }
    }
}