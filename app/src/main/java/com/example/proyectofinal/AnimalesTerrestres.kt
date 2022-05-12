package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class AnimalesTerrestres : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animales_terrestres)

        val BtnAtras = findViewById<ImageButton>(R.id.Btnatras)
        BtnAtras.setOnClickListener {
            val intent = Intent(this, Animales::class.java)
            startActivity(intent)
        }
    }
}