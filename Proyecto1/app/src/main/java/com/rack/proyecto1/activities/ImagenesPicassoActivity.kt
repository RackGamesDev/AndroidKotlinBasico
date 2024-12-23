package com.rack.proyecto1.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rack.proyecto1.R
import com.rack.proyecto1.databinding.ActivityConBindingBinding
import com.rack.proyecto1.databinding.ActivityImagenesPicassoBinding
import com.squareup.picasso.Picasso

class ImagenesPicassoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImagenesPicassoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImagenesPicassoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Picasso.get().load("https://imgur.com/B8q66JB.png").into(binding.imagen) //Con la libreria picasso se pueden cargar facilmente imagenes desde urls a la view
    }
}