package com.example.registration

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.healthapp.MainActivity
import com.example.healthapp.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn1 = findViewById<TextView>(R.id.textViewSignUp)
        btn1.setOnClickListener {
            startActivity(
                Intent(
                    this@LoginActivity,
                    RegisterActivity::class.java
                )
            )
        }
        val btn2 = findViewById<Button>(R.id.btnlogin)
        btn2.setOnClickListener {
            startActivity(
                Intent(
                    this@LoginActivity,
                    MainActivity::class.java
                )
            )
        }
    }



}