package com.example.adivinaquien

import android.content.ContentValues
import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.BaseColumns
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class activityStats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)

         var recView: RecyclerView = findViewById(R.id.recView)
        var btnDel:Button = findViewById(R.id.btnDel)
        var btnMenu:Button = findViewById(R.id.btnMenu)
        val dbHelper = SQLiteDBHelper(this)
        var datos = mutableListOf<Ejemplo>()


        val adaptador = Adaptador(datos)
        actualizarLista(adaptador, datos, dbHelper)
        recView.setHasFixedSize(true)
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recView.adapter = adaptador

        val puntuacion: Int = intent.getIntExtra("Puntuacion",0)
        var getNombre: String = ""
        if (intent.getStringExtra("Nombre") != null){
            getNombre = intent.getStringExtra("Nombre") as String
        }



        println("xxx>--------------------------- " + puntuacion )
        //val puntuacion =intent.getStringExtra("Puntuacion")
        println(puntuacion.toString() + "----------------------------------")

        val db = dbHelper.writableDatabase

        val values = ContentValues().apply {
                put(SQLiteEjemploContract.Tabla1.COLUMN_1, "Jugador: ${getNombre}")
                put(SQLiteEjemploContract.Tabla1.COLUMN_2, "Puntuacion: ${puntuacion}")
        }
        db?.insert(SQLiteEjemploContract.Tabla1.TABLE_NAME, null, values)
        actualizarLista(adaptador, datos, dbHelper)

        btnMenu.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnDel.setOnClickListener {
            val dbR = dbHelper.writableDatabase
            dbR.delete(SQLiteEjemploContract.Tabla1.TABLE_NAME, null, null)
            actualizarLista(adaptador, datos, dbHelper)
        }
    }


    fun actualizarLista(adaptador: Adaptador, datos :
    MutableList<Ejemplo>, dbHelper : SQLiteDBHelper){

        val dbReader = dbHelper.readableDatabase
        val projection = arrayOf(
            BaseColumns._ID,
            SQLiteEjemploContract.Tabla1.COLUMN_1,
            SQLiteEjemploContract.Tabla1.COLUMN_2)
        val cursor = dbReader.query(
            SQLiteEjemploContract.Tabla1.TABLE_NAME,
            projection,
            null,
            null,
            null,
            null,
            null
        )

        datos.clear()
        with(cursor){
            while (moveToNext()) {
                val id =
                    getString(getColumnIndexOrThrow(BaseColumns._ID))
                val col1 =
                    getString(getColumnIndexOrThrow(SQLiteEjemploContract.Tabla1.COLUMN_1))
                val col2 =
                    getString(getColumnIndexOrThrow(SQLiteEjemploContract.Tabla1.COLUMN_2))
                datos.add(Ejemplo(id, col1, col2))
            }
        }
        adaptador.notifyDataSetChanged()
    }
}