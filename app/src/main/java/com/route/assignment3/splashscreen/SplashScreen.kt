package com.route.assignment3.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.route.assignment3.R
import com.route.assignment3.homescreen.HomeScreenActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        startHomeScreen()
    }
    private fun startHomeScreen(){
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,HomeScreenActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}