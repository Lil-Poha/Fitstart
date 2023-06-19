package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class mishsci_kachat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mishsci_kachat)
    }
    public fun gonazad(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent);
        finish()
    }
    public fun SLA(view: View) {
        val intent = Intent(this, mischsi_na_ruki::class.java)
        startActivity(intent);
        finish()
    }
    public fun slon(view: View) {
        val intent = Intent(this, mishsi_na_spinu::class.java)
        startActivity(intent);
        finish()
    }
}