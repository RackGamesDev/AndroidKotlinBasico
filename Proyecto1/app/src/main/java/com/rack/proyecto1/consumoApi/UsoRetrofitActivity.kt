package com.rack.proyecto1.consumoApi

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.rack.proyecto1.databinding.ActivityUsoRetrofitBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Retrofit2 es una libreria externa para consumir apis y hacer peticiones, y formatear json
class UsoRetrofitActivity : AppCompatActivity() {
    private lateinit var retrofit: Retrofit
    private lateinit var binding: ActivityUsoRetrofitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsoRetrofitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener {
            retrofit = getRetrofit("https://superheroapi.com/") //Declarar el objeto retrofit con la url base
            binding.progreso.isVisible = true
            var busqueda:String = binding.input.text.toString()
            if (busqueda == "") busqueda = "a"
            CoroutineScope(Dispatchers.IO).launch{ //Ejecuta una corrutina en el hilo especificado (para peticiones se suele usar el IO)
                val respuesta: Response<ItemDataResponse> = retrofit.create(ApiService::class.java).getItem(busqueda) //Envia la peticion y guarda la respuesta
                if (respuesta.isSuccessful){
                    Log.i("respuesta", "si que funciona")
                    val objetoRespuesta: ItemDataResponse? = respuesta.body() //El body como json parseado a ItemDataResponse
                    if (objetoRespuesta != null){
                        Log.i("respuesta", objetoRespuesta.toString())
                        if (objetoRespuesta.items.isNotEmpty()){
                            Log.i("primer id", objetoRespuesta.items[0].itemId)
                            runOnUiThread{ //La interfaz no puede ser modificada desde otro hilo
                                binding.texto.text = objetoRespuesta.items[0].itemId //Accediendo a una posicion del array que hay en el json de la respuesta
                            }
                        }
                    }
                } else {
                    Log.i("error", "peticion fallida")
                }
                runOnUiThread {
                    binding.progreso.isVisible = false
                }
            }
        }

    }

    private fun getRetrofit(baseUrl:String): Retrofit{ //Funcion que devuelve el objeto retrofit a partir de una url a la que hacer las peticiones
        return Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build()
    }
}