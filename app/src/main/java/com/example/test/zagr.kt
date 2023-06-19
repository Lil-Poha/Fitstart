package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.test.R

class zagr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zagr)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@zagr, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}

