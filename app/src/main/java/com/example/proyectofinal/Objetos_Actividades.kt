package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Objetos_Actividades : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.objetos_actividades)

        val accion = findViewById<ImageButton>(R.id.acciones)
        accion.setOnClickListener {
            val intent = Intent(this, Acciones::class.java)
            startActivity(intent)
        }

        val hogar = findViewById<ImageButton>(R.id.hogar)
        hogar.setOnClickListener {
            val intent = Intent(this, Hogar::class.java)
            startActivity(intent)
        }

        val naturaleza = findViewById<ImageButton>(R.id.naturaleza)
        naturaleza.setOnClickListener {
            val intent = Intent(this, Naturaleza::class.java)
            startActivity(intent)
        }

        val BtnAtras = findViewById<ImageButton>(R.id.Btnatras)
        BtnAtras.setOnClickListener {
            val intent = Intent(this, Contenido::class.java)
            startActivity(intent)
        }
    }
}