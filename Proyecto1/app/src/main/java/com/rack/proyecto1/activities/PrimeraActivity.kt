package com.rack.proyecto1.activities

import android.content.Intent //necesario para pasar entre pantallas
import android.os.Bundle
import android.util.Log
import android.widget.Button //clase necesaria para usar Button mas abajo
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.RangeSlider
import com.rack.proyecto1.R

class PrimeraActivity : AppCompatActivity() {


    private var numero:Int = 0 //variable que se inicializa en el codigo de una vista, al estar en una clase deberia ser private
    private lateinit var elementoCarta:CardView //variable que se inicializa cuando cargue la view
    private lateinit var rango1: RangeSlider
    private lateinit var recyclerView:RecyclerView
    private fun initComponents(){ //funcion para inicializar las variables lateinit cuando se cargue la vista (se podria hacer en la funcion onCreate)
        elementoCarta = findViewById(R.id.card1) //inicializando cada variable lateinit
        rango1 = findViewById(R.id.rango1)
    }


    override fun onCreate(savedInstanceState: Bundle?) { //funcion que se ejecuta al inicio (similar a main)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_primera) //especificando la parte visual de la activity (xml en res/layout/)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initComponents() //llamara la funcion para inicializar las variables lateinit

        val boton1 = findViewById<Button>(R.id.boton1) //busca un elemento del xml de la vista para ponerlo en la variable, hace falta importar ese widget (todos los elementos que vallan a interactuar con el codigo deberian tener id)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val texto1 = findViewById<TextView>(R.id.texto1)
        print(R.color.gray) //lo mismo que meterse en app/res/values/cualquier xml y recoger un valor (por ejemplo tambien de strings.xml)
        boton1.setOnClickListener { //se ejecuta cuando ocurra el evento de ese elemento
            val textoo = editText1.text.toString() //recibir el texto
            texto1.setTextColor(ContextCompat.getColor(this, R.color.gray)) //cambiar el color del texto, se pueden cambiar casi todas las propiedades de los componentes
            if (textoo.isNotEmpty()) {
                Log.i("boton1", "click  ${textoo}") //hacer print con logcat
                texto1.text = textoo //cambiar el texto del elemento
            } else {
                val intent = Intent(this, SegundaPantalla::class.java) //declara un intent para pasar a otra pantalla
                intent.putExtra("EXTRA_TEXTO", textoo) //poner una variable para que la pueda leer la otra pantalla
                startActivity(intent) //ejecutar el intent para pasar a otra pantalla finalmente (si le das a atras vuelve)
            }
        }
        rango1.addOnChangeListener { slider, value, fromUser -> //listener con variables de entrada (en este caso cuando cambia el valor) (si una variable no se va a usar se cambia el nombre por _ )
            texto1.text = value.toString()
        }
        val boton3 = findViewById<Button>(R.id.boton3)
        boton3.setOnClickListener {
            val intent = Intent(this, DinamicoActivity::class.java)
            startActivity(intent)
        }

    }

}
