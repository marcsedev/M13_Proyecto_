package com.example.m13_proyecto.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.m13_proyecto.Alumnado
import com.example.m13_proyecto.R

//estos son los métodos
class AlumnadoAdapter ( private val alumnadoList:List<Alumnado>,) : RecyclerView.Adapter<AlumnadoViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnadoViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return AlumnadoViewHolder(layoutInflater.inflate(R.layout.item_alumnado, parent,false))
    }

    override fun onBindViewHolder(holder: AlumnadoViewHolder, position: Int) {
        val item = alumnadoList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int =alumnadoList.size

//cambio
}


