package com.example.adivinaquien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity
import com.github.clans.fab.FloatingActionButton

class inicioJuegoMulti : AppCompatActivity() {
    private lateinit var Img0: ImageView
    private lateinit var Img1: ImageView
    private lateinit var Img2: ImageView
    private lateinit var Img3: ImageView
    private lateinit var Img4: ImageView
    private lateinit var Img5: ImageView
    private lateinit var Img6: ImageView
    private lateinit var Img7: ImageView
    private lateinit var Img8: ImageView
    private lateinit var Img9: ImageView
    private lateinit var Img10: ImageView
    private lateinit var Img11: ImageView
    private lateinit var Img12: ImageView
    private lateinit var Img13: ImageView
    private lateinit var Img15: ImageView
    private lateinit var Img14: ImageView
    private lateinit var Img16: ImageView
    private lateinit var Img17: ImageView
    private lateinit var Img18: ImageView
    private lateinit var Img19: ImageView
    private lateinit var Img20: ImageView
    private lateinit var Img21: ImageView
    private lateinit var Img22: ImageView
    private lateinit var Img23: ImageView

    private val TURNOS: Int = 7
    var countTurnos: Int = 1

    val ready: ArrayList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_juego_multi)

        Img0 = findViewById(R.id.tab0)
        Img1 = findViewById(R.id.tab1)
        Img2 = findViewById(R.id.tab2)
        Img3 = findViewById(R.id.tab3)
        Img4 = findViewById(R.id.tab4)
        Img5 = findViewById(R.id.tab5)
        Img6 = findViewById(R.id.tab6)
        Img7 = findViewById(R.id.tab7)
        Img8 = findViewById(R.id.tab8)
        Img9 = findViewById(R.id.tab9)
        Img10 = findViewById(R.id.tab10)
        Img11 = findViewById(R.id.tab11)
        Img12 = findViewById(R.id.tab12)
        Img13 = findViewById(R.id.tab13)
        Img14 = findViewById(R.id.tab14)
        Img15 = findViewById(R.id.tab15)
        Img16 = findViewById(R.id.tab16)
        Img17 = findViewById(R.id.tab17)
        Img18 = findViewById(R.id.tab18)
        Img19 = findViewById(R.id.tab19)
        Img20 = findViewById(R.id.tab20)
        Img21 = findViewById(R.id.tab21)
        Img22 = findViewById(R.id.tab22)
        Img23 = findViewById(R.id.tab23)

        //val winner: EditText = findViewById(R.id.inputWinner)
        //val btnGanador: Button = findViewById(R.id.btnGanador)

        val personaje = intent.getStringExtra("Personaje")
        var deck = CharService()

        if (personaje != null) {
            deck.setSinglePlayerCharacter(personaje)
        }



        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
            actionBar?.hide()
        }

        var Puntaje = Puntaje()

        this.getCharactersPosition()

        //----------------------


        Img0.setOnClickListener() {

                Img0.setImageResource(R.drawable.bkg)

            }


        Img1.setOnClickListener() {
            Img1.setImageResource(R.drawable.bkg)

        }

        Img2.setOnClickListener() {
            Img2.setImageResource(R.drawable.bkg)

        }

        Img3.setOnClickListener() {
            Img3.setImageResource(R.drawable.bkg)

        }

        Img4.setOnClickListener() {
            Img4.setImageResource(R.drawable.bkg)

        }

        Img5.setOnClickListener() {
            Img5.setImageResource(R.drawable.bkg)

        }

        Img6.setOnClickListener() {
            Img6.setImageResource(R.drawable.bkg)

        }

        Img7.setOnClickListener() {
            Img7.setImageResource(R.drawable.bkg)

        }

        Img8.setOnClickListener() {
            Img8.setImageResource(R.drawable.bkg)

        }

        Img9.setOnClickListener() {
            Img9.setImageResource(R.drawable.bkg)

        }

        Img10.setOnClickListener() {
             Img10.setImageResource(R.drawable.bkg)

        }

        Img11.setOnClickListener() {
            Img11.setImageResource(R.drawable.bkg)

        }

        Img12.setOnClickListener() {
            Img12.setImageResource(R.drawable.bkg)

        }

        Img13.setOnClickListener() {
            Img13.setImageResource(R.drawable.bkg)

        }

        Img14.setOnClickListener() {
            Img14.setImageResource(R.drawable.bkg)

        }

        Img15.setOnClickListener() {
            Img15.setImageResource(R.drawable.bkg)

        }

        Img16.setOnClickListener() {
            Img16.setImageResource(R.drawable.bkg)

        }

        Img17.setOnClickListener() {
            Img17.setImageResource(R.drawable.bkg)

        }

        Img18.setOnClickListener() {
            Img18.setImageResource(R.drawable.bkg)

        }

        Img19.setOnClickListener() {
            Img19.setImageResource(R.drawable.bkg)

        }

        Img20.setOnClickListener() {
            Img20.setImageResource(R.drawable.bkg)

        }
        Img21.setOnClickListener() {
            Img21.setImageResource(R.drawable.bkg)

        }

        Img22.setOnClickListener() {
            Img22.setImageResource(R.drawable.bkg)
        }

        Img23.setOnClickListener() {
            Img23.setImageResource(R.drawable.bkg)
        }
}
        private fun winner(array: MutableList<Int>) {
            var Puntaje = Puntaje()
            println("Ganaste chepe")
            Puntaje.setValues(countTurnos, array.size)

            val totalPuntos = Puntaje.getPuntaje()

            val puntuacion = Intent(this, ganaste::class.java)
            puntuacion.putExtra("Puntuacion", totalPuntos)

            var getNombre = ""
            if (intent.getSerializableExtra("Nombre") != null) {
                getNombre = intent.getSerializableExtra("Nombre") as String
            }
            puntuacion.putExtra("Nombre", getNombre)
            startActivity(puntuacion)
        }

        private fun mamo(array: MutableList<Int>) {
            startActivity(Intent(this, loser::class.java))
        }

        private fun getCharactersPosition() {
            for (i in 0..23) {
                do {
                    var flag = true
                    var rand = (0..23).random()
                    var xd = ready.indexOf(rand)

                    if (xd == -1) {
                        ready.add(rand)
                    } else {
                        flag = false
                    }
                } while (flag == false)
            }

            var countDeck: Int = 0

            do {
                when (countDeck) {
                    0 -> setImage(countDeck, ready, Img0)
                    1 -> setImage(countDeck, ready, Img1)
                    2 -> setImage(countDeck, ready, Img2)
                    3 -> setImage(countDeck, ready, Img3)
                    4 -> setImage(countDeck, ready, Img4)
                    5 -> setImage(countDeck, ready, Img5)
                    6 -> setImage(countDeck, ready, Img6)
                    7 -> setImage(countDeck, ready, Img7)
                    8 -> setImage(countDeck, ready, Img8)
                    9 -> setImage(countDeck, ready, Img9)
                    10 -> setImage(countDeck, ready, Img10)
                    11 -> setImage(countDeck, ready, Img11)
                    12 -> setImage(countDeck, ready, Img12)
                    13 -> setImage(countDeck, ready, Img13)
                    14 -> setImage(countDeck, ready, Img14)
                    15 -> setImage(countDeck, ready, Img15)
                    16 -> setImage(countDeck, ready, Img16)
                    17 -> setImage(countDeck, ready, Img17)
                    18 -> setImage(countDeck, ready, Img18)
                    19 -> setImage(countDeck, ready, Img19)
                    20 -> setImage(countDeck, ready, Img20)
                    21 -> setImage(countDeck, ready, Img21)
                    22 -> setImage(countDeck, ready, Img22)
                    23 -> setImage(countDeck, ready, Img23)
                }
                countDeck++
            } while (countDeck < 24)
        }

        private fun setImage(x: Int, ready: ArrayList<Int>, Img: ImageView) {
            when (ready.get(x)) {
                0 -> Img.setImageResource(R.drawable.p_tiffany)
                1 -> Img.setImageResource(R.drawable.p_abigail)
                2 -> Img.setImageResource(R.drawable.p_alexander)
                3 -> Img.setImageResource(R.drawable.p_anna)
                4 -> Img.setImageResource(R.drawable.p_anthony)
                5 -> Img.setImageResource(R.drawable.p_benjamin)
                6 -> Img.setImageResource(R.drawable.p_campbell)
                7 -> Img.setImageResource(R.drawable.p_charles)
                8 -> Img.setImageResource(R.drawable.p_david)
                9 -> Img.setImageResource(R.drawable.p_emma)
                10 -> Img.setImageResource(R.drawable.p_ethan)
                11 -> Img.setImageResource(R.drawable.p_jacob)
                12 -> Img.setImageResource(R.drawable.p_jerry)
                13 -> Img.setImageResource(R.drawable.p_laura)
                14 -> Img.setImageResource(R.drawable.p_linda)
                15 -> Img.setImageResource(R.drawable.p_lisa)
                16 -> Img.setImageResource(R.drawable.p_madison)
                17 -> Img.setImageResource(R.drawable.p_maria)
                18 -> Img.setImageResource(R.drawable.p_martin)
                19 -> Img.setImageResource(R.drawable.p_rachel)
                20 -> Img.setImageResource(R.drawable.p_richard)
                21 -> Img.setImageResource(R.drawable.p_roy)
                22 -> Img.setImageResource(R.drawable.p_scott)
                23 -> Img.setImageResource(R.drawable.p_sophia)
            }
        }
    }
