package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class pohudenie_nogi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pohudenie_nogi)
    }
    public fun lom(view: View){
        val intent = Intent(this, pohudene::class.java)
        startActivity(intent);
        finish()}
    public fun hobot(view: View){
        val intent = Intent(this, vipadi_na_nogi::class.java)
        startActivity(intent);
        finish()}
    public fun gip(view: View){
        val intent = Intent(this, beg_na_meste::class.java)
        startActivity(intent);
        finish()}
    public fun sip(view: View){
        val intent = Intent(this, prisenadie_viprig::class.java)
        startActivity(intent);
        finish()}
    public fun trap(view: View){
        val intent = Intent(this, mahi_nogami::class.java)
        startActivity(intent);
        finish()}
    public fun fritata(view: View){
        val intent = Intent(this, standart_prised::class.java)
        startActivity(intent);
        finish()}
}