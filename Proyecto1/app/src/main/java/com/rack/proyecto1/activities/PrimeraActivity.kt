package com.rack.proyecto1.activities

import android.content.Intent //necesario para pasar entre pantallas
import android.os.Bundle
import android.util.Log
import android.widget.Button //clase necesaria para usar Button mas abajo
import android.widget.EditText
import android.widget.TextView
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

        val boton1 = findViewById<Button>(R.id.boton1) //busca un elemento del xml de la vista para ponerlo en la variable, hace falta importar ese widget (todos los elementos que vallan a interactuar con el codigo deberian tener id)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val texto1 = findViewById<TextView>(R.id.texto1)
        boton1.setOnClickListener { //se ejecuta cuando ocurra el evento de ese elemento
            val textoo = editText1.text.toString() //recibir el texto
            if(textoo.isNotEmpty()){
                Log.i("boton1", "click  ${textoo}") //hacer print con logcat
                texto1.text = textoo //cambiar el texto del elemento
                val intent = Intent(this, SegundaPantalla::class.java) //declara un intent para pasar a otra pantalla
                intent.putExtra("EXTRA_TEXTO", textoo) //poner una variable para que la pueda leer la otra pantalla
                startActivity(intent) //ejecutar el intent para pasar a otra pantalla finalmente (si le das a atras vuelve)
            }

        }
    }
}
