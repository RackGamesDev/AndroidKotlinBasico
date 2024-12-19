package com.rack.proyecto1.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rack.proyecto1.R
import com.rack.proyecto1.databinding.ActivityConBindingBinding
import com.rack.proyecto1.databinding.ActivityUsoRetrofitBinding
import retrofit2.Retrofit
import retrofit2.Converter.GsonConverterFactory

//Retrofit2 es una libreria externa para consumir apis y hacer peticiones, y formatear json
class UsoRetrofitActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUsoRetrofitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsoRetrofitBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    private fun getRetrofit(): Retrofit{
        val retrofit = Retrofit.Builder().baseUrl("https://superheroapi.com/").addConverterFactory(GsonConverterFactory.create()).build()
    }
}