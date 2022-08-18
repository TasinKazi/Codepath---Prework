package com.example.greenminions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Goal : User can tap a button to change the text of the color
        //1. Add a button to our layout
        //2.Add a logic to know when user has tapped on button

        //Get a refernce to button
        findViewById<Button>(R.id.button2).setOnClickListener {
            //Handle button tap
            //2.change the color of the text once use has tapped on the button
            Log.i("Tasin", "Tapped on button")
            //1. Get a reference of the text view
            findViewById<TextView>(R.id.textView2).setTextColor(getResources().getColor(R.color.white))

            //2. set the color of the text view

        }

    }
}