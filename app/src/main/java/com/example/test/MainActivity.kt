package com.example.test

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.nakon.pitvoda
import com.example.test.R
import com.example.test.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    public fun STNA(view: View){
        val intent = Intent(this, raschetimt::class.java)
        startActivity(intent);
        finish()
}
    public fun SFA(view: View){
        val intent = Intent(this, pohudene::class.java)
        startActivity(intent);
        finish()}
    public fun vodohleb(view: View){
        val intent = Intent(this, pitvoda::class.java)
        startActivity(intent);
        finish()}
    public fun mish(view: View){
        val intent = Intent(this, mishsci_kachat::class.java)
        startActivity(intent);
        finish()}
}