package com.rack.proyecto1.activities

import android.app.Dialog
import android.content.Intent //necesario para pasar entre pantallas
import android.os.Bundle
import android.util.Log
import android.widget.Button //clase necesaria para usar Button mas abajo
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.RangeSlider
import com.rack.proyecto1.R
import com.rack.proyecto1.consumoApi.UsoRetrofitActivity

class PrimeraActivity : AppCompatActivity() {


    private var numero:Int = 0 //Variable que se inicializa en el codigo de una vista, al estar en una clase deberia ser private
    private lateinit var elementoCarta:CardView //Variable que se inicializa cuando cargue la view
    private lateinit var rango1: RangeSlider
    private lateinit var recyclerView:RecyclerView
    private fun initComponents(){ //Funcion para inicializar las variables lateinit cuando se cargue la vista (se podria hacer en la funcion onCreate)
        elementoCarta = findViewById(R.id.card1) //Inicializando cada variable lateinit
        rango1 = findViewById(R.id.rango1)
    }


    override fun onCreate(savedInstanceState: Bundle?) { //Funcion que se ejecuta al inicio (similar a main)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_primera) //Especificando la parte visual de la activity (xml en res/layout/)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initComponents() //Llamara la funcion para inicializar las variables lateinit



        val boton1: Button = findViewById<Button>(R.id.boton1) //Busca un elemento del xml de la vista para ponerlo en la variable, hace falta importar ese widget (todos los elementos que vallan a interactuar con el codigo deberian tener id)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val texto1 = findViewById<TextView>(R.id.texto1)
        print(R.color.gray) //Lo mismo que meterse en app/res/values/cualquier xml y recoger un valor (por ejemplo tambien de strings.xml)

        Toast.makeText(texto1.context, "mensaje", Toast.LENGTH_SHORT).show() //Mostrar un mensaje emergente, necesita el contexto de algun item en la view

        boton1.setOnClickListener { //Se ejecuta cuando ocurra el evento de ese elemento
            val textoo = editText1.text.toString() //Recibir el texto
            texto1.setTextColor(ContextCompat.getColor(this, R.color.gray)) //Cambiar el color del texto, se pueden cambiar casi todas las propiedades de los componentes
            if (textoo.isNotEmpty()) {
                Log.i("boton1", "click  ${textoo}") //Hacer print con logcat
                texto1.text = textoo //Cambiar el texto del elemento
                if (textoo == "a"){
                    startActivity(Intent(this, ConBindingActivity::class.java))
                } else if(textoo == "b"){
                    startActivity(Intent(this, UsoRetrofitActivity::class.java))
                } else if(textoo == "c"){
                    startActivity(Intent(this, ImagenesPicassoActivity::class.java))
                } else if(textoo == "d"){
                    startActivity(Intent(this, GuardarAjustesActivity::class.java))
                }
            } else {
                val intent = Intent(this, SegundaPantalla::class.java) //Declara un intent para pasar a otra pantalla
                intent.putExtra("EXTRA_TEXTO", textoo) //Poner una variable para que la pueda leer la otra pantalla
                startActivity(intent) //Ejecutar el intent para pasar a otra pantalla finalmente (si le das a atras vuelve)
            }
        }

        rango1.addOnChangeListener { slider, value, fromUser -> //Listener con variables de entrada (en este caso cuando cambia el valor) (si una variable no se va a usar se cambia el nombre por _ )
            texto1.text = value.toString()
        }
        findViewById<SearchView>(R.id.busqueda).setOnQueryTextListener(object : SearchView.OnQueryTextListener { //Para saber cuando se busco con SearchView se hace asi
            override fun onQueryTextSubmit(query: String?): Boolean {
                println("se busca $query")
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                println("se actualiza el texto")
                return false
            }
        })

        val radios: RadioGroup = findViewById(R.id.radioGroup1)
        val radioSeleccoinado: RadioButton = findViewById(radios.checkedRadioButtonId) //Saber el id del radio seleccionado

        val boton3: Button = findViewById<Button>(R.id.boton3)
        boton3.setOnClickListener {
            val intent = Intent(this, DinamicoActivity::class.java)
            startActivity(intent)
        }

        val boton4: Button = findViewById<Button>(R.id.boton4)
        boton4.setOnClickListener {
            //Codigo para mostrar un dialogo basado en un xml
            val dialogo = Dialog(this)
            dialogo.setContentView(R.layout.dialogo_prueba)
            val botonDialogo: Button = dialogo.findViewById(R.id.aceptarDialogo1) //Buscar elementos en el dialogo (porque es una view)
            botonDialogo.setOnClickListener {
                //dialogo.dismiss() //Cerrar el dialogo
                dialogo.hide() //Ocultar el dialogo
            }
            dialogo.show() //Mostrarlo finalmente
        }



    }
}
