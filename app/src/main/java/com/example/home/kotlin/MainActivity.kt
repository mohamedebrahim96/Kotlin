package com.example.home.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text2 =findViewById(R.id.text) as TextView
        val btn = findViewById(R.id.btn) as Button
        val btn2 = findViewById(R.id.btn2) as Button

        btn.setOnClickListener {
            Toast.makeText(this, "Button 1", Toast.LENGTH_LONG).show()
            text2.setText("mete")
        }

        btn2.setOnClickListener {
            val i = Intent(this,Activity2::class.java)
            startActivity(i)
        }

    }
}
