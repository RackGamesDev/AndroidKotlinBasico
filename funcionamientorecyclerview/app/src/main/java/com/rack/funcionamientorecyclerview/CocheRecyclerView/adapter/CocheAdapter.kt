package com.rack.funcionamientorecyclerview.CocheRecyclerView.adapter
//Clase adaptadora del recycler view
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rack.funcionamientorecyclerview.CocheRecyclerView.Coche
import com.rack.funcionamientorecyclerview.R

class CocheAdapter(private var listaCoches:List<Coche>, private val onClickListener:(Coche) -> Unit): RecyclerView.Adapter<CocheHolder>() {

    fun updateList(list: List<Coche>){ //Actualizar la lista
        listaCoches = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CocheHolder {
        val layoutInflater = LayoutInflater.from(parent.context) //Inflater que crea la vista de ese item
        return CocheHolder(layoutInflater.inflate(R.layout.item_coche, parent, false))
    }

    override fun getItemCount(): Int = listaCoches.size //Funcion que devuelve el tamagno de la lista

    override fun onBindViewHolder(holder: CocheHolder, position: Int) { //Se ejecuta por cada item impreso
        val item = listaCoches[position]
        holder.render(item, onClickListener)
    }
}