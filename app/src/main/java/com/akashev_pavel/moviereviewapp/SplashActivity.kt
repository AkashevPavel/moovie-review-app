package com.akashev_pavel.moviereviewapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    companion object {
        private const val DELAY_DURATION = 2000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed(
            Runnable {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, DELAY_DURATION
        )
    }
}