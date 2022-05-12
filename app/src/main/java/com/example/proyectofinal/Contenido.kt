package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Contenido : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contenido2)

        val buttonClick = findViewById<ImageButton>(R.id.Animales)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Animales::class.java)
            startActivity(intent)
        }

        val objetos = findViewById<ImageButton>(R.id.objetos_actividades)
        objetos.setOnClickListener {
            val intent = Intent(this, Objetos_Actividades::class.java)
            startActivity(intent)
        }

        val examen = findViewById<Button>(R.id.ButtonExamen_final)
        examen.setOnClickListener {
            val intent = Intent(this, Examen::class.java)
            startActivity(intent)
        }

        val BtnAtras = findViewById<ImageButton>(R.id.Btnatras)
        BtnAtras.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}