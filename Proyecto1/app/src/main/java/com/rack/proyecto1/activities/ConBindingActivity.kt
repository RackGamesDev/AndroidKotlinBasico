package com.rack.proyecto1.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rack.proyecto1.R
import com.rack.proyecto1.databinding.ActivityConBindingBinding
//Para activar el binding y evitar usar el findViewById hay que editar build.gradle.kts(Module:app) en vista android y sincronizar gradle
class ConBindingActivity : AppCompatActivity() {
    //Para que una activity tenga binding su nombre tiene que acabar en activity
    private lateinit var binding: ActivityConBindingBinding //Esta clase es "Activity" + nombre sin el "Activity" + "Binding" (se puede crear sola al activar el binding en el proyecto)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConBindingBinding.inflate(layoutInflater) //Inicializar el binding
        setContentView(binding.root)
        //enableEdgeToEdge()

        binding.boton1.setOnClickListener { //Gracias al binding se pueden acceder directamente a los elementos con su id sin hacer variables extra
            Log.i("msg", "aaaa")
        }
    }
}