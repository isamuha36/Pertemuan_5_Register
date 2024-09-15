package com.isamuha.pertemuan_5_register

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    private lateinit var usernameInput: TextInputEditText
    private lateinit var passwordInput: TextInputEditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        usernameInput = findViewById(R.id.usernameLoginTextInputEditText)
        passwordInput = findViewById(R.id.passwordLoginTextInputEditText)
        btnLogin = findViewById(R.id.btnLogin)

        val registeredUsername = intent.getStringExtra("USERNAME")
        val registeredPassword = intent.getStringExtra("PASSWORD")
        val registeredEmail = intent.getStringExtra("EMAIL")
        val registeredPhone = intent.getStringExtra("PHONE")

        btnLogin.setOnClickListener {

            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()


            if (username == registeredUsername && password == registeredPassword) {

                val intentToHomepage = Intent(this@LoginActivity, HomePageActivity::class.java)
                intentToHomepage.putExtra("USERNAME", registeredUsername)
                intentToHomepage.putExtra("PASSWORD", registeredPassword)
                intentToHomepage.putExtra("PHONE", registeredPhone)
                intentToHomepage.putExtra("EMAIL", registeredEmail)
                startActivity(intentToHomepage)
            } else {

                Toast.makeText(this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}