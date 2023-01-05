package com.yesnet.oyemart.features.onboarding.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.yesnet.oyemart.MainActivity
import com.yesnet.oyemart.R

class MartLoginScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mart_login_screen)

        val buttonClick = findViewById<Button>(R.id.signin_button)
        buttonClick.setOnClickListener{
            val intent = Intent(this, MartDashboardScreen::class.java)
            startActivity(intent)
        }


    }

}