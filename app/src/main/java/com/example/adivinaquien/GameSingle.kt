package com.example.adivinaquien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class GameSingle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_single)


        val btnContin: Button = findViewById(R.id.btnEmpezar)
        val inputName:EditText = findViewById(R.id.inputNombre)
        val rnds = (1..24).random()

        var i= ""

        when(rnds){
            1 -> i = "Abigail"
            2 -> i= "Alexander"
            3 -> i = "Anna"
            4 -> i = "Anthony"
            5 -> i = "Benjamin"
            6 -> i = "Campbell"
            7 -> i= "Charles"
            8 -> i = "David"
            9 -> i = "Emma"
            10 -> i ="Ethan"
            11 -> i= "Jacob"
            12 -> i="Jerry"
            13 -> i= "Laura"
            14 -> i= "Linda"
            15 -> i= "Lisa"
            16 -> i="Madison"
            17 -> i= "Maria"
            18 -> i= "Martin"
            19 -> i="Rachel"
            20 -> i="Richard"
            21 -> i= "Roy"
            22 -> i= "Scott"
            23 -> i="Sophia"
            24 -> i="Tiffany"

        }

        btnContin.setOnClickListener(){
            val nombre = Intent(this, inicioJuego::class.java)
            nombre.putExtra("Nombre", inputName.text.toString())
            println(inputName.text.toString() + "---------------------------------")
            nombre.putExtra("Personaje", i)
            startActivity(nombre)
        }
    }
}