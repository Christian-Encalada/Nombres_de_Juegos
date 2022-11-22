package com.example.recyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.recyclerview.Informacion
import com.example.recyclerview.R

class InformacionViewHolder(view: View): ViewHolder(view) {

    val nombreper =  view.findViewById<TextView>(R.id.tvNombre)
    val edadbreper =  view.findViewById<TextView>(R.id.tvedad)
    val estaturaaper =  view.findViewById<TextView>(R.id.tvestatura)
    val imagen = view.findViewById<ImageView>(R.id.ivImagen)
    val nacionalidadper = view.findViewById<TextView>(R.id.tvnacionalidad)

    fun render(infoModel: Informacion){
        nombreper.text = infoModel.nombre
        edadbreper.text = infoModel.edad.toString()
        estaturaaper.text = infoModel.estatura
        nacionalidadper.text = infoModel.nacionalidad

        Glide.with(imagen.context).load(infoModel.imagen).into(imagen)


    }
}