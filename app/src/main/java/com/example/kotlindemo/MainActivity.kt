package com.example.kotlindemo

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private var tvRandomNumber: TextView? = null

    private var randomNumber: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvRandomNumber = findViewById(R.id.tvRandomNumber)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)

        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)

        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)

        funLooper()

        btn1.setOnClickListener { funCompare(1) }
        btn2.setOnClickListener { funCompare(2) }
        btn3.setOnClickListener { funCompare(3) }
        btn4.setOnClickListener { funCompare(4) }
        btn5.setOnClickListener { funCompare(5) }
        btn6.setOnClickListener { funCompare(6) }
        btn7.setOnClickListener { funCompare(7) }
        btn8.setOnClickListener { funCompare(8) }
        btn9.setOnClickListener { funCompare(9) }

        funLooper()
    }

    private fun funCompare(i: Int) {

        if (randomNumber == i) {
            Toast.makeText(applicationContext, "Win", Toast.LENGTH_SHORT).show()

        }

    }

    private fun funLooper() {
        Handler(Looper.getMainLooper()).postDelayed({
            randomNumber = (1..9).random()
            tvRandomNumber!!.text = randomNumber.toString()
            funLooper()
        }, 500)

    }


}