package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class mishsi_na_spinu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mishsi_na_spinu)
    }
    public fun lom(view: View){
        val intent = Intent(this, mishsci_kachat::class.java)
        startActivity(intent);
        finish()}
    public fun hobot(view: View){
        val intent = Intent(this, stanovaia_tyaga_s_gantelyami::class.java)
        startActivity(intent);
        finish()}
    public fun lip(view: View){
        val intent = Intent(this, tyaga_v_planke::class.java)
        startActivity(intent);
        finish()}
    public fun sip(view: View){
        val intent = Intent(this, razgibanie_ruuk::class.java)
        startActivity(intent);
        finish()}

}