package com.example.adivinaquien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class multigame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multigame)

        val Img: ImageView = findViewById(R.id.showImg)
        val btnContin: Button = findViewById(R.id.btnEmpezar)
        val rnds = (1..24).random()
        //val pers = arrayOf("","","","","","","","","","","","","","","","","","","","","","","","")
        //val personaje = pers.get(rnds)
        val i = Intent(this, inicioJuegoMulti::class.java)

        when(rnds){
            1 -> {Img.setImageResource(R.drawable.p_abigail)
                i.putExtra("Personaje", "Abigail")
            }
            2 -> {Img.setImageResource(R.drawable.p_alexander)
                i.putExtra("Personaje", "Alexander")
            }
            3 ->{Img.setImageResource(R.drawable.p_anna)
                i.putExtra("Personaje", "Anna")
            }
            4 -> {Img.setImageResource(R.drawable.p_anthony)
                i.putExtra("Personaje", "Anthony")
            }
            5 -> {Img.setImageResource(R.drawable.p_benjamin)
                i.putExtra("Personaje", "Benjamin")
            }
            6 -> {Img.setImageResource(R.drawable.p_campbell)
                i.putExtra("Personaje", "Campbell")
            }
            7 -> {Img.setImageResource(R.drawable.p_charles)
                i.putExtra("Personaje", "Charles")
            }
            8 -> {Img.setImageResource(R.drawable.p_david)
                i.putExtra("Personaje", "David")
            }
            9 -> {Img.setImageResource(R.drawable.p_emma)
                i.putExtra("Personaje", "Emma")
            }
            10 -> {Img.setImageResource(R.drawable.p_ethan)
                i.putExtra("Personaje", "Ethan")
            }
            11 -> {Img.setImageResource(R.drawable.p_jacob)
                i.putExtra("Personaje", "Jacob")
            }
            12 -> {Img.setImageResource(R.drawable.p_jerry)
                i.putExtra("Personaje", "Jerry")
            }
            13 -> {Img.setImageResource(R.drawable.p_laura)
                i.putExtra("Personaje", "Laura")
            }
            14 -> {Img.setImageResource(R.drawable.p_linda)
                i.putExtra("Personaje", "Linda")
            }
            15 -> {Img.setImageResource(R.drawable.p_lisa)
                i.putExtra("Personaje", "Lisa")
            }
            16 -> {Img.setImageResource(R.drawable.p_madison)
                i.putExtra("Personaje", "Madisoner")
            }
            17 -> {Img.setImageResource(R.drawable.p_maria)
                i.putExtra("Personaje", "Maria")
            }
            18 -> {Img.setImageResource(R.drawable.p_martin)
                i.putExtra("Personaje", "Martin")
            }
            19 -> {Img.setImageResource(R.drawable.p_rachel)
                i.putExtra("Personaje", "Rachel")
            }
            20 -> {Img.setImageResource(R.drawable.p_richard)
                i.putExtra("Personaje", "Richard")
            }
            21 -> {Img.setImageResource(R.drawable.p_roy)
                i.putExtra("Personaje", "Roy")
            }
            22 -> {Img.setImageResource(R.drawable.p_scott)
                i.putExtra("Personaje", "Scott")
            }
            23 -> {Img.setImageResource(R.drawable.p_sophia)
                i.putExtra("Personaje", "Sophia")
            }
            24 -> {Img.setImageResource(R.drawable.p_tiffany)
                i.putExtra("Personaje", "Tiffany")
            }
        }

        btnContin.setOnClickListener(){
            startActivity(Intent(i))
        }
    }
}