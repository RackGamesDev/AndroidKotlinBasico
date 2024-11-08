package com.rack.proyecto1.subpaquete

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListaSealedAdapter(private val objetos:List<ListaSealedAdapter>): RecyclerView.Adapter<ListaSealedHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaSealedHolder {

    }
    override fun onBindViewHolder(holder: ListaSealedHolder, position: Int) {

    }
    override fun getItemCount(): Int {
        return objetos.size
    }
}
