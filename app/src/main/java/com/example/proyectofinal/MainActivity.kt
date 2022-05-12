package com.example.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.iniciar2)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Contenido::class.java)
            startActivity(intent)
        }
    }
//    fun animales (view: View){
//        intent =  Intent(view.context,Animales::class.java)
//        startActivity(intent)
//    }

//    fun iniciar (view: View){
//        intent =  Intent(view.context,Contenido::class.java)
//        startActivity(intent)
//
//    }

}