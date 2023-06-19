package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.test.R
import com.example.nakon.nakoleni
import com.example.nakon.shirok

class pohudeniegrudtwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pohudeniegrudtwo)
    }
    public fun hobot(view: View){
        val intent = Intent(this, prizhki_zvezdoi::class.java)
        startActivity(intent);
        finish()}
    public fun lom(view: View){
        val intent = Intent(this, pohudene::class.java)
        startActivity(intent);
        finish()}
    public fun lip(view: View){
        val intent = Intent(this, otzimanie_s_oporoi::class.java)
        startActivity(intent);
        finish()}
    public fun gip(view: View){
        val intent = Intent(this, otzimanie_soporoi_szadi::class.java)
        startActivity(intent);
        finish()}
    public fun sip(view: View){
        val intent = Intent(this, nakoleni::class.java)
        startActivity(intent);
        finish()}
    public fun trap(view: View){
        val intent = Intent(this, shirok::class.java)
        startActivity(intent);
        finish()}
    public fun fritata(view: View){
        val intent = Intent(this, almaz_otzhimanie::class.java)
        startActivity(intent);
        finish()}
}