package com.rack.funcionamientorecyclerview

import android.os.Bundle
import android.util.Log
import android.widget.GridLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rack.funcionamientorecyclerview.CocheRecyclerView.Coche
import com.rack.funcionamientorecyclerview.CocheRecyclerView.CocheProvider
import com.rack.funcionamientorecyclerview.CocheRecyclerView.adapter.CocheAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initRecyclerView()
    }

    private fun initRecyclerView(){ //Inicializa el recycler view
        //val manager = LinearLayoutManager(this)
        val manager = GridLayoutManager(this, 2) //Por tabla y no por lista
        val decoration = DividerItemDecoration(this, manager.orientation) //Separador
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerCoches)
        recyclerView.layoutManager = manager
        recyclerView.adapter = CocheAdapter(CocheProvider.listaCoches, {coche -> onItemSelected(coche)})
        recyclerView.addItemDecoration(decoration)
        //adapter.updateList(CocheProvider.listaCoches) //Si hubiese que actualizar la lista
    }

    fun onItemSelected(coche: Coche){ //Se llama cuando se hace click en un item, devuelve ese item
        Log.i("nombre", coche.nombre)
    }
}