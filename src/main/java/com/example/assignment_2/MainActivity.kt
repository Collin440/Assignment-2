package com.example.assignment_2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button1 = findViewById<Button>(R.id.Button1)

        // code for linking the two activities
        Button1.setOnClickListener{
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

    }
}
    }
