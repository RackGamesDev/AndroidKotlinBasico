package com.rack.funcionamientorecyclerview.CocheRecyclerView.adapter
//Clase que preparara cada item de la lista
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
import com.rack.funcionamientorecyclerview.CocheRecyclerView.Coche
import com.rack.funcionamientorecyclerview.R

class CocheHolder(view: View): RecyclerView.ViewHolder(view) {
    val cocheNombre = view.findViewById<TextView>(R.id.nombreCoche)
    val cocheDescripcion = view.findViewById<TextView>(R.id.descripcionCoche)
    val cochePrecio = view.findViewById<TextView>(R.id.precioCoche)
    val cocheImg = view.findViewById<ImageView>(R.id.imgCoche)
    val botonVer = view.findViewById<TextView>(R.id.botonVer)

    fun render(cocheModel: Coche, onClickListener:(Coche) -> Unit){
        //Moldear el view (que es un xml aparte segun ese item)
        cocheNombre.text = cocheModel.nombre
        cocheDescripcion.text = cocheModel.descripcion
        cochePrecio.text = cocheModel.precio.toString()
        //Glide.with(cocheImg.context).load(cocheModel.foto).into(cocheImg)
        botonVer.setOnClickListener{
            Toast.makeText(botonVer.context, cocheModel.nombre, Toast.LENGTH_LONG).show()
        }
        itemView.setOnClickListener{
            onClickListener(cocheModel) //Devolviendo al adapter los datos del item mediante una funcion lambda
        }//itemView haria referencia al item entero (el xml)
    }
}