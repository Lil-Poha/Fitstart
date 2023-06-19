package com.example.nakon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.test.MainActivity
import com.example.test.R
import com.example.test.databinding.ActivityPitvodaBinding

class pitvoda : AppCompatActivity() {

    lateinit var binding:ActivityPitvodaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPitvodaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calofic.setOnClickListener { calctip() }
    }

    private fun calctip() {
        val rostone = binding.rost.text.toString().toDouble()
        val vozeone = binding.vozr.text.toString().toDouble()
        val vesone = binding.ves.text.toString().toDouble()
        val polone = binding.tipOption.checkedRadioButtonId
        val polotwo = when(polone){
            R.id.radioButton -> 5
            else -> - 161
        }
        var tip = 0.0
        var n = (vesone * 10.0 + rostone * 6.25 - vozeone * 5.0 + polotwo) * 1.5
        var pri = 1500.0 + (vesone - 20) * 20
        if (n > 0){
            binding.textView3.text = "Вам нужно употрелять " + n.toString() + "ккал в день. Так же в день необходимо пить " + pri.toString() + "мл воды."
        }
    }


    public fun goBack(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent);
        finish()
    }
}