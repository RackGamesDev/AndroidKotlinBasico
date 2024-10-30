package com.rack.proyecto1.activities

import android.os.Bundle
import android.widget.Button //clase necesaria para usar Button mas abajo
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rack.proyecto1.R

class PrimeraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //funcion que se ejecuta al inicio (similar a main)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_primera) //especificando la parte visual de la activity (xml en res/layout/)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val boton1 = findViewById<Button>(R.id.boton1) //busca un elemento del xml de la vista para ponerlo en la variable, hace falta importar ese widget
        val editText1 = findViewById<EditText>(R.id.editText1)

    }
}
