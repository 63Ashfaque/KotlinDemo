package com.example.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen_activity)
        funInitialize()
        funShowGoBtn()


    }

    private lateinit var btnGo: Button
    private fun funInitialize() {
        btnGo = findViewById(R.id.btnGo)
        btnGo.setOnClickListener {
            val intent = Intent(applicationContext, AddProductActivity::class.java)
            startActivity(intent)
            finish()

        }

    }

    private fun funShowGoBtn() {
        Handler(Looper.getMainLooper()).postDelayed({

            btnGo.visibility = View.VISIBLE

        }, 2000)

    }
}