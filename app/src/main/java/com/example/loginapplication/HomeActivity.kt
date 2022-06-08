package com.example.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Homeactivity : AppCompatActivity() {
    lateinit var testHome : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var intentStarted = intent;

        testHome = findViewById(R.id.testHome)
        var extras = intentStarted.extras

        var data = extras?.getString("harmankey")
        var data2 = extras?.getString("cartoonkey")

        testHome = findViewById(R.id.testHome)
        //set the text/string that you got from the previous step

        //tvHome.setText(data)
        testHome.text = data
        testHome.text = data2

    }

}