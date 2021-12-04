package com.example.adivinaquien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ganaste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_winner)
        val menu: Button =findViewById(R.id.btnMenu)

        var puntuacionGet = intent.getSerializableExtra("Puntuacion") as Int
        println("xxx>---------------------------ganaste " + puntuacionGet )
        val puntuacion = Intent(this, activityStats::class.java)
        //puntuacion.putExtra("Puntuacion", puntuacionGet)

        //var getNombre =""
        //if(intent.getSerializableExtra("Personaje") != null){
          val  getNombre: String = intent.getStringExtra("Nombre") as String
        //}



        println("xxx>---------------------------inicio juego " + getNombre )



        menu.setOnClickListener {
            puntuacion.putExtra("Nombre", getNombre)
            puntuacion.putExtra("Puntuacion", puntuacionGet)
            startActivity(puntuacion)
        }


    }
}