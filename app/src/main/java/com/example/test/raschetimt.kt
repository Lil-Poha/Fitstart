package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.test.databinding.ActivityRaschetimtBinding
import com.example.test.R

class raschetimt : AppCompatActivity() {

    lateinit var binding:ActivityRaschetimtBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRaschetimtBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calofic.setOnClickListener { calctip() }
    }

    private fun calctip() {
        val rostone = binding.rost.text.toString().toDouble()
        val vozeone = binding.vozr.text.toString().toDouble()
        val vesone = binding.ves.text.toString().toDouble()
        val polone = binding.tipOption.checkedRadioButtonId
        val polotwo = when(polone){
            R.id.radioButton -> 0.1
            else -> 0.2
        }
        var tip = 0.0
        var n = (vesone/((rostone / 100) * (rostone / 100)))
        if (n< 18.5){
            val so = "Недостаточная масса тела"
            binding.textView3.text = so
        }
        else if ((18.5 <= n) and (n<=24.9)){
            val sk = "Нормальная масса тела"
            binding.textView3.text = sk
        }
        else if ((25<=n) and (n<=29.9)){
            val sp = "Избыточная масса тела"
            binding.textView3.text = sp
        }
        else if (30<=n){
            val sh = "Ожирение"
            binding.textView3.text = sh
        }
    }


    public fun goBack(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent);
        finish()
    }
}