package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.test.R

class pohudeniepres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pohudeniepres)
    }
    public fun gonapohudenietwo(view: View) {
        val intent = Intent(this, pohudene::class.java)
        startActivity(intent);
        finish()
    }
    public fun hobot(view: View){
        val intent = Intent(this, scruchivanie::class.java)
        startActivity(intent);
        finish()}
    public fun lom(view: View){
        val intent = Intent(this, pohudene::class.java)
        startActivity(intent);
        finish()}
    public fun trap(view: View){
        val intent = Intent(this, nozhnitsi::class.java)
        startActivity(intent);
        finish()}
    public fun gip(view: View){
        val intent = Intent(this, bokovie_nakloni_k_stopam::class.java)
        startActivity(intent);
        finish()}
    public fun fritata(view: View){
        val intent = Intent(this, planka_del::class.java)
        startActivity(intent);
        finish()}
    public fun sip(view: View){
        val intent = Intent(this, alpenist::class.java)
        startActivity(intent);
        finish()}
}