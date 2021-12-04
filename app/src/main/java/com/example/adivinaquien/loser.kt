package com.example.adivinaquien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loser)

        val menu: Button =findViewById(R.id.btnMenu)

        menu.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}