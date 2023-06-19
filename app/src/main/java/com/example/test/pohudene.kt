package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.test.R
import com.example.test.ui.dashboard.DashboardFragment
import com.example.test.ui.dashboard.DashboardViewModel

class pohudene : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pohudene)
    }
    public fun gonazad(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent);
        finish()
    }
    public fun SLA(view: View){
        val intent = Intent(this, pohudeniegrudtwo::class.java)
        startActivity(intent);
        finish()}
    public fun slon(view: View){
        val intent = Intent(this, pohudeniepres::class.java)
        startActivity(intent);
        finish()}
    public fun srati(view: View){
        val intent = Intent(this, pohudenie_nogi::class.java)
        startActivity(intent);
        finish()}
}