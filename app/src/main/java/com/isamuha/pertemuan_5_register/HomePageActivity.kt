package com.isamuha.pertemuan_5_register

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.google.android.material.textfield.TextInputEditText

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)


        val username = intent.getStringExtra("USERNAME")
        val password = intent.getStringExtra("PASSWORD")
        val email = intent.getStringExtra("EMAIL")
        val phone = intent.getStringExtra("PHONE")


        val usernameTextView = findViewById<TextView>(R.id.link_username)


        usernameTextView.text = username

    }
}