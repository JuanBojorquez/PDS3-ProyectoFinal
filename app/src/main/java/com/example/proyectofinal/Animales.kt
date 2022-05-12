package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Animales : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animales)

        val aniAcu = findViewById<ImageButton>(R.id.animales_acuaticos)
        aniAcu.setOnClickListener {
            val intent = Intent(this, AnimalesAcuaticos::class.java)
            startActivity(intent)
        }

        val aniTer = findViewById<ImageButton>(R.id.animales_terrestres)
        aniTer.setOnClickListener {
            val intent = Intent(this, AnimalesTerrestres::class.java)
            startActivity(intent)
        }

        val aniVol = findViewById<ImageButton>(R.id.animales_voladores)
        aniVol.setOnClickListener {
            val intent = Intent(this, AnimalesVoladores::class.java)
            startActivity(intent)
        }

        val BtnAtras = findViewById<ImageButton>(R.id.Btnatras)
        BtnAtras.setOnClickListener {
            val intent = Intent(this, Contenido::class.java)
            startActivity(intent)
        }
    }
}