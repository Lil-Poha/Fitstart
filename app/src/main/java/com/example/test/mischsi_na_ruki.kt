package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class mischsi_na_ruki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mischsi_na_ruki)
    }
    public fun lom(view: View){
        val intent = Intent(this, mishsci_kachat::class.java)
        startActivity(intent);
        finish()}
    public fun hobot(view: View){
        val intent = Intent(this, ganteli_na_biceps::class.java)
        startActivity(intent);
        finish()}
    public fun lip(view: View){
        val intent = Intent(this, ganteli_na_plechi::class.java)
        startActivity(intent);
        finish()}
    public fun gip(view: View){
        val intent = Intent(this, ganteli_obratnim_hvatom::class.java)
        startActivity(intent);
        finish()}
    public fun sip(view: View){
        val intent = Intent(this, razgibanie_za_golovoi::class.java)
        startActivity(intent);
        finish()}
}
