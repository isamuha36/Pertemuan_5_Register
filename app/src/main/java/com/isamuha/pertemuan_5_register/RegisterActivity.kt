package com.isamuha.pertemuan_5_register

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {

    private lateinit var  usernameInput: TextInputEditText
    private lateinit var  emailInput: TextInputEditText
    private lateinit var  phoneInput: TextInputEditText
    private lateinit var  passwordInput: TextInputEditText
    private lateinit var  checkbox: CheckBox
    private lateinit var btnRegister: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reigster)

        usernameInput = findViewById(R.id.usernameRegisterTextInputEditText)
        emailInput = findViewById(R.id.emailRegisterTextInputEditText)
        phoneInput = findViewById(R.id.phoneRegisterTextInputEditText)
        passwordInput = findViewById(R.id.passwordRegisterTextInputEditText)
        checkbox = findViewById(R.id.checkbox_byChecking)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener{
            val username = usernameInput.text.toString();
            val email = emailInput.text.toString();
            val phone = phoneInput.text.toString();
            val password = passwordInput.text.toString();

            if (username.isNotEmpty() && email.isNotEmpty() && phone.isNotEmpty() && password.isNotEmpty() && checkbox.isChecked) {

                val intentToLogin = Intent(this@RegisterActivity, LoginActivity::class.java)
                intentToLogin.putExtra("USERNAME", username);
                intentToLogin.putExtra("PASSWORD", password)
                intentToLogin.putExtra("PHONE", phone)
                intentToLogin.putExtra("EMAIL", email)

                startActivity(intentToLogin)
            } else {
                Toast.makeText(this, "Please complete the form and agree to the terms.", Toast.LENGTH_SHORT).show()
            }
        }

    }
}