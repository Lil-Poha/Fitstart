package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.test.R

class pohudenienagrud : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pohudenienagrud)
    }
    public fun gonapohudenie(view: View) {
        val intent = Intent(this, pohudene::class.java)
        startActivity(intent);
        finish()
    }
}