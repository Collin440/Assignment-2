package com.example.assignment_2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2 : AppCompatActivity() {

    // Pet attributes
    private var petHealth = 100
    private var petHunger = 50
    private var petCleanliness = 50
    private var petHappiness = 50

    // Constants for attribute changes
    private val hungerChange = 10
    private val cleanlinessChange = 10
    private val healthChange = 10
    private val hungerAfterPlay = 5
    private val cleanlinessAfterPlay = -5
    private val happinessChange = 10


    @SuppressLint("MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Declaring variables
        val feedBtn = findViewById<Button>(R.id.feedBtn)
        val cleanBtn = findViewById<Button>(R.id.cleanBtn)
        val playBtn = findViewById<Button>(R.id.playBtn)
        val textView = findViewById<TextView>(R.id.textView)
        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val imgEating =findViewById<ConstraintLayout>(R.id.imgEating)
        val imgClean =findViewById<ConstraintLayout>(R.id.imgClean)
        val imgPlaying =findViewById<ConstraintLayout>(R.id.imgPlaying)

        // Display initial values
        textView.setText(petHunger.toString())
        textView1.setText(petCleanliness.toString())
        textView2.setText(petCleanliness.toString())

        // code for what happens when the feed button is clicked
        feedBtn.setOnClickListener{
            petHunger  += hungerChange
            petHealth += healthChange
            petCleanliness += healthChange
            // Ensure attributes stay within bounds
            petHunger = petHunger.coerceIn(0, 100)
            petHealth = petHealth.coerceIn(0, 100)
            petCleanliness = petCleanliness.coerceIn(0, 100)
            textView.setText(petHunger.toString())
            textView1.setText(petCleanliness.toString())
            textView2.setText(petHealth.toString())
            animatedImageChange(petHunger, R.drawable.img_2)
            animatedImageChange(petCleanliness, R.drawable.img_3)
            animatedImageChange(petHealth, R.drawable.img_4)
        }

        // code for what happens when the clean button is clicked
        cleanBtn.setOnClickListener {
            petCleanliness += cleanlinessChange
            petHealth += healthChange
            petHunger += happinessChange
            // Ensure attributes stay within bounds
            petCleanliness = petCleanliness.coerceIn(0, 100)
            petHealth = petHealth.coerceIn(0, 100)
            petHunger = petHunger.coerceIn(0, 100)
            textView.setText(petHunger.toString())
            textView1.setText(petCleanliness.toString())
            textView2.setText(petHealth.toString())
            animatedImageChange(petHunger, R.drawable.img_2)
            animatedImageChange(petCleanliness, R.drawable.img_3)
            animatedImageChange(petHealth, R.drawable.img_4)
        }

        // code for what happens when the play button is clicked
        playBtn.setOnClickListener {
            petHunger -= hungerAfterPlay
            petCleanliness += cleanlinessAfterPlay
            petHappiness += happinessChange
            petHealth += healthChange
            // Ensure attributes stay within bounds
            petHealth = petHealth.coerceIn(0, 100)
            petHunger = petHunger.coerceIn(0, 100)
            petCleanliness = petCleanliness.coerceIn(0, 100)
            petHappiness = petHappiness.coerceIn(0, 100)
            textView.setText(petHappiness.toString())
            textView1.setText(petHunger.toString())
            textView2.setText(petCleanliness.toString())
            animatedImageChange(petHunger, R.drawable.img_2)
            animatedImageChange(petCleanliness, R.drawable.img_3)
            animatedImageChange(petHealth, R.drawable.img_4)
        }

    }

    // function for changing the images when the buttons are clicked
    private fun animatedImageChange(imageView: Int, newImageResource: Int) {
        val  animation = AlphaAnimation(0.0f, 1.0f)
        500.also { animation.duration = it.toLong() }
        animation.fillAfter = true
        imageView.startAnimation(animation)
        imageView.setImageResource(newImageResource)
    }
}

private fun Any.setImageResource(newImageResource: Int) {
    TODO("Not yet implemented")
}

private fun Int.startAnimation(animation: Animation) {
    TODO("Not yet implemented")
}
