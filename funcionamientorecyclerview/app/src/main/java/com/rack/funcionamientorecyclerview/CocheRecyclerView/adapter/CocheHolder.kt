package com.rack.funcionamientorecyclerview.CocheRecyclerView.adapter
//Clase que preparara cada item de la lista
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rack.funcionamientorecyclerview.CocheRecyclerView.Coche
import com.rack.funcionamientorecyclerview.R

class CocheHolder(view: View): RecyclerView.ViewHolder(view) {
    val cocheNombre = view.findViewById<TextView>(R.id.nombreCoche)
    val cocheDescripcion = view.findViewById<TextView>(R.id.descripcionCoche)
    val cochePrecio = view.findViewById<TextView>(R.id.precioCoche)
    val cocheImg = view.findViewById<ImageView>(R.id.imgCoche)

    fun render(cocheModel: Coche){
        cocheNombre.text = cocheModel.nombre
        cocheDescripcion.text = cocheModel.descripcion
        cochePrecio.text = cocheModel.precio.toString()

    }
}