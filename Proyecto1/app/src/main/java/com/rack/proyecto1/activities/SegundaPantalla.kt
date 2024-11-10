package com.rack.proyecto1.activities

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.rack.proyecto1.R
import com.rack.proyecto1.cosasrecycler.ListaSealedAdapter
import com.rack.proyecto1.cosasrecycler.ObjetoSealed

class SegundaPantalla : AppCompatActivity() {

    private lateinit var rv: RecyclerView
    private lateinit var adaptador: ListaSealedAdapter
    private val objetoss = listOf(ObjetoSealed.Objeto1, ObjetoSealed.Objeto2, ObjetoSealed.Otro)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda_pantalla)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        adaptador = ListaSealedAdapter(objetoss)


        val resultado = findViewById<TextView>(R.id.resultado)
        val texto:String = intent.extras?.getString("EXTRA_TEXTO").orEmpty() //recibir la variable del intent teniendo cuidado con los nulos (ya viene creado)
        val boton1:Button = findViewById<Button>(R.id.boton1)
        boton1.setOnClickListener {
            finish() //volver a la pantalla anterior
        }
        resultado.text = texto


    }
}