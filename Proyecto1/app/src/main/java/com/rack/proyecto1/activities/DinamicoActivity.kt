package com.rack.proyecto1.activities

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rack.proyecto1.R

class DinamicoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dinamico)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Para poner elementos dentro de otro
        val objetivo = findViewById<LinearLayout>(R.id.aplicacion) //Tener el elemento padre
        val texto1 = TextView(this).apply{ //Crear el elemento a partir de su clase
            text = "asdf"
            layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            textSize = 30f
            //No se puede especificar un id desde aqui por eso hay que usar esa misma variable para referenciar al elemento
        }
        for (i in 0..2){
            val texto2 = TextView(this).apply{
                text = "asdasdfasdff"
                layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
                textSize = 40f
            }
            objetivo.addView(texto2)
        }


        objetivo.addView(texto1) //Agnadir el elemento creado al elemento padre


        View.inflate(this, R.layout.objeto_renderizable, objetivo) //Para agnadir el contenido de un xml en res/layout dentro de otro elemento

        objetivo.removeView(texto1) //Para eliminar un elemento

    }
}
