package com.rack.proyecto1.cosasrecycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rack.proyecto1.R
import android.view.View
import android.widget.TextView

class ListaSealedAdapter(private val objetos:List<ListaSealedAdapter>): RecyclerView.Adapter<ListaSealedHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaSealedHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ListaSealedHolder(view)
    }
    override fun onBindViewHolder(holder: ListaSealedHolder, position: Int) {
        holder.render(objetos[position])
    }
    override fun getItemCount(): Int {
        return objetos.size
    }
}


class ListaSealedHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val nombre: TextView = view.findViewById(R.id.nombreCaja)
    fun render(objeto: ListaSealedAdapter){
        nombre.text = "aaa"
    }
}
sealed class ObjetoSealed {
    object Objeto1 : ObjetoSealed()
    object Objeto2 : ObjetoSealed()
    object Otro : ObjetoSealed()

}
