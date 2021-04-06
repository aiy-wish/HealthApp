package com.example.registration

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.healthapp.MainActivity
import com.example.healthapp.R
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn1 = findViewById<TextView>(R.id.alreadyHaveAccount)
        btn1.setOnClickListener {
            startActivity(
                Intent(
                    this@RegisterActivity,
                    LoginActivity::class.java
                )
            )
        }
        val btn2 = findViewById<Button>(R.id.btnRegister)
        btn2.setOnClickListener {
            startActivity(
                Intent(
                    this@RegisterActivity,
                    MainActivity::class.java
                )
            )
        }
    }

    private fun saveData(){
        val username = findViewById<TextView>(R.id.inputUsername)
        val email = findViewById<TextView>(R.id.inputEmail)
        val password = findViewById<TextView>(R.id.inputPassword)
        val confirm_password = findViewById<TextView>(R.id.inputConfirmPassword)


    }

    private fun loadData(){

    }
}