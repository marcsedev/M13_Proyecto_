package com.example.m13_proyecto.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.m13_proyecto.Mensaje
import com.example.m13_proyecto.R

class MensajeAdapter (private val mensajeList: List<Mensaje>): RecyclerView.Adapter<MensajeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensajeViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        return MensajeViewHolder(layoutInflater.inflate(R.layout.item_mensaje,parent,false))
    }

    override fun onBindViewHolder(holder: MensajeViewHolder, position: Int) {
        val itemM = mensajeList[position]
        holder.render(itemM)
    }

    override fun getItemCount(): Int=mensajeList.size


}
